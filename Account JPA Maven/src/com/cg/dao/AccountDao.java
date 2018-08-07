package com.cg.dao;


import com.cg.bean.Account1;
import com.cg.exception.AccountException;

public interface AccountDao {
	String createNewAccount(Account1 acc)throws AccountException;
	double showBalance(String mobileNo) throws AccountException;
	Account1 deposit(String mobileNo,double balance) throws AccountException;
	Account1 withdraw(String mobileNo,double balance) throws AccountException;
	Account1 printTransactionDetails(String mobileNo) throws AccountException;
	  public boolean fundTransfer(String sourceMobileNo,String destMobileNo,double transferAmount) throws AccountException;
	}
