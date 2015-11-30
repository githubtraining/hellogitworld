package main.java.com.github;

import java.util.Scanner;

public class Sum {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("רשום מספר: " +i);
			sum+= reader.nextInt();
		}
		System.out.println(sum);
	}

}
