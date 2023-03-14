package lista2;

public class Account {
	
	
	private String nome;//variável de instância
	private double balanco;//variável de instância
	//Questão 2
	//atribuir um nome
	public void definirNome(String nome) {
		this.nome = nome;	
	}
	//ler o nome 
	public String buscarNome() {
			
		return nome;
	}
	//Questão 7
	public Account(String nome) {//construtor com um parâmetro
		this.nome = nome;
	}// construtor de Account
	
	//Questão 10
	public Account(String nome, double balanco) {//construtor com dois parâmetros
		this.nome = nome;//atribui o parametro nome à variável de instancia nome
		if (balanco>=0.0) {//se balanco é maior que 0.0
		this.balanco = balanco;//atribui o parametro balanco à variável de instancia balanco
						  }
	} 
		public double buscarBalanco() {
		return balanco;
		}
	public void depositar(double deposito) {//metodo depositar
		if (deposito>0.0) {//se deposito é maior que 0.0
			balanco = balanco + deposito;//balanco recebe um incremento de deposito
		}
	}
}
