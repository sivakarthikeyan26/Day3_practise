package day3;

import java.util.Scanner;

public class Smallest_element {

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
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (temp > arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println("The smalest element is "+temp);
		sc.close();

	}

}
