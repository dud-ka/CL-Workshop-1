package pl.coderslab.game5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Connection connect = Jsoup.connect("http://www.onet.pl/");

		try {
			PrintWriter out = new PrintWriter("src/pl/coderslab/game5/popular_words.txt");
			Document document = connect.get();
			Elements links = document.select("span.title");
			String str;
			for (Element elem : links) {
				StringTokenizer tokens = new StringTokenizer(elem.text(), ",.- ");
				while (tokens.hasMoreTokens()) {
					str = tokens.nextToken().replace('?', ' ').replace('!', ' ')
							.replace('(', ' ').replace(')', ' ').replace('\"', ' ')
							.replaceAll(" ", "");
					if (!(str.length() < 3)) {
						out.println(str);
					}
				}
			}
			out.close();



			String[] array = {"Onet24:", "lub", "albo", "ale", "ponieważ",
					"oraz", "gdyż", "tak", "nie", "także", "się", "jak", "być", "dla", "jest", "sie"};
			File file = new File("src/pl/coderslab/game5/popular_words.txt");
			PrintWriter out2 = new PrintWriter("src/pl/coderslab/game5/filtered_popular_words.txt");
			Scanner scan =  new Scanner(file);
			String str2;


			while (scan.hasNextLine()) {
				boolean isUnwanted = false;
				str2 = scan.nextLine();
				for (String word: array) {
					if (word.toLowerCase().equals(str2.toLowerCase())) {
						isUnwanted = true;
						break;
					}
				}

				if(!isUnwanted) {
					out2.println(str2);
				}

			}
			out2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}




	}
}