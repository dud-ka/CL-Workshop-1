package pl.coderslab.game4;

import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		String dice = "D6";
		System.out.println(diceSimulation(dice));

	}

	private static int diceSimulation(String diceType) {
		Random r = new Random();
		String[] partsOfDice = diceType.split("D");
		int howManyDices = 1;

		if (!partsOfDice[0].equals("")) {
			howManyDices = Integer.valueOf(partsOfDice[0]);
		}

		int typeOfDice;
		int modify = 0;
		int result = 0;
		if (partsOfDice[1].contains("+") || partsOfDice[1].contains("-")) {
			StringTokenizer tokens = new StringTokenizer(partsOfDice[1], "+-");
			typeOfDice = Integer.valueOf(tokens.nextToken());
			modify = Integer.valueOf(tokens.nextToken());
		} else {
			typeOfDice = Integer.valueOf(partsOfDice[1]);
		}

		for (int i = 0; i<howManyDices; i++) {
			result += r.nextInt(typeOfDice)+1;
		}
		if (partsOfDice[1].contains("-")){
			result -= modify;
		} else {
			result += modify;
		}

		return result;

	}
}
