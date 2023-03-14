package capitulo_2;
import java.util.Scanner;
public class figura_2_15 {//classe figura_2_15
	
	public static void main(String[] args) {//main
		
		//Questão 13:
		System.out.println("//Questão 13//");
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner input = new Scanner (System.in);
		 int number1; // primeiro número a comparar
		 int number2; // segundo número a comparar
		System.out. print("Digite o primeiro inteiro: "); // prompt
		number1 = input. nextInt(); // 1ê o primeiro número fornecido pelo usuário
		System.out.print("Digite o segundo inteiro: "); // prompt
		number2 = input. nextInt(); // lê o segundo número fornecido pelo usuário

		if (number1 == number2){
		System.out.printf("%d == %d%n", number1, number2) ;}

		if (number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2) ;}

		if (number1 < number2){
		System.out.printf("%d < %d%n", number1, number2) ;}

		if (number1 > number2) {
			System.out.printf("%d > %d%n", number1, number2) ;}

		if (number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2) ;}

		if (number1 >= number2) {
			System.out.printf("%d >= %d%n", number1, number2);}
		
		//Questão 14 e 16(corrigido)
		
		System.out.println("//Questão 14//");
		System.out.printf("%d + %d = %d%n", number1, number2, number1+number2);
		System.out.printf("%d - %d = %d%n", number1, number2, number1-number2);
		if(number1==0 || number2 == 0 ) {
		System.out.printf("%d * %d = 0%n", number1, number2);
		System.out.printf("%d / %d = 0%n", number1, number2);
		System.out.printf("%d %% %d = 0%n", number1, number2);}
		else {
			float divisao = number1/(float)number2;
			System.out.printf("%d * %d = %d%n", number1, number2, number1*number2);
			System.out.printf("%d / %d = %.2f%n", number1, number2, divisao);
			System.out.printf("%d %% %d = %d%n", number1, number2, number1%number2);
		}
	}//fim da main

}//fim da classe
