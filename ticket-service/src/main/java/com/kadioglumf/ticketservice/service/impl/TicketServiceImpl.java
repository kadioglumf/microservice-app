package com.kadioglumf.ticketservice.service.impl;

import com.google.common.base.Preconditions;
import com.kadioglumf.ticketservice.dto.TicketDto;
import com.kadioglumf.ticketservice.entity.PriorityType;
import com.kadioglumf.ticketservice.entity.Ticket;
import com.kadioglumf.ticketservice.entity.TicketStatus;
import com.kadioglumf.ticketservice.entity.es.TicketModel;
import com.kadioglumf.ticketservice.repository.TicketRepository;
import com.kadioglumf.ticketservice.repository.es.TicketElasticRepository;
import com.kadioglumf.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kadioglumf
 */
@Component
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService
{

    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;
    private final TicketElasticRepository ticketElasticRepository;


    @Override
    @Transactional
    public TicketDto save(TicketDto ticketDto)
    {
        Ticket ticket = new Ticket();
        //TODO Account APi dan doğrula
        // ticket.setAssignee();
        Preconditions.checkNotNull(ticketDto.getDescription(),"Description boş olamaz");
        ticket.setDescription(ticketDto.getDescription());
        ticket.setNotes(ticketDto.getNotes());
        ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus()));
        ticket.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));
        ticket.setTicketDate(ticketDto.getTicketDate());
        ticket = ticketRepository.save(ticket);

        //elastic search modeli yarat
        TicketModel ticketModel = TicketModel.builder()
                .description(ticket.getDescription())
                .id(ticket.getId())
                .priorityType(ticket.getPriorityType().name())
                .ticketStatus(ticket.getTicketStatus().name())
                .ticketDate(ticket.getTicketDate()).build();
        ticketElasticRepository.save(ticketModel);
        ticketDto.setId(ticket.getId());
        return ticketDto;
    }

    @Override
    public TicketDto update(String id, TicketDto ticketDto)
    {
        return null;
    }

    @Override
    public Page<TicketDto> getPagination(Pageable pageable)
    {
        return null;
    }

    @Override
    public TicketDto getById(String ticketId)
    {
        return null;
    }
}
