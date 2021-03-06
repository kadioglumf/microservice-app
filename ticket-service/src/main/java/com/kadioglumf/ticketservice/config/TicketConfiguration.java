package com.kadioglumf.ticketservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author kadioglumf
 */
@Configuration
@EnableJpaRepositories("com.kadioglumf")
@EnableElasticsearchRepositories
@ComponentScan("com.kadioglumf")
public class TicketConfiguration
{
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
