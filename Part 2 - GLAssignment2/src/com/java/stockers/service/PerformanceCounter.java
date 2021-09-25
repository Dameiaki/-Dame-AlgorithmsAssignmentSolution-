package com.java.stockers.service;

public class PerformanceCounter {
	public void performanceCounterRise(boolean[] stockPerformance) {
		int countTrue = 0;
		for (int i = 0; i < stockPerformance.length; i++) {
			if (stockPerformance[i] == true) {
				countTrue++;
			}
		}
		System.out.println(countTrue);
	}

	public void performanceCounterFall(boolean[] stockPerformance) {
		int countFalse = 0;
		for (int i = 0; i < stockPerformance.length; i++) {
			if (stockPerformance[i] == false) {
				countFalse++;
			}
		}
		System.out.println(countFalse);
	}

}
