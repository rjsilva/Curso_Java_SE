package br.com.desafio;

public class DesafioFibonaci {
	
	//
	public static void main(String[] args) {
		
		//0 + 1 = 1
		// 1 + 1 = 2
		int before = 0;
		int next = 1;
		System.out.println(before);
		for(int i = 1 ; i < 50 ; i++) {
			before = next;
			next = before + i;
			System.out.println(next);
			
		}
	}
	//before = 1
	//next = 1
      //0,1,1,
}
