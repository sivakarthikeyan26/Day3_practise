package day3;

import java.util.Scanner;

public class Array_reverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}
		sc.close();

	}

}
