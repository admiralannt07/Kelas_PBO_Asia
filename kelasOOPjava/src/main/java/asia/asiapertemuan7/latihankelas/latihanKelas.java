/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.asiapertemuan7.latihankelas;
import asia.asiapertemuan7.person.Person;

/**
 *
 * @author A-10
 */
public class latihanKelas {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Panduan menjadi Jawa yang Baik dan Benar";
        buku1.author.nama = "Cak Dave";
        buku2.judul = "Tutorial Gali Kubur v2.0";
        buku2.author.nama = "Wak Sugeng";
        
        // Buku 1
        System.out.println("================ Buku 1 ================");
        System.out.println("Judul: " + buku1.judul);
        buku1.author.sebutNama();
        System.out.println("Tahun Penerbitan: " +buku1.tahunterbit);
        System.out.println("Harga Beli: " + "Rp" + buku1.harga.beli);
        System.out.println("Harga Jual: " +  "Rp" + buku1.harga.jual);
        // Buku 2
        System.out.println("================ Buku 2 ================");
        System.out.println("Judul: " + buku2.judul);
        buku2.author.sebutNama();
        System.out.println("Tahun Penerbitan: " + buku2.tahunterbit);
        System.out.println("Harga Beli: " + "Rp" + buku2.harga.beli);            
        System.out.println("Harga Jual: " + "Rp" + buku2.harga.jual);
    }
}   

class Buku {
    String judul;
    Person author = new Person();
    int tahunterbit = 2024;
    Harga harga = new Harga();
}

class Harga {
    double jual = 10000.00;
    double beli = 9000.00;
}
