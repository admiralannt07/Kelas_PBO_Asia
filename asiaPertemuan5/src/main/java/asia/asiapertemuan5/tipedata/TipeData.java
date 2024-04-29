/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.asiapertemuan5.tipedata;
import java.util.Scanner;

/**
 *
 * @author A-15
 */
public class TipeData {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Tipe Data Numerik
        byte variabelTipeByte = 10;
        short variabelTipeShort = 20;
        int variabelTipeInteger = 30;
        long variabelTipeLong = 40L;
        float variabelTipeFloat = 3.14f;
        double variabelTipeDouble = 3.1415;
// Tipe Data Karakter
        char variabelTipeChar = 'A';
// Tipe Data Boolean
        boolean variabelTipeBoolean = true;
// Mencetak variabel ke console
        System.out.println("Tipe Data Numerik");
        System.out.println("Byte: " + variabelTipeByte);
        System.out.println("Short: " + variabelTipeShort);
        System.out.println("Int: " + variabelTipeInteger);
        System.out.println("Long: " + variabelTipeLong);
        System.out.println("Float: " + variabelTipeFloat);
        System.out.println("Double: " + variabelTipeDouble);
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + variabelTipeChar);
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + variabelTipeBoolean);
        // Memanipulasi variabel dengan input
        System.out.println("\nMasukkan nilai untuk variabel a (byte): ");
        variabelTipeByte = input.nextByte();
        System.out.println("Masukkan nilai untuk variabel b (short): ");
        variabelTipeShort = input.nextShort();
        System.out.println("Masukkan nilai untuk variabel c (int): ");
        variabelTipeInteger = input.nextInt();
        System.out.println("Masukkan nilai untuk variabel d (long): ");
        variabelTipeLong = input.nextLong();
        System.out.println("Masukkan nilai untuk variabel e (float): ");
        variabelTipeFloat = input.nextFloat();
        System.out.println("Masukkan nilai untuk variabel f (double): ");
        variabelTipeDouble = input.nextDouble();
        System.out.println("Masukkan nilai untuk variabel g (char): ");
        variabelTipeChar = input.next().charAt(0);
        System.out.println("Masukkan nilai untuk variabel h (boolean): ");
        variabelTipeBoolean = input.nextBoolean();
// Mencetak variabel ke console setelah dimanipulasi
        System.out.println("\nTipe Data Numerik setelah dimanipulasi");
        System.out.println("Byte: " + variabelTipeByte);
        System.out.println("Short: " + variabelTipeShort);
        System.out.println("Int: " + variabelTipeInteger);
        System.out.println("Long: " + variabelTipeLong);
        System.out.println("Float: " + variabelTipeFloat);
        System.out.println("Double: " + variabelTipeDouble);
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + variabelTipeChar);
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + variabelTipeBoolean);
    }
}
