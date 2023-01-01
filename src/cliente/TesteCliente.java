package cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Roberto", "Piva", 70, "rpiva@gmail.com", "s");
		
		cliente1.cadastrar();
		
		System.out.println("Nome: " +cliente1.getNome());
		System.out.println("Sobrenome: " +cliente1.getSobrenome());
		System.out.println("Idade: " +cliente1.getIdade());
		System.out.println("Email: " +cliente1.getEmail());
	}

}
