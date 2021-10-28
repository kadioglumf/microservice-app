package com.kadioglumf.ticketservice.api;

import com.kadioglumf.ticketservice.dto.TicketDto;
import com.kadioglumf.ticketservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kadioglumf
 */
@RestController
@RequestMapping("/ticket")
public class TicketApi
{
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketDto> createTicket(@RequestBody TicketDto ticketDto)
    {
        return ResponseEntity.ok(ticketService.save(ticketDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TicketDto> updateTicket(@PathVariable("id") String id, @RequestBody TicketDto ticketDto)
    {
        return ResponseEntity.ok(ticketService.update(id, ticketDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketDto> getById(@PathVariable("id") String id)
    {
        return ResponseEntity.ok(ticketService.getById(id));
    }

    @GetMapping
    public ResponseEntity<Page<TicketDto>> getAll(Pageable pageable)
    {
        return ResponseEntity.ok(ticketService.getPagination(pageable));
    }
}
