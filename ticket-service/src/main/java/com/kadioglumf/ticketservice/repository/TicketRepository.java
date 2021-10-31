package com.kadioglumf.ticketservice.repository;

import com.kadioglumf.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kadioglumf
 */
public interface TicketRepository extends JpaRepository<Ticket, String>
{
}
