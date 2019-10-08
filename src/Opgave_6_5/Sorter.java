package Opgave_6_5;

import java.util.Scanner;

public class Sorter {

    static protected String output;

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        if (num1 > num2) {
            double temp = num1;

            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;

            num2 = num3;
            num3 = temp;

        }

        if (num1 > num2) {
            double temp = num1;

            num1 = num2;
            num2 = temp;
        }

        output = "Resultatet er: \n" + num1 + " \n" + num2 + " \n" + num3;
        System.out.println(output);

    }

    public static void startProgram() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til programmet som kan ændre rækkefølgen på alle tal!");
        System.out.println("Du indtaster 3 tal i vilkårlig rækkefølge og du vil få vist det mindste til højeste tal");
        System.out.println("Du kan indtaste et kommetal som feks 7.36");
        System.out.print("Indtast det første tal: ");
        double num1 = scanner.nextDouble();
        System.out.print("Indtast det andet tal: ");
        double num2 = scanner.nextDouble();
        System.out.print("Indtast det tredje tal: ");
        double num3 = scanner.nextDouble();

        Sorter.displaySortedNumbers(num1, num2, num3);
    }

}
