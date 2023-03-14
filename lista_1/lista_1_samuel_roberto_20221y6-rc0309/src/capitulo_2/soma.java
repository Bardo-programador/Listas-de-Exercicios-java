package capitulo_2;
//import java.util.Scanner; // Questão 12 <- Tirar comentario no inicio antes de chegar na questão 12

public class soma {

	public static void main(String[] args) {
		//Questão 10
		System.out.println("//Questão 10");
		Scanner input = new Scanner(System.in);
		
		int numero1; //primeiro numero
		int numero2; //segundo numero
		int soma; //variavel de soma dos 2 numeros
		
		System.out.println("Digite o primeiro inteiro");
		numero1 = input.nextInt();//lê o primeiro numero
		System.out.println("Digite o segundo inteiro");
		numero2 = input.nextInt();//lê o segundo numero
		
		soma = numero1+numero2;
		
		System.out.printf("A soma é: %d", soma);//exibe a soma
		
		
		
	}//fim da main
}//fim de soma
