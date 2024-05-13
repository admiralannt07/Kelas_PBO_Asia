/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.asiapertemuan6.strukturkontrol1;

import java.util.Scanner;

/**
 *
 * @author A-15
 */
public class strukturkontrol1Lat2 {
        public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int variabel2 = inputNilaiInteger("variabel2");
        int variabel3 = inputNilaiInteger("variabel3");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");

        if (variabel1 < variabel2) {
            System.out.println("Variabel1 = " + variabel1 + " kurang dari batasBawah yang bernilai " + batasBawah);
        }

        if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("Variabel1 = " + variabel1 + " kurang dari batasBawah yang bernilai " + batasBawah + " dan kurang dari batasAtas juga yang bernilai: " + batasAtas);
        }

        if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara batasBawah dan batasAtas");
        }

        if (variabel1 > variabel2 && variabel1 < variabel3) {
            System.out.println("Variabel berada di antara nilai variabel2 dan variabel3.");
        }
    }

    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Inputkan nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
}
