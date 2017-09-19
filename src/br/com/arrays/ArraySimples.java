package br.com.arrays;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {

		String[] names = { "ana","ronaldo", "silva", "jose" };
		int[] numbers = new int[4];

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i].toString());
		}
		System.out.println(">>>>>>>>>>>>>>>ordenando array>>>>>>>>>>>>>>>>>>>>>");
		for (int i = 0; i < names.length; i++) {
			Arrays.sort(names,0,names.length);
			System.out.println(names[i].toString());
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}

	}

}
