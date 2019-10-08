package Opgave_6_5;

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

        output = "Resultatet er: " + num1 + " " + num2 + " " + num3;

    }

}
