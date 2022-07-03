package day3;

import java.util.Scanner;

public class Duplicate_elements {
	public boolean check(int[] arr1, int t) {
		if(arr1.length>0) {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]==t) {
					return true;
				}
			}
			return false;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int c=0;
		Duplicate_elements de = new Duplicate_elements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter the elements");
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			arr[i]=a;
		}
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(de.check(arr1,arr[i])!=true) {
					if(arr[i]==arr[j] && i!=j) {
						System.out.print(arr[i]+" ");
						arr1[c++]=arr[i];
						break;
					}
				}
			}
		}
		sc.close();
	}

}
