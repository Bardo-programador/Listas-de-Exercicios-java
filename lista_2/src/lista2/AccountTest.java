package lista2;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccountTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Questão 4
		/**
		
		System.out.println("//Questão 4//");
		Account minhaConta = new Account();
		System.out.printf("Nome inicial é: %s%n",minhaConta.buscarNome());
		System.out.println("Insira um novo nome:");
		String nome = input.nextLine();
		minhaConta.definirNome(nome);
		System.out.println();
		System.out.printf("O nome da conta é: %s",minhaConta.buscarNome());
		*/
		//Questão 9
		System.out.println("//Questão 9//");
		Account conta = new Account("Samuel");
		System.out.printf("O nome de conta é: %s%n",conta.buscarNome());
		System.out.println("");
		
		
		Account conta1 = new Account("Samuel Roberto", 50.00);//construtores de conta1 e conta2
		Account conta2 = new Account("John Blue", -7.53);
		//Questão 12 e 16
		System.out.println("//Questão 12 e Questão 16//");
		//System.out.printf("Saldo de %s: %.2f%n",conta1.buscarNome(), conta1.buscarBalanco());//exibe dados posteriores
		//System.out.printf("Saldo de %s: %.2f%n",conta2.buscarNome(), conta2.buscarBalanco());
		display(conta1);
		display(conta2);
		System.out.printf("%nDigite o depósito para %s: ",conta1.buscarNome());
		double deposito = input.nextDouble();
		System.out.printf("%n%.2f adicionado a %s%n%n",deposito, conta1.buscarNome());
		conta1.depositar(deposito);
		//System.out.printf("Saldo de %s: %.2f%n",conta1.buscarNome(), conta1.buscarBalanco());//exibe dados posteriores
		//System.out.printf("Saldo de %s: %.2f%n",conta2.buscarNome(), conta2.buscarBalanco());
		display(conta1);
		display(conta2);
		System.out.printf("%nDigite o depósito para %s:",conta2.buscarNome());
		deposito = input.nextDouble();
		System.out.printf("%n%.2f adicionado a %s%n%n",deposito, conta2.buscarNome());
		conta2.depositar(deposito);
		//System.out.printf("Saldo de %s: %.2f%n",conta1.buscarNome(), conta1.buscarBalanco());//exibe dados posteriores
		//System.out.printf("Saldo de %s: %.2f%n",conta2.buscarNome(), conta2.buscarBalanco());
		display(conta1);
		display(conta2);
		//Questão 17
		System.out.println("//Questão 17//");
		displayAccountGrafico(conta1);//metodo display, mas com janela gráfica
		displayAccountGrafico(conta2);
	
	}//fim da main
	public static void displayAccountGrafico(Account accountToDisplay)
	{
		String texto = String.format("%s saldo: $%.2f%n",accountToDisplay.buscarNome(),accountToDisplay.buscarBalanco());
		JOptionPane.showMessageDialog(null, texto);

	}//fim de displayAccountGrafico
	public static void display(Account telaConta) 
	{ 
		System.out.printf("%s saldo: $%.2f%n",telaConta.buscarNome(),telaConta.buscarBalanco());//exibe os dados	
		
}//fim de display
}//fim da classe1
