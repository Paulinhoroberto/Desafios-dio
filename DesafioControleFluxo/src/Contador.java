import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMensagem());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		
		for (int i = parametroUm; i <= parametroDois; i++) {
	        System.out.println(i); 
	    }
		
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
		}
	}
}
