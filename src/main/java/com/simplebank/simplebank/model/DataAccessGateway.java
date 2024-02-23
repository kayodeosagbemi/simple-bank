package com.simplebank.simplebank.model;

import lombok.NoArgsConstructor;

/**
 * This class handles the persisting and recovery of all model instances to and from the 
 * datastore, H2
*/
@NoArgsConstructor
public class DataAccessGateway {
    public static boolean createAccount(AccountRequest req) {
        boolean status=false;
        // String name=req.getAccountName();
        // String number=req.getAccountNumber();
        // double bal = req.getInitialBalance();
        // String acctType = req.getAccountType();

       
        // String sqlInsert = "INSERT into account(accountName, accountNumber, accountType, initialBalance) " + 
        // "VALUES(@name, @number, @type, @balance)";
        
        return status;
    }
}
