package com.simplebank.simplebank;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AccountController {
    @GetMapping("/accounts/{accountNumber}")
    public String getAccountInfo(@PathVariable String accountNumber) {
        return accountNumber + " is a Savings Account";
    }

    @GetMapping("/accounts/{accountNumber}")
    public String createAccount(@PathVariable String accountNumber) {
        return accountNumber + " is a Savings Account";
    }


    
}
