package com.pool.period;

import java.time.Period;

public class PeriodGetChronology {

	public static void main(String[] args) {
		 Period period = Period.of(10,5,2);
	      System.out.println(period.getChronology());

	}

}
