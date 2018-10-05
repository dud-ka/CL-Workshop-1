package pl.coderslab.game2;

import org.apache.commons.lang3.ArrayUtils;


import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		System.out.println(Arrays.toString(randomArr()));

	}

	public static int[] randomArr() {
		Random r =  new Random();
		int[] array = new int[6];

		for(int i=0; i< array.length; i++) {
			while(array[i]==0) {
				int random = r.nextInt(49) + 1;
				if (!ArrayUtils.contains(array, random)) {
					array[i] = random;
				}
			}

		}

		return array;
	}

}
