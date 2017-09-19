package br.com.switcase;

public class AulaSwitcas {
	
	//Aula 24
	public static void main(String[] args) {
		
		//char sexo = 'M';
		String tecnologia = "java";
		switch (tecnologia) {
		case  "Java":
			System.out.println("java technology");
			break;
		case  ".Net":	
			System.out.println(".net technology");
			break;
		default:
			System.out.println("outro");
			break;
		}
	}

}
