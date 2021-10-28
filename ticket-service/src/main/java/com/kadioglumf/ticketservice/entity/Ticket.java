package com.kadioglumf.ticketservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author kadioglumf
 */
@Entity
@Table(name = "tickets")
@Data
@EqualsAndHashCode(callSuper = true, of = "")
@ToString(callSuper = true, of = "")
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntityModel
{
    @Column(name = "description", length = 600)
    private String description;
    @Column(name = "notes", length = 4000)
    private String notes;
    @Column(name = "assignee", length = 50)
    private String assignee;
    @Column(name = "ticket_date")
    private Date ticketDate;
    @Column(name = "priority_type")
    @Enumerated(value = EnumType.STRING)
    private PriorityType priorityType;
    @Column(name = "ticket_status")
    @Enumerated(value = EnumType.STRING)
    private TicketStatus ticketStatus;
}
