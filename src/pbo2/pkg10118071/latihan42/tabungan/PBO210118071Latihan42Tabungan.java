/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     jumlah saldo
 * 
 */
public class PBO210118071Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        
        int saldo;
        
        System.out.print("Masukkan Saldo Awal \t : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        saldo = input.nextInt();
        
        System.out.println("Saldo anda sekarang \t : " + tabungan.ambilUang(saldo));
        
    }
    
}
