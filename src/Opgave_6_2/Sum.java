package Opgave_6_2;

public class Sum {

    public static int sumDigits(long n) { //Vi tager en variable kaldet n af typen long ind i vores parameter
        int sum = 0;
        int temp = (int)n; //Vi force caster vores long n til at være en int så vi kan arbejde med den

        while (temp != 0) { //Mens temp ikke er 0 AKA ikke er tom kører dette loop
            sum += (temp % 10); //Vi tager det bagerste tal i vores long n og plusser sammen med sum
            temp = temp / 10; //Vi fjerner det bagerste tal fra temp så vi kan udregne det næste tal
        }

        return sum; //Vi retunere sum
    }
}
