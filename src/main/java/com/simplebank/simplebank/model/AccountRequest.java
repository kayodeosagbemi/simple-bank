package com.simplebank.simplebank.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

// Model class to represent the JSON request body
public class AccountRequest {
    private String accountName;
    private String accountNumber;
    private double initialBalance;
    private String accountType;

    // getters and setters

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isValid() {
        return this.getAccountName() != "" 
        && this.getAccountNumber()!="" 
        && this.getInitialBalance() >  0 
        && this.getAccountType()!=""
        ;
    }

    @Override
    public String toString() {
        return "AccountRequest{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", initialBalance=" + initialBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
