package produtoeletronico;

//Crie uma classe produto eletrônico e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto produto eletrônico,
//defina as instancias deste objeto e apresente as informações deste objeto
//no console.




public class Produto {
	
	
	private String nome;
	private String marca;
	private String modelo;
	private double valor;
	private int estoque;
	

	public Produto (String nome, String marca, String modelo, double valor, int estoque) {
		

		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.estoque = estoque;
		
				
	}


	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}




	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}




	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}




	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}




	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}




	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}




	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}




	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}




	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	
	
	void EmEstoque() {
		
		
		System.out.println("Consultando o estoque...");
		if(estoque >= 1) {
			System.out.println("Produto disponível para compra!");
			comprar();
		}else System.out.println("Produto indisponível no momento!");
	}


	private void comprar() {
	// TODO Auto-generated method stub
	
	}
	
}
