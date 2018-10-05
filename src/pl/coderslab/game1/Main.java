package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random r = new Random();
		int random = r.nextInt(100)+1;    //max = 100, min = 1

		System.out.println(random);  //todo usunąć

		Scanner scan = new Scanner(System.in);
		System.out.println("Zgadnij liczbę");

		while(!scan.hasNextInt()) {
			System.out.println("Podana wartość nie jest lczbą. Wpisz liczbę");
			scan.next();
		}

		int number = scan.nextInt();

		System.out.println(number); //todo usunąć





	}



//	Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100.
//  Następnie:
//      1. wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
//      2. sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To
//          nie jest liczba"
//          , po czym wrócić do pkt. 1;
//      3. jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za
//          mało!"
//          , po czym wrócić do pkt. 1;
//      4. jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za
//          dużo!"
//          , po czym wrócić do pkt. 1;
//      5. jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!"
//          , po
//          czym zakończyć działanie programu.


}
