import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite a agencia : ");
		String agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o numero da agencia : ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Por favor, digite seu saldo: (com virgula para apontar decimal) ");
		double saldo = sc.nextDouble();

		sc.close();
		
		System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco,");
		System.out.println("sua agência é : " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " Ja está disponivel para saque.");
	}

}
