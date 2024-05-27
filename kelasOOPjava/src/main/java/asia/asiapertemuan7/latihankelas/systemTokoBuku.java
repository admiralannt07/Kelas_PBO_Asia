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
// Nama : Ananta Deva
// NIM : 23201254
public class systemTokoBuku {
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
        buku1.harga.setJual(100000);
        System.out.println("Harga Beli: " + "Rp" + buku1.harga.getBeli());
        System.out.println("Harga Jual: " +  "Rp" + buku1.harga.getJual());
        buku1.terjual();
        // Buku 2
        System.out.println("================ Buku 2 ================");
        System.out.println("Judul: " + buku2.judul);
        buku2.author.sebutNama();
        System.out.println("Tahun Penerbitan: " + buku2.tahunterbit);
        buku2.harga.setJual(120000);
        System.out.println("Harga Beli: " + "Rp" + buku2.harga.getBeli());            
        System.out.println("Harga Jual: " + "Rp" + buku2.harga.getJual());
        buku2.terjual();
    }
}   

class Buku {
    String judul;
    Person author = new Person();
    int tahunterbit = 2024;
    Harga harga = new Harga();
    
    
   public void terjual(){
       System.out.println("Buku terjual dengan harga: " + "Rp" + harga.getBeli());
   }
}

class Harga {
    private double jual = 100000.00;
    private double beli = 90000.00;
    
    public double getBeli(){
        return beli;
    }
    
    public void setBeli(double beli){
        this.beli = beli;
    }
    
    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }
    
    
}
