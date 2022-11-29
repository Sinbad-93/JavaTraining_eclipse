package jv.training4;

public class JavaTraining4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//type de valeur
		String nom1 = "Elvis";
		String nom2 = nom1;

		nom1 = "Foxy";

		
		afficheNom(nom1);//output Foxy
		afficheNom(nom2);//output Elvis

		//type de référence ou pointeur
		Personne personne1 = new Personne("Jimmy");
		Personne personne2 = personne1;

		afficheNom(personne1.nom);//output Jimmy
		afficheNom(personne2.nom);//output Jimmy
		
		
	}

	static void afficheNom(String text) {
		System.out.println("->" + text);
	}
}

class Personne {
	String nom;

	Personne(String nom) {
		this.nom = nom;
	}
}