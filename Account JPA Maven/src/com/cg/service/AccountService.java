package com.cg.service;

import com.cg.bean.Account1;
import com.cg.exception.AccountException;

public interface AccountService {
	String createNewAccount(Account1 acc)throws AccountException;
	double showBalance(String mobileNo) throws AccountException;
	Account1 deposit(String mobileNo,double depositAmt) throws AccountException;
	Account1 withdraw(String mobileNo,double withdrawAmt) throws AccountException;
	Account1 printTransactionDetails(String mobileNo) throws AccountException;
	boolean fundTransfer(String sourceMobileNo,String destMobileNo,double transferAmt) throws AccountException;

}