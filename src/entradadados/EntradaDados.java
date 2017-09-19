package entradadados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		//entradaScanner();
		entradaJOptionPane();
	}
	
	public static void entradaScanner() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("digite seu nome");
		String nome = in.nextLine();
		System.out.println("Oi " + nome);
	}
	
	public static void entradaJOptionPane() {
		
		String nome = JOptionPane.showInputDialog("digite seu nome");
	    JOptionPane.showMessageDialog(null, "Oi " + nome);
	}

}
