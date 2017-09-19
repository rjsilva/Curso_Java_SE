package operadores;

public class OperadoresRestantes {
	
	//Aula 18
	public static void main(String[] args) {
		int idade = 18;
		String maiorIdade = idade >= 18 ? "maior de idade":"meno de idade";
		System.out.println(maiorIdade);
		
		if(!(idade >= 19)) {
			System.out.println("proibido");
		}else {
			System.out.println("é maior");
		}
		
		
	}

}
