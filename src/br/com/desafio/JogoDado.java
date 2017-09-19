package br.com.desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {

		boolean stop = true;
		Scanner in = new Scanner(System.in);
		int number = 0;
		while (stop == true) {

			Random ran = new Random();
			number = ran.nextInt(6) + 1;
			System.out.println("digite seu palpite");
			int palpite = in.nextInt();
			System.out.println("Number sorteio " + number);
			System.out.println("palpite " + palpite);
			if (number == palpite) {
				System.out.println("acertou");
			} else {
				System.out.println("errou");
			}
			System.out.println("deseja continuar?");
			stop = in.nextBoolean();
		}

	}

}
