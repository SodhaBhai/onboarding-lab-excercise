package com.amdocs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SavingAccountTest {
	@Test
	public void testWithdrawQhenCurrentBalanceIs5000INR() {
		
		SavingAccount account = new SavingAccount();
		
		SavingAccount accountSpy = spy (account );
		 doReturn (5000.00).when(accountSpy).getBalance();
		 doNothing().when( accountSpy ).updateBalanaceIntoDB(anyDouble());
		 
		 double updateBalance = accountSpy.withdraw (1000.00);
		 double expectedBalance = 4000.00;
		 
		 assertEquals( expectedBalance, updateBalance,0.001);
		 
		 verify (accountSpy , times(1)).getBalance();
		 //check if upadteBalanceIntoDbB method was invoked exactly once wihting withdraw 
		 verify(accountSpy,times(1)).updateBalanaceIntoDB(anyDouble());
	}
}
