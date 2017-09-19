package br.com.loops;

public class RotuloBreakContinue {
	
	public static void main(String[] args) {
		
		
		String[][] nomes = {{"ronaldo,silva,jose"},{"marcos,dora,rivera"}};
		
		
		extern:
		for(int row = 0 ; row < nomes.length; row++) {
			intern:
			for(int col = 0; col < nomes[row].length ; col ++) {
				
				if(nomes[row][col].contains("silva")) {
					System.out.println("achou");
					break intern;
				}
				System.out.println(nomes[row][col]);
			}
		}
		
	}

}
