package day3;

import java.util.Scanner;

public class Frequency_of_elements {
	public boolean check(int[] arr1, int t) {
		if (arr1.length > 0) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == t) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int count = 0;
		int c = 0;
		Frequency_of_elements fe = new Frequency_of_elements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (fe.check(arr1, arr[i]) != true) {
					if (arr[i] == arr[j]) {
						count += 1;
					}
				}
			}
			if(count!=0) {
				System.out.println("The frequency of " + arr[i] + " is " + count);
				count = 0;
				arr1[c++] = arr[i];
			}
		}
		sc.close();

	}

}
