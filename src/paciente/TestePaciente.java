package paciente;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente paciente1 = new Paciente("Cruz e Souza", 30, 60, 1.68, "M", "A");
		
		paciente1.internar();
		
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Idade: " + paciente1.getIdade());
		System.out.println("Peso: " + paciente1.getPeso());
		System.out.println("Altura: " + paciente1.getAltura());
		System.out.println("Sexo: " + paciente1.getSexo());
		System.out.println("Tipo sanguíneo: " + paciente1.getTipoSanguineo());
		
		
	}

}
