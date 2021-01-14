/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.util.Scanner;
/**
 *
 * @author LaptopKU
 */
public class main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int harga;
        int opsi;
        System.out.println("Pilih tiket:");
        
        tiket Tiket = new tiket();
        System.out.println("1. Tiket Pesawat    = Rp 585.000");
        System.out.println("2. Tiket Kereta Api = Rp 332.000");
        System.out.println("3. Tiket Bus        = Rp 190.000");
        System.out.println("4. Air Space        = Rp 1.333.999");
        opsi = scan.nextInt();
        while(opsi!=6){    
            
            opsi = scan.nextInt();
            if(opsi == 6) System.out.println("Terimakasih");
        }
    }
    
}
