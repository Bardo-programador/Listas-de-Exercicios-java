package capitulo_2;
import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		
		//2.3
		System.out.println("//2.3//");
		//a)
		System.out.println("a)");
		int c, thisIsAVariable, q76354, number;
		//b)
		System.out.println("b)");
		System.out.print("Digite um valor inteiro: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		//c)
		System.out.println("c)");
		int value = input.nextInt();
		//d)
		System.out.println("d)");
		System.out.println("Isso é um programa Java ");
		//e)
		System.out.println("e)");
		System.out.printf("Isso é um programa %nJava ");
		//f)
		System.out.println("f)");
		if(number!=7) {
			System.out.println("A variável number é diferente de 7");
		}
		System.out.println("\n");
		
		//2.4
		System.out.println("//2.4//");
		//a) 
		System.out.println("a)");
		//if (c<7) {
		 //System.out.println("c é maior que 7");}
		//b) 
		System.out.println("b)");
		//if (c>=7) {
		 //System.out.println("c é maior ou igual a 7");}
		System.out.println("\n");
		
		//2.5
		System.out.println("//2.5//");
		//a)
		System.out.println("a)");
		System.out.println("Isso fará o produto de 3 números");
		//b)
		System.out.println("b)");
		input = new Scanner(System.in);//declaracao do input
		//c)
		System.out.println("c)");
		int x,y,z, result;//declaração de variaveis
		//d)
		System.out.println("d)");
		System.out. print("Digite o primeiro inteiro: ");
		//e)
		System.out.println("e)");
		x = input.nextInt();//leitura do primeiro int
		//f)
		System.out.println("f)");
		System.out. print("Digite o segundo inteiro: ");
		//g)
		System.out.println("g)");
		y = input.nextInt();//leitura do segundo int
		//h)
		System.out.println("h)");
		System.out. print("Digite o terceiro inteiro: ");
		//i)
		System.out.println("i)");
		z = input.nextInt();//leitura do terceiro int
		//j)
		System.out.println("j)");
		result = x*y*z;//calculo
		//k)
		System.out.println("k)");
		System.out.printf("O produto é %d",result);
		System.out.println("\n");
		
		//2.6
		System.out.println("//2.6//");
		int numero1,numero2,numero3;
		System.out. print("Digite o primeiro inteiro: ");	
		numero1 = input.nextInt();//leitura do primeiro
		System.out. print("Digite o segundo inteiro: ");	
		numero2 = input.nextInt();//leitura do segundo int
		System.out. print("Digite o terceiro inteiro: ");	
		numero3 = input.nextInt();//leitura do terceiro int
		System.out.printf("O resultado é = %d",numero1*numero2*numero3);
	}//fim da main

}//fim da classe
