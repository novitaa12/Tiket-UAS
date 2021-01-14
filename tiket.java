/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author LaptopKU
 */
public class tiket {

    private String jenisTiket;
    private String kotaTujuan;
    private int jarak;
    private int jenisDiskon;
   
    public tiket(){
        
    }
    
    public String getJenisTiket() {
        return jenisTiket;
    }
    
    public String getKotaTujuan() {
        return kotaTujuan;
    }
    
    public int getJarak(){
        return jarak;
    }
    
    public int jenisDiskon(){
        return jenisDiskon;
    }
    
    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }
    
    public void setJarak (int jarak){
        this.jarak = jarak;
    }
    
    public void setJenisDiskon(int jenisDiskon){
        this.jenisDiskon = jenisDiskon;
    }
     
}
