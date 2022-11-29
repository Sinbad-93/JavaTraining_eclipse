package jv.training3;

public class JavaTraining3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal randomAnimal = new Animal();

		Animal chien = new Chien();

		Animal pigeon = new Pigeon();

		randomAnimal.deplacer();

		chien.deplacer();

		pigeon.deplacer();

	}
}

	class Animal {
		void deplacer() {
			System.out.println("Je me déplace");
		}
	}

	class Chien extends Animal {
		
		@Override
		   void deplacer() {
		      System.out.println("Je marche");
		   }
/*
		void deplacer() {
			super.deplacer();
		      System.out.println("ouaf ouaf");
		}**/

	}

	class Oiseau extends Animal {

		void deplacer() {
			System.out.println("Je vole");
		}

	}

	class Pigeon extends Oiseau {

		void deplacer() {
			System.out.println("Je vole surtout en ville");
		}

	}

