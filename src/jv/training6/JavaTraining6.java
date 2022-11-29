package jv.training6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaTraining6 {
	

	public static void main(String[] args) throws IOException {
		
		// Création d’un fileWriter pour écrire dans un fichier
		FileWriter fileWriter = new FileWriter("C:\\Users\\Administrateur\\eclipse-workspace\\jv.training\\src\\jv\\training6\\Untitled 1", true);

		// Création d’un bufferedWriter qui utilise le fileWriter
		BufferedWriter writer = new BufferedWriter (fileWriter);

		 
		   try {
			   
			  writer.newLine();

		      // ajout d’un texte à notre fichier
		      writer.write("Le code est terminé");

		      // Retour à la ligne
		      writer.newLine();

		      writer.write("FIN");}

		catch (IOException e) {

		      e.printStackTrace();
		}

		writer.close();


		// Création d’un fileReader pour lire le fichier
		FileReader fileReader = new FileReader("C:\\Users\\Administrateur\\eclipse-workspace\\jv.training\\src\\jv\\training6\\Untitled 1");

		// Création d’un bufferedReader qui utilise le fileReader 
		BufferedReader reader = new BufferedReader (fileReader);


		   try { 

		      // une fonction à essayer pouvant générer une erreur
		      String line = reader.readLine();

		      while(line != null) {

		            // affichage de la ligne
		            System.out.println(line);

		            // lecture de la prochaine ligne
		            line = reader.readLine();
		    }}
		   

		catch (IOException e) {

		    e.printStackTrace();


		}

		reader.close();
		   }
		
		   }

