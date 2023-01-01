package paciente;

//Crie uma classe paciente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto paciente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.


//nome do objeto
public class Paciente {
	
	
//atributos-características do objeto	
	private String nome;
	private int idade;
	private int peso;
	private double altura;
	private String sexo;
	private String tipoSanguineo;
	
	
//metod construtor cheio paciente
public Paciente (String nome, int idade, int peso, double altura, String sexo, String tipoSanguineo) {
	
	this.nome = nome;
	this.idade = idade;
	this.peso = peso;
	this.altura = altura;
	this.sexo = sexo;
	this.tipoSanguineo = tipoSanguineo;
			
}
	
//metodo construtor vazio paciente
public Paciente () {}


//metodo acessor da classe paciente


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
 * @return the peso
 */
public int getPeso() {
	return peso;
}

/**
 * @param peso the peso to set
 */
public void setPeso(int peso) {
	this.peso = peso;
}

/**
 * @return the altura
 */
public double getAltura() {
	return altura;
}

/**
 * @param altura the altura to set
 */
public void setAltura(double altura) {
	this.altura = altura;
}

/**
 * @return the sexo
 */
public String getSexo() {
	return sexo;
}

/**
 * @param sexo the sexo to set
 */
public void setSexo(String sexo) {
	this.sexo = sexo;
}

/**
 * @return the tipoSanguineo
 */
public String getTipoSanguineo() {
	return tipoSanguineo;
}

/**
 * @param tipoSanguineo the tipoSanguineo to set
 */
public void setTipoSanguineo(String tipoSanguineo) {
	this.tipoSanguineo = tipoSanguineo;
}



void internar() {
	System.out.println("Verificando dados para internação...");
	
}


}

	


