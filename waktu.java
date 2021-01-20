/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiket;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

public class waktu {
        String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");  
        Date date = new Date();  
        return dateFormat.format(date);  
      } 
}
