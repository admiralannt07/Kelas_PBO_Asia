/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.asiapertemuan6.strukturkontrol2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-15
 */
public class strukturkontrol2Lat7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Tuliskan pesan di sini, saya akan tampilkan berulang." );
        System.out.println("Pesan: ");
        String message = keyboard.nextLine();

        //dua baris berikut untuk membuat bilangan random bertipe integer
        Random mesinRandom = new Random();
        int jumlahPengulangan = mesinRandom.nextInt(20) + 1;

        if(jumlahPengulangan < 10) {
            System.out.println("Pesan akan diulang sebanyak " + jumlahPengulangan + " kali");
        } else {
            System.out.println("Bilangan random yang didapat terlalu besar");
            jumlahPengulangan = 5;
            System.out.println("Pesan akan diulang " + jumlahPengulangan + " kali");
        }

        for (int n = 0; n < jumlahPengulangan; n++) {
            System.out.println(n + ". " + message);
        }
    }
}