package pl.coderslab.game2;

import org.apache.commons.lang3.ArrayUtils;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println(checking());
	}

	public static int[] randomArr() {
		Random r =  new Random();
		int[] array = new int[6];

		for(int i=0; i< array.length; i++) {
			while(array[i]==0) {
				int random = r.nextInt(49)+1;
				if (!ArrayUtils.contains(array, random)) {
					array[i] = random;
				}
			}
		}

		return array;
	}

	public static int[] userChoice(){
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[6];
		for (int i=0; i<6; i++) {
			while (numbers[i] == 0) {
				while (numbers[i] < 1 || numbers[i] > 49) {
					System.out.print("Podaj liczbę nr " + (i + 1) + " z zakresu 1-49 ");
					while (!scan.hasNextInt()) {
						System.out.print("Podaj liczbę ");
						scan.next();
					}
					int number = scan.nextInt();
					if (!ArrayUtils.contains(numbers, number)) {
						numbers[i] = number;
					}
				}
			}
		}
		Arrays.sort(numbers);

		return numbers;


	}

	public static String checking() {
		int[] userArray = userChoice();
		int[] lottoArray = randomArr();
		int count = 0;
		for (int i = 0; i<6; i++) {
			if (ArrayUtils.contains(lottoArray, userArray[i])) {
				count++;
			}
		}
	return "Liczba elementów, które trafiłeś: " + count + "\n Wylosowane liczby to: " + Arrays.toString(lottoArray)
			+ "\n Twoje liczby to: " + Arrays.toString(userArray);
	}

}
