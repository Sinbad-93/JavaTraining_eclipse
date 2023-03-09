package jv.training9;

import java.util.Scanner;

public class JavaTraining9 {

	// convertisseur de celsius en fahrenheit
	public static void main(String[] args) {
	      
	    Scanner input = new Scanner(System.in);
	    System.out.print("Entrez une température en degrés celsius : ");
	    double celsius = input.nextDouble();
	    // Convertir Celsius en Fahrenheit
	    double fahrenheit = 9.0 / 5 * celsius + 32;
	    // Afficher le résultat
	    System.out.println(celsius+" Celsius -> "+fahrenheit+" Fahrenheit"); 
	    input.close();
	  }
}
