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
public class strukturkontrol2Lat3 {
    // mengubah inisialisasi variabel menjadi input, bukan value yang mentah
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of people variable (int)");
        int people = input.nextInt();
        
        System.out.println("Enter the value of car variable {int)");
        int cars = input.nextInt();
        
        System.out.println("Enter the value of bus variable {int)");
        int buses = input.nextInt();
        
        if (cars > people) {
            System.out.println("We should take the cars.");
        } else if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }
        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
    }
}
