package com.kadioglumf.ticketservice.entity;

import lombok.Getter;

/**
 * @author kadioglumf
 */
@Getter
public enum PriorityType
{
    URGENT("Acil"),
    LOW("Önemsiz"),
    HIGH("Yüksek Öncelikli");

    private String label;

    PriorityType(String label)
    {
        this.label = label;
    }
}
