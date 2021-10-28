package com.kadioglumf.ticketservice.service.impl;

import com.kadioglumf.ticketservice.dto.TicketDto;
import com.kadioglumf.ticketservice.repository.TicketRepository;
import com.kadioglumf.ticketservice.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author kadioglumf
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService
{
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public TicketDto save(TicketDto ticketDto)
    {
        return null;
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
