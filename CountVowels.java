package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");

		String word = sc.next();
		Character[] vowels = new Character[] { 'a', 'e', 'i', 'o', 'u', 'y' };

		int vowelCount = 0;
		for (char c : word.toCharArray()) {
			if (Arrays.asList(vowels).contains(c))
				vowelCount++;
		}

		System.out.println(word + " has " + vowelCount + " vowels.");
	}
}