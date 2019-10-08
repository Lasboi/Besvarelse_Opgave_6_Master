package Opgave_6_6;

public class Patterns {

    public static void displayPattern(int n) {

        int padding = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < padding; j++) {
                System.out.print(" ");

            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            padding--;
        }

    }
}
