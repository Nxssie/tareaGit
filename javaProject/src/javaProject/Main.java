package javaProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Set the value of n to do the addition of the n firsts numbers.");
        int n = keyboard.nextInt();

        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += (n+n^2)/2;
        }

        System.out.println(suma);

    }
}
