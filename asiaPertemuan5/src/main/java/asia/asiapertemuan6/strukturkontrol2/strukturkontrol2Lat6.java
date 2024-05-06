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
public class strukturkontrol2Lat6 {
    // menambahkan do dan while tapi dengan konteks program yang sama dengan latihan 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Masukkan angka 1-7: ");
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Angka yang dimasukkan tidak valid.");
                    break;
            }

            System.out.print("Mau coba lagi? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}


