package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int positiveN = 0;
        int negativeN = 0;
        int number = input.nextInt(); 

  while (number != 0) {

    if (number > 0){
      positiveN++; 
    } else if (number < 0) {
      negativeN++;
    }
     sum = sum + number;
     avg = sum /(positiveN + negativeN);
     number = input.nextInt(); }  

    System.out.println("Positive numbers: " + positiveN);
    System.out.println("Negative numbers: " + negativeN);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);  
    }
}

    