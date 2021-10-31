package com.kadioglumf.ticketservice.entity.es;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kadioglumf
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false, of = {"id"})
@Document(indexName = "ticket")
@NoArgsConstructor
@AllArgsConstructor
public class TicketModel implements Serializable
{
    @Id
    private String id;
    private String description;
    private String notes;
    private String assignee;
    private Date ticketDate;
    private String priorityType;
    private String ticketStatus;
}
