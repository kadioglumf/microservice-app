package com.kadioglumf.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author kadioglumf
 */
@SpringBootApplication
@EnableEurekaClient
public class AccountServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
}
