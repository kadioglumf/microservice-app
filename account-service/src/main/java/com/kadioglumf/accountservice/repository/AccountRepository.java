package com.kadioglumf.accountservice.repository;

import com.kadioglumf.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kadioglumf
 */
@Repository
public interface AccountRepository extends CassandraRepository<Account, String>
{
}
