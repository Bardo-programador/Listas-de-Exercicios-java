package lista2;
import javax.swing.JOptionPane;
public class TelaNome {
	
	public static void main(String[] args) {
		//Questão 15
		//Exibe um mensagem com o nome de entrada
		System.out.println("//Questão 15//");
		String nome = JOptionPane.showInputDialog("Qual o seu nome");//Tela de input 
		String mensagem = String.format("Bem-vindo, %s, à linguagem Java", nome);//Mensagem formatada
		JOptionPane.showMessageDialog(null, mensagem);//Mensagem final na tela
	}//fim da main
}//fim da classe
