/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan34.kalkulator;

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
public class Kalkulator {
    public static double value1;
     public static double value2;
    
    public double tambahBilangan(){
        double hasil = value1 + value2;
        System.out.println("\nHasil Pertambahan : " + hasil);
        return hasil;
    }
    
    public double kurangBilangan(){
        double hasil = value1 - value2;
        System.out.println("Hasil Pengurangan : " + hasil);
        return hasil;
    }
    
    public double kaliBilangan(){
        double hasil = value1 * value2;
        System.out.println("Hasil Perkalian : " + hasil);
        return hasil;
    }
    
    public double bagiBilangan(){
        double hasil = value1 / value2;
        System.out.println("Hasil Pembagian : " + hasil);
        return hasil;
    }
    
    public double sisaBilangan(){
        double hasil = value1 % value2;
        System.out.println("Hasil Sisa : " + hasil);
        return hasil;
    }
}
