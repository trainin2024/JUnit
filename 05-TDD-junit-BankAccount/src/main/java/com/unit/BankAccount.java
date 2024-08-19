package com.unit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class BankAccount {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(BankAccount.class);

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }
    /*
     * Logging Level - info
     * warn
     * error
     * Debug
     * */

    public void deposit(int amount) {
    	logger.info("Deposit method called");
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit called");
        logger.warn("Amount more than 100000 will be under special investigation");
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
        	 logger.error("Amount is greater than balance");
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        logger.debug("This is a debug message");
    }
}
