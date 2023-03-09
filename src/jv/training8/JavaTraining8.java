package jv.training8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class JavaTraining8 {

   public static void main(String[] String) { 
	   //Affiche la date du système
	   System.out.format("La date du systéme est: %tc", 
               System.currentTimeMillis());
	   System.out.println("");
   
	 //Affiche la date 
    SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    s.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
    
    System.out.println(s.format(System.currentTimeMillis()));
 }

}