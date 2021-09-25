package com.java.stockers.driver;

import java.util.Scanner;

import com.java.stockers.service.BinarySearchImplementation;
import com.java.stockers.service.MergeSortImplementation;
import com.java.stockers.service.PerformanceCounter;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MergeSortImplementation sort = new MergeSortImplementation();
		PerformanceCounter counter = new PerformanceCounter();
		BinarySearchImplementation search = new BinarySearchImplementation();
		System.out.println("Enter the number of Companies");
		int size = in.nextInt();
		double companies[] = new double[size];
		boolean stockperformance[] = new boolean[size];
		int option = 0;

		for (int i = 0; i < companies.length; i++) {
			System.out.println("\nEnter the current stock price of company " + (i + 1));
			companies[i] = in.nextDouble();

			System.out.println(
					"\nWhether company's stock price rose today compared to yesterday? Enter true for increase and false for decrease");
			stockperformance[i] = in.nextBoolean();
		}

		do {
			System.out.println("\n-----------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today.");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			option = in.nextInt();
			switch (option) {
			case 1:
				sort.mergeSortAs(companies, 0, size - 1);
				System.out.println("Stock prices in ascending order are :");
				sort.display(companies);
				break;

			case 2:
				sort.mergeSortDe(companies, 0, size - 1);
				System.out.println("Stock prices in descending order are :");
				sort.display(companies);
				break;

			case 3:
				System.out.print("Total no of companies whose stock price rose today : ");
				counter.performanceCounterRise(stockperformance);
				break;

			case 4:
				System.out.print("Total no of companies whose stock price declined today : ");
				counter.performanceCounterFall(stockperformance);
				break;

			case 5:
				System.out.println("Enter the key value");
				sort.mergeSortAs(companies, 0, size - 1);
				double key = in.nextDouble();
				search.binarySearch(companies, 0, size - 1, key);
				break;
			default:
				break;
			}

		} while (option != 0);
		System.out.println("Application closed");

		in.close();

	}

}
