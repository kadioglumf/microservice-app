package com.kadioglumf.ticketservice.repository;

import com.kadioglumf.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kadioglumf
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket, String>
{
}
