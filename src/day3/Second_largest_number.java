package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Second_largest_number {
	public ArrayList<Integer> arr2 = new ArrayList<Integer>();
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	public void display(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
	

	public void second_largest(ArrayList<Integer> arr) {
		while(arr.size()!=0) {
			int temp = arr.get(0);
			for (int i = 1; i < arr.size(); i++) {
				if (temp > arr.get(i)) {
					temp = arr.get(i);
				}
			}
			arr2.add(temp);
			for (int i=0;i<arr.size();i++) {
				if(arr.get(i)==temp) {
					arr.remove(i);
					break;
				}
			}
		}
		System.out.println("The second largest is : "+arr2.get(arr2.size()-2));
		
	}


	public static void main(String[] args) {
		Second_largest_number  sa = new Second_largest_number ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			arr.add(b);
		}
		System.out.println("Values before sorting");
		sa.display(arr);
		sa.second_largest(arr);
		sc.close();

	}

}
