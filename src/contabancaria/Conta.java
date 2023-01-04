package contabancaria;

//Crie uma classe conta bancaria e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto conta bancaria, defina
//as instancias deste objeto e apresente as informações deste objeto no
//console.

public class Conta {
	
	
	private String cliente;
	private String agencia;
	private String conta;
	private double saldo;
	
	
	//metodo construtor cheio Conta
	public Conta (String cliente, String agencia, String conta, double saldo) {
		

		this.cliente = cliente;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
							
	}

	
	//metodo construtor vazio Conta
	public Conta () {}
	
	
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}


	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	/**
	 * @return the conta
	 */
	public String getConta() {
		return conta;
	}


	/**
	 * @param conta the conta to set
	 */
	public void setConta(String conta) {
		this.conta = conta;
	}


	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void verificar() {
		System.out.println("Aguarde! Verificando os dados...\n");
		
	}
	
}
