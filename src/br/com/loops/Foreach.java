package br.com.loops;

import java.util.ArrayList;

public class Foreach {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 5 ; i++) {
			numbers.add(i);
		}
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}

}
