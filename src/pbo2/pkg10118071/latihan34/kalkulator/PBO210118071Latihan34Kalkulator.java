/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan34.kalkulator;

import java.util.Scanner;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program kalkulator
*                     dengan konsep pendekatan objek
* 
*/
public class PBO210118071Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator kalkulator = new Kalkulator();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = input.nextDouble();
        
        kalkulator.tambahBilangan();
        kalkulator.kurangBilangan();
        kalkulator.kaliBilangan();
        kalkulator.bagiBilangan();
        kalkulator.sisaBilangan();
    }
    
}
