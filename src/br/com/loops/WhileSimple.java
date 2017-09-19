package br.com.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//aula 28
public class WhileSimple {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String nome = null;
		do {
			System.out.println("digite um número");
			nome = in.nextLine();
		} while (!nome.equals("ronaldo"));

	}
}
