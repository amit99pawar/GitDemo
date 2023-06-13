package PracticePrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number for multiplication table : ");
		
		int num = input.nextInt(); // Taking the input integer from user

		int[] a = new int[10]; // Declaring an array of size 10 //
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			a[i] = sum + num;
			sum = sum + num;
			System.out.println(a[i]);
		}
	}

}