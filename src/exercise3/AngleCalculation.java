package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle;
        char type;

       do {
         System.out.println("enter angle: ");
         angle = input.nextDouble();

         System.out.println("enter type: ");
         String symbole = input.next();
         type = symbole.charAt(0);

        if (type == 'r') {
          double newAngle = angle / Math.PI * 180;
          System.out.println("Angle: " + newAngle + "r");
        } else if (type == 'd') {
          double newAngle = angle * Math.PI / 180;
          System.out.println("Angle: " + newAngle + "r");
        }
       } while (type == 'd' || type == 'r');
    }
}