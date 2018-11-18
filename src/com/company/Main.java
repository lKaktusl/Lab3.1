package com.company;

import java.util.Scanner;

/*      Создайте приложение, которое покажет, что для выражения
        a^n + b^n = c^n (теорема Ферма) нет натуральных решений от 1 до 100 и
        n>2. Убедитесь, что есть решения для n=2, и выведите их в консоль. */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the degree");
        double n = in.nextInt();

        boolean test = true;
             if (n > 2) {      
                 for (int a = 1; a < 100; a++) {
                     for (int b = a; b < 100; b++) {
                         for (int c = 0; c < 100; c++) {

                             if (Math.pow(a, n) + Math.pow(b, n) != Math.pow(c, n)) {
                                 test = false;
                             }
                         }
                     }
                 }
                    if ( !test  ) {
                         System.out.println("Fermat's theorem is true");
                 }  else {
                         System.out.println("Fermat's theorem is not true");
                 }
             }
             if (n == 2) {
                 for (int a = 1; a < 100; a++) {
                     for (int b = a; b < 100; b++) {
                         for (int c = 0; c < 100; c++) {
                             if (a*a + b*b == c*c) {
                                 System.out.println(a + "^2+" + b + "^2+=" + c + "^2");
                             }
                         }
                     }
                 }
             }

        }
    }

