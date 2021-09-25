package com.java.stockers.service;

public class MergeSortImplementation {
	public void mergeSortAs(double companies[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSortAs(companies, left, mid);
			mergeSortAs(companies, mid + 1, right);

			mergeAs(companies, left, mid, right);

		}
	}

	private void mergeAs(double[] companies, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int len1 = mid - left + 1;
		int len2 = right - mid;

		double leftarr[] = new double[len1];
		double rightarr[] = new double[len2];

		for (int i = 0; i < len1; i++)
			leftarr[i] = companies[left + i];
		for (int j = 0; j < len2; j++)
			rightarr[j] = companies[mid + 1 + j];

		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		while (i < len1 && j < len2) {
			if (leftarr[i] <= rightarr[j]) {
				companies[k] = leftarr[i];
				i++;
			} else {
				companies[k] = rightarr[j];
				j++;
			}
			k++;
		}

		while (i < len1) {
			companies[k] = leftarr[i];
			i++;
			k++;
		}

		while (j < len2) {
			companies[k] = rightarr[j];
			j++;
			k++;
		}

	}

	public void mergeSortDe(double[] companies, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSortDe(companies, left, mid);
			mergeSortDe(companies, mid + 1, right);

			mergeDe(companies, left, mid, right);

		}
	}

	private void mergeDe(double[] companies, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int len1 = mid - left + 1;
		int len2 = right - mid;

		double leftarr[] = new double[len1];
		double rightarr[] = new double[len2];

		for (int i = 0; i < len1; i++)
			leftarr[i] = companies[left + i];
		for (int j = 0; j < len2; j++)
			rightarr[j] = companies[mid + 1 + j];

		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		while (i < len1 && j < len2) {
			if (leftarr[i] >= rightarr[j]) {
				companies[k] = leftarr[i];
				i++;
			} else {
				companies[k] = rightarr[j];
				j++;
			}
			k++;

		}

		while (i < len1) {
			companies[k] = leftarr[i];
			i++;
			k++;

		}

		while (j < len2) {
			companies[k] = rightarr[j];
			j++;
			k++;

		}

	}

	public void display(double companies[]) {
		for (int i = 0; i < companies.length; i++) {
			System.out.println(companies[i]);
		}
	}

}
