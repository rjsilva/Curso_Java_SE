package br.com.arrays;

import java.util.Scanner;

public class JogoVelha {
	
	//Aula 21
	public static void main(String[] args) {
	
		String[][] matriz = new String[3][3];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("digite a posicao que deseja marcar");
				matriz[i][j] = in.nextLine();
			}
		}
	}

}
