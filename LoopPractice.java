package practice;

import java.util.Scanner;
//* Mystery Program - Try to guess what it does. (How's that *for industry standard clear comments?(While I can get away/*with it...))
public class LoopPractice {

public static void main(String[] args) {

System.out.println("How many questions do you still have about Java?");

Scanner in = new Scanner(System.in);

int num = in.nextInt();

System.out.println("May your questions diminish with each passing week!");

for (int i = 0; i < num; i++) {

  for (int j = num; j > i; j--) {

      System.out.print("? ");

  }

    System.out.println();

  }

System.out.println("All clear!");
}
}