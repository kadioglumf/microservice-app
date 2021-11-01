package com.kadioglumf.ticketservice.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author kadioglumf
 */
@Getter
public enum TicketStatus
{
    OPEN("Açık"),
    IN_PROGGRES("İşleniyor"),
    RESOLVED("Çözüldü"),
    CLOSED("Kapatıldı");

    private String label;

    TicketStatus(String label)
    {
        this.label = label;
    }
}
