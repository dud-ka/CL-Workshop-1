package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int random = r.nextInt(100)+1;    //max = 100, min = 1
		int number = 0;

		System.out.println("Zgadnij liczbę z przedziału 1 - 100");

		while(!(number == random)) {
			while(!scan.hasNextInt()) {
				System.out.println("Podana wartość nie jest lczbą. Wpisz liczbę");
				scan.next();
			}

			number = scan.nextInt();

			if (number<random) {
				System.out.println("Za mało!");
			}else if (number>random) {
				System.out.println("Za dużo!");
			} else {
				System.out.println("Zgadłeś");
			}
		}

	}

}




