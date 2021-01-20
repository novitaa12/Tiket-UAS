/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiket;
import java.util.Scanner;

public class Mesin {

    
    static Scanner input = new Scanner (System.in);
    static String name;
    static String transportasi;
    static String tujuan;
    static int tarif;
    static int bayar;
    
    //konstruktor, inisialisasi dari sebuah objek
    public Mesin (String nama, String kendaraan, String tj, int hrg, int ttl){
        name = nama;
        transportasi = kendaraan;
        tujuan = tj;
        tarif = hrg;
        bayar = ttl;     
    }
    
    public void menu(){
       
        System.out.println("==============================");
        System.out.println("Pilih Tiket");
        System.out.println("1. Pesawat  585000");
        System.out.println("2. Kereta Api 332000");
        System.out.println("3. Bus 190000");
        System.out.println("4. Air Spaec 1333999");
        
        System.out.println("==============================");
        System.out.println("Pilih Tujuan");
        System.out.println("1. Jakarta");
        System.out.println("2. Bandung");
        System.out.println("3. Amerika");
        System.out.println("==============================");

    }
    
    //method input 
    public String masuk (String input){
        Scanner nama = new Scanner (System.in);
        input = nama.nextLine();
        return input;
    }
    
    //pemilihan transportasi 
    public String transport (String pilih){
        switch (pilih){
            case "1" :
                transportasi = "Pesawat";
                break;
                
            case "2" :
                transportasi = "Kereta Api";
                break;
                
            case "3" :
                transportasi = "Bus";
                break;
                
            case "4" :
                transportasi = "Air Space";
                break;             
        }
        return transportasi;
    }
    //pemilihan tujuan
    public String tjn (String opsi){
        tujuan = opsi;
        switch (opsi){
            case "1" :
                tujuan = "Jakarta";
                break;
            
            case "2" :
                tujuan = "Bandung";
                break;
                
            case "3" :
                tujuan = "Amerika";
                break;      
        }
        return tujuan;
    }
    //harga transportasi
    public int tiket (String kendaraan){
        transportasi = kendaraan;
        switch (transportasi){
            
            case "Pesawat":
                tarif = 585000;
                break;
            
            case "Kereta Api":
                tarif = 332000;
                break;
                
            case "Bus":
                tarif = 190000;
                break;
                
            case "Air Space":
                tarif = 1333999;
                break;
            
        }
        return tarif;
    }
    //method diskon tiap tiap tujuan
    public int diskon (String total){
        tujuan = total;
        if (null != tujuan)switch (tujuan) {
            case "Jakarta":
                tarif = tarif - (int) (tarif * 0.04);           
                break;
            case "Bandung":
                tarif = tarif - (int) (tarif * 0.08);
                break;
            case "Amerika":
                tarif = tarif - (int) (tarif * 0.06);
                break;
            default:
                break;
        }
        return tarif;
    }
    //total bayar
    public int bill (int Bayar){
        bayar = tarif;
        System.out.println("pembayaran: "+tarif);    
    return tarif;
    }
    
    public void print(String nama, String kendaraan, String tj, int hrg, int ttl){
        user masuk = new user ();
        masuk.input();
        System.out.println("===========================");
        System.out.println("       Tiket Anda          ");
        System.out.println("===========================");
        System.out.println("Nama penumpang = "+ masuk.getNama());
        System.out.println("Tiket = "+ kendaraan);
        System.out.println("Tujuan = "+ tj);
        System.out.println("Total bayar = "+ttl);
        
    }
    
    public static void main(String []args){
        user masuk = new user ();
        masuk.input();
        Mesin scan = new Mesin(name, transportasi,tujuan,tarif,bayar);
        scan.menu();   //
        System.out.print("Masukkan tiket yang anda pilih = ");
        String kendaraan = scan.masuk(transportasi); //input tiket
        scan.transport(kendaraan);      //pendeklarasian transpor yg dipilih
        scan.tiket(transportasi);       //pendeklarasian harga masing" transportasi
        System.out.print("Pilih tujuan anda = ");
        String tj = scan.masuk(tujuan);  
        scan.tjn(tj);                   //deklarasi tujuan yg dipilih
        scan.diskon(tujuan);            //menghitung diskon sesuai tujuan yg dipilih
        scan.bill(bayar);               //memanggil method bill
        scan.print(name, transportasi, tujuan, tarif, bayar);
        
    }    
}
 


