package com.simplebank.simplebank;

import org.springframework.web.bind.annotation.RestController;

import com.simplebank.simplebank.model.AccountRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @GetMapping("/{accountNumber}")
    public String getAccountInfo(@PathVariable String accountNumber) {
        return accountNumber + " is a Savings Account";
    }

    @PostMapping("/accounts/create")
    public ResponseEntity<String> createAccount(@RequestBody AccountRequest accountRequest) {
        // TODO: more validation logic
        if (accountRequest.getAccountName() == "" 
        || accountRequest.getAccountNumber()=="" 
        || accountRequest.getInitialBalance() <  0 
        || accountRequest.getAccountType()=="") {
            return new ResponseEntity<>("Account request validation failed", HttpStatus.BAD_REQUEST);
        }

        // For simplicity, just printing the received account details
        System.out.println("Received account details: " + accountRequest);

        // You can perform account creation logic here
        // For example, you might want to save the account details to a database

        // Return a success response
        return new ResponseEntity<>("Account created successfully with account number "+accountRequest.getAccountNumber(), HttpStatus.CREATED);
    }


    
}
