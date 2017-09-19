package br.com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Aula 22
public class AulaArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < 3; i ++) {
			System.out.println("adicione u nome");
			nomes.add(in.nextLine());
			
		}
		
		Boolean encontrou = nomes.contains("ronaldo");
		System.out.println(encontrou);
		nomes.remove("ronaldo");
		
		String nome = nomes.get(0);
		System.out.println("nome na posicao 0 = " + nome);
		
		System.out.println(nomes.toString());
		
	}
	
}
