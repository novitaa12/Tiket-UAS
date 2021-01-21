/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiket;
import java.util.Scanner;
/**
 *
 * @author LaptopKU
 */
public class NewMain {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        Mesin mesin = new Mesin();
        
        System.out.print("Masukkan nama Anda = ");
        String name = input.nextLine();
        
        User user = new User(name);
        mesin.setUser(user);
        
        mesin.menu();
        System.out.print("Masukkan tiket yang anda pilih = ");
        String transportation = input.nextLine();
        mesin.setTransportation(transportation);
                
        System.out.print("Pilih tujuan anda = ");
        String location = input.nextLine();
        mesin.setLocation(location);
        
        mesin.diskon();
        mesin.print();

        
    }
    }
    

