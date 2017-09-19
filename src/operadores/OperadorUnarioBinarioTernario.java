package operadores;

public class OperadorUnarioBinarioTernario {
	
	//aula 13
	public static void main(String[] args) {
		
		operadorTernario("ronaldo");
		
	}
	
	
	public static void operadorUnario(int number) {
		
	}
	

	public static void operadorBinario(int number1, int number2) {
		
	}
	

	public static void operadorTernario(String texto) {
	
		 String str = null;
	     str = texto.equals("ronaldo") ? "olá Ronaldo" : "voce nao é o ronaldo";
	     System.out.println(str);
	}

}
