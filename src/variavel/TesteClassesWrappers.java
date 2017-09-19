package variavel;

public class TesteClassesWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassesWrappers cw = new ClassesWrappers();
		float altura = cw.getAltura().parseFloat("1.76");
		int idade = cw.getIdade().parseInt("434");
		Float altura2 = 1.76f;
		int number = altura2.compareTo(1.7f);
		int teste = cw.getIdade().numberOfLeadingZeros(number);
		System.out.println(idade);

	}

}
