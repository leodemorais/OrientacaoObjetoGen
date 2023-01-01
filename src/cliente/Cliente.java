package cliente;


//Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.



public class Cliente {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	private String cadastro;

	public Cliente(String nome, String sobrenome, int idade, String email, String cadastro) {
		

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
		this.cadastro = cadastro;
		
		
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
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cadastro
	 */
	public String getCadastro() {
		return cadastro;
	}

	/**
	 * @param cadastro the cadastro to set
	 */
	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	void comprar() {
		System.out.println("Compra em andamento...");
	}
	
	void cadastrar() {
		
		if(cadastro == "s") {
			System.out.println("Bem-vindo!");
			comprar();
		}else System.out.println("Usuário não cadastrado!");
	}
	
	
}
