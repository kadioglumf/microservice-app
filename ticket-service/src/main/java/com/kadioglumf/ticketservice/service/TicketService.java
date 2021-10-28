package com.kadioglumf.ticketservice.service;

import com.kadioglumf.ticketservice.dto.TicketDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author kadioglumf
 */
public interface TicketService
{
    TicketDto save(TicketDto ticketDto);
    TicketDto update(String id, TicketDto ticketDto);
    Page<TicketDto> getPagination(Pageable pageable);
    TicketDto getById(String ticketId);

}
