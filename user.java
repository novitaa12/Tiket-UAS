/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiket;

import java.util.Scanner;

public class user {
    Scanner input = new Scanner (System.in);
    String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void input() {
    System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();  
        }
}
