package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveN = 0;
        int negativeN = 0;
        double sum = 0;

        System.out.print("Enter number: ");
        int a = input.nextInt();

        while (a != 0) {
          if (a > 0) {
            positiveN++;
          } else {
            negativeN++;
          }

          sum = sum + a;

          System.out.print("Enter number: ");
          a = input.nextInt();                
        }
        double avg = sum / (positiveN + negativeN);

        System.out.println("Positive numbers: " + positiveN);
        System.out.println("Negative numbers: " + negativeN);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        


    }

}