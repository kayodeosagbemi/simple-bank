package com.simplebank.simplebank;

import org.springframework.web.bind.annotation.RestController;

import com.simplebank.simplebank.model.AccountRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @GetMapping("/{accountNumber}")
    public String getAccountInfo(@PathVariable String accountNumber) {
        //TODO: Read from the database
        if (accountNumber !=null && accountNumber.trim() !="") 
            return accountNumber + " is a Savings Account";
        else 
            return "account number is invalid: "+accountNumber;
    }

    @PostMapping("/")
    public ResponseEntity<String> createAccount(@RequestBody AccountRequest accountRequest) {
        // TODO: more validation logic
        if (accountRequest == null 
        || !accountRequest.isValid()) {
            return new ResponseEntity<>("Account request validation failed", HttpStatus.BAD_REQUEST);
        }

        //TODO: Save into a database

     
        // Return a success response
        return new ResponseEntity<>("Account created successfully with account number "+accountRequest.getAccountNumber(), HttpStatus.CREATED);
    }
    @PutMapping("/")
    public ResponseEntity<String> updateAccount(@RequestBody AccountRequest newAcctReq) {
        return new ResponseEntity<>("Successfully Updated Account");
    }
    @DeleteMapping("/{accountNumber}")
    public ResponseEntity<String> deleteAccount(@PathVariable String accountNumber) {
        return new ResponseEntity<>("Successfully Updated Account");
    }

    


    
}
