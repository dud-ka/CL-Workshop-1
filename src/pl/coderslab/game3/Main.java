package pl.coderslab.game3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Pomyśl liczbę od 0 do 1000 a ja zgadnę w max 10 próbach");

		int min = 0;
		int max = 1000;
		label:
		for(int i =1; i<=11;i++) {

			if (i>10) {
				System.out.println("Nie oszukuj!");
				break;
			}
			int guess = ((max - min) / 2) + min;

			System.out.println(i+". Zgaduję " + guess);

			Scanner scan = new Scanner(System.in);
			System.out.println("Czy moja odpowiedź jest poprawna? \n wpisz: 'za dużo', 'za mało' lub 'zgadłeś'");
			String answer = scan.nextLine();

			switch (answer) {
				case "zgadłeś":
					System.out.println("Wygrałem!");
					break label;
				case "za dużo":
					max = guess;
					break;
				case "za mało":
					min = guess;
					break;
				default:
					System.out.println("Nie oszukuj!");
					break;
			}

		}
	}
}
