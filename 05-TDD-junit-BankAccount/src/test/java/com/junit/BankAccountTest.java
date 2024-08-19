package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.unit.BankAccount;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount();
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0, account.getBalance(), "Initial balance should be 0");
    }

    @Test
    public void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance(), "Balance should be 100 after depositing 100");
    }

    @Test
    public void testWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Balance should be 50 after withdrawing 50");
    }

   
}
/*
 * 4. Refactor
If the tests pass, you can now refactor your code if needed. The tests will help ensure that any refactoring doesn’t introduce new bugs
Write tests: Define the expected behavior of the BankAccount class.
Run tests: Tests will fail initially because the implementation isn’t there.
Implement the class: Write the BankAccount class to make the tests pass.
Run tests again: Ensure all tests pass with the new implementation.
Refactor: Improve your code while keeping your tests green.
*/
