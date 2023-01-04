package contabancaria;
public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 = new Conta("Adão Ventura", "1234", "6666", 100000.00);
		
		conta1.verificar();
		
		System.out.println("Cliente: " + conta1.getCliente());
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getConta());
		System.out.println("Saldo: " + conta1.getSaldo());
		
			}
		
		
	}