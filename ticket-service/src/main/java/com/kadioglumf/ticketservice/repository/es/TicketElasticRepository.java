package com.kadioglumf.ticketservice.repository.es;

import com.kadioglumf.ticketservice.entity.es.TicketModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kadioglumf
 */
public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String>
{

}
