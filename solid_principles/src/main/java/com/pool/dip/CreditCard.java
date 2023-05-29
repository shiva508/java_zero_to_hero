package com.pool.dip;

import com.pool.dip.solution.BankCard;

public class CreditCard implements BankCard{
	@Override
	public void buyItem(double ammount) {
		System.out.println("Buy using credit card");
	}
}
