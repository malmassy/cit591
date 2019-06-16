package practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("The sum of every integer from 1 to " + n + " is " + sum);

	}

}
