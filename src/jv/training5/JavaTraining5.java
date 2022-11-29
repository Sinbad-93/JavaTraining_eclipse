package jv.training5;

import java.util.ArrayList;
import java.util.List;

public class JavaTraining5 {

	/**
	 * affichez la température moyenne à partir des valeurs fournies comme arguments
	 * en ligne de commande
	 *
	 * @param args liste de températures séparées par des espaces
	 */

	public static void main(String[] args) {

		try {
			List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<Integer>();
			/*
			 * recordedTemperaturesInDegreesCelcius.add(1);
			 * recordedTemperaturesInDegreesCelcius.add(7);
			 * recordedTemperaturesInDegreesCelcius.add(8);
			 **/

			// remplissez la liste à partir des valeurs fournies comme arguments en ligne de
			// commande
			for (String stringRepresentationOfTemperature : args) {
				int temperature = Integer.parseInt(stringRepresentationOfTemperature);
				recordedTemperaturesInDegreesCelcius.add(temperature);
			}
			// calculez et affichez la température moyenne
			int averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
			System.out.println("The average temperature is " + averageTemperature);
		} catch (NumberFormatException e) {
			System.out.println("All arguments should be provided as numbers");
			System.exit(-1);
		} catch (ArithmeticException e) {
			System.out.println("At least one temperature should be provided");
			System.exit(-1);
		}

	}

}

class SimpleMaths {

	/**
	 * calculez la valeur moyenne d'une liste d'entiers
	 *
	 * @param listOfIntegers une liste contenant des nombres entiers
	 * @return la moyenne de la liste
	 */

	public static int calculateAverage(List<Integer> listOfIntegers) {
		int average = 0;
		// equivalent à forEach
		for (int value : listOfIntegers) {
			average += value;
		}
		average /= listOfIntegers.size();
		return average;
	}
}