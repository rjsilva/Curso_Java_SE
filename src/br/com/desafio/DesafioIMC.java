package br.com.desafio;

import javax.swing.JOptionPane;

public class DesafioIMC {
	
	public static void main(String[] args) {
		
		String altura = JOptionPane.showInputDialog("digite sua altura");
		double alturaMetros = Double.parseDouble(altura);
		String peso = JOptionPane.showInputDialog("digite seu peso");
		double pesoQuilograma = Double.parseDouble(peso);
		
		double IMC = pesoQuilograma / (alturaMetros * alturaMetros);
		
		String msg = (IMC >= 20 && IMC <= 25) ? "PESO IDEAL":"ACIMA DO PESO";
		msg = " IMC = " + IMC + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
