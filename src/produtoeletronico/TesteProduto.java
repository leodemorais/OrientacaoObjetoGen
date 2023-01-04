package produtoeletronico;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1 = new Produto("Liquidificador", "Britânia", "XPTO-2022", 49.99, 1000);
		
		produto1.EmEstoque();
		
		System.out.println("Nome: " +produto1.getNome());
		System.out.println("Marca: " +produto1.getMarca());
		System.out.println("Modelo: " +produto1.getModelo());
		System.out.println("Valor: " +produto1.getValor());
		
	}

}
