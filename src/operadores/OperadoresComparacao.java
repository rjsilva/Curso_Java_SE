package operadores;

public class OperadoresComparacao {
	
	//Operadores de comparacao
	//Aula 15
	public static void main(String[] args) {
		
		String nome1 = "ronaldo";
		String nome2 = "ronaldo";
		
		if(nome1.contains("ron")) {
			System.out.println("existe");
		}
		
		int answer  = nome1.compareTo(nome2);
		System.out.println(answer);
		
		if(nome1.equalsIgnoreCase("RONALDO"))
			System.out.println("YES");
	}

}
