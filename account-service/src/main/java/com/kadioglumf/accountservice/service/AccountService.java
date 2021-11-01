package com.kadioglumf.accountservice.service;

import com.kadioglumf.client.contracts.AccountDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

/**
 * @author kadioglumf
 */
public interface AccountService
{
    AccountDto get(String id);
    AccountDto save(AccountDto accountDto);
    AccountDto update(String id, AccountDto accountDto);
    void delete(String id);
    Slice<AccountDto> findAll(Pageable pageable);
}
