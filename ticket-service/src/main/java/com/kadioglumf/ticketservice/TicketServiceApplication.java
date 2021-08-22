package com.kadioglumf.ticketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kadioglumf
 */
@SpringBootApplication
@EnableEurekaClient
public class TicketServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TicketServiceApplication.class, args);
    }
}
