package com.kadioglumf.ticketservice.entity;

/**
 * @author kadioglumf
 */
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
