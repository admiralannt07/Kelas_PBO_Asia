/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.asiapertemuan6.strukturkontrol2;
import java.util.Scanner;


/**
 *
 * @author A-15
 */


public class strukturkontrol2Lat5 {
    // Latihan 5 menyuruh kita menambahkan kondisi agar ketika user salah 
    // akan diberi tampilan apakah ingin mengulangi program dengan input y atau exit dengan input n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Enter a number (1-7): ");
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    repeat = false;
                    break;
                case 2:
                    System.out.println("Tuesday");
                    repeat = false;
                    break;
                case 3:
                    System.out.println("Wednesday");
                    repeat = false;
                    break;
                case 4:
                    System.out.println("Thursday");
                    repeat = false;
                    break;
                case 5:
                    System.out.println("Friday");
                    repeat = false;
                    break;
                case 6:
                    System.out.println("Saturday");
                    repeat = false;
                    break;
                case 7:
                    System.out.println("Sunday");
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid input number.");
                    System.out.print("Try again? (y/n): ");
                    char choice = scanner.next().charAt(0);
                    if (choice != 'y') {
                        repeat = false;
                    }
                    break;
            }
        }
        scanner.close();
    }
}
