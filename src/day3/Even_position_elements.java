package day3;

import java.util.Scanner;

public class Even_position_elements {

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
		for (int i = 0; i < n; i++) {
			if((i+1)%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();

	}

}
