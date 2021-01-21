/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiket;
//import java.util.Scanner;

public class Mesin {
    private User user;
    private String publicTransport;
    private String location;
    private int price;
    private int pay;
    
     
    public void setUser(User user) {
        this.user = user;
    }
    
    public void setTransportation(String transportation) {
        this.publicTransport = transportation;
        // Mengubah id transportasi menjadi nama transportasi
        transport(transportation);
        // Mendapatkan harga dari transportasi
        ticket(this.publicTransport);
    }
    
    public void setLocation(String location) {
        this.location = location;
        // Mengubahn id location menjadi nama location
        tjn(location);
    } 
    
    public void menu(){
       
        System.out.println("==============================");
        System.out.println("Pilih Tiket");
        System.out.println("1. Pesawat  585000");
        System.out.println("2. Kereta Api 332000");
        System.out.println("3. Bus 190000");
        System.out.println("4. Air Space 1333999");
        
        System.out.println("==============================");
        System.out.println("Pilih Tujuan");
        System.out.println("1. Jakarta");
        System.out.println("2. Bandung");
        System.out.println("3. Amerika");
        System.out.println("==============================");

    }  
    
    //pemilihan transportasi 
    public String transport (String pilih){
//        
        switch (pilih){
            case "1" :
                publicTransport = "Pesawat";
                break;
                
            case "2" :
                publicTransport = "Kereta Api";
                break;
                
            case "3" :
                publicTransport = "Bus";
                break;
                
            case "4" :
                publicTransport = "Air Space";
                break;             
        }
        return publicTransport;
    }
    
    //pemilihan tujuan
    public String tjn (String opsi){
        location = opsi;
        switch (opsi){
            case "1" :
                location = "Jakarta";
                break;
            
            case "2" :
                location = "Bandung";
                break;
                
            case "3" :
                location = "Amerika";
                break;      
        }
        return location;
    }
    //harga transportasi
    public int ticket (String T){
        publicTransport = T;
        switch (publicTransport){
            
            case "Pesawat":
                price = 585000;
                break;
            
            case "Kereta Api":
                price = 332000;
                break;
                
            case "Bus":
                price = 190000;
                break;
                
            case "Air Space":
                price = 1333999;
                break;
            
        }
        return price;
    }
    

    public int diskon (){
        if (null != location)switch (location) {
            case "Jakarta":
                price = price - (int) (price * 0.04);           
                break;
            case "Bandung":
                price = price - (int) (price * 0.08);
                break;
            case "Amerika":
                price = price - (int) (price * 0.06);
                break;
            default:
                break;
        }
        return price;
    }
    
    public void print(){ 

        System.out.println("===========================");
        System.out.println("       Tiket Anda          ");
        System.out.println("===========================");
        System.out.println("Nama penumpang = "+ user.getName());
        System.out.println("Tiket = "+ publicTransport);
        System.out.println("Tujuan = "+ location);
        System.out.println("Total bayar = "+price);
    }
    
}
 


