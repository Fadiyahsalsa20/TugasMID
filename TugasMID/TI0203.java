/* Fadiyah Salsabila
 * 13020210203
 */

package com.mycompany.ti0203;

import java.util.Scanner;
public class TI0203 {
public static void main(String[] args) {
    double mil;
    Scanner in = new Scanner(System.in);
    System.out.println("Mil : ");
    mil = in.nextDouble();
    double meter = mil * 1.609;
    System.out.println("Hasil 5 mil = "+meter + " meter");
}
}