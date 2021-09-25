package com.java.stockers.service;

public class BinarySearchImplementation {
	public void binarySearch(double[] companies, int first, int last, double key) {
		int mid = (first + last) / 2;

		while (first <= last) {
			if (companies[mid] < key) {
				first = mid + 1;
			} else if (companies[mid] == key) {
				System.out.println("Stock Price of " + companies[mid] + " is present");
				break;
			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Stock Price of " + key + " is not present");
		}

	}

}
