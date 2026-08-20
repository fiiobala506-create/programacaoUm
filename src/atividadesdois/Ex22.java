package atividadesdois;

public class Ex22 {

	public static void main(String[] args) {
		
		String produto = "Notebook";
        double valorUnitario = 1250.00;
        int quantidade = 2;
        int parcelas = 5;

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: " + produto);
        System.out.printf("Valor unitário: R$ %.2f%n", valorUnitario);
        System.out.println("Quantidade de produtos comprados: " + quantidade);
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
	

	}

}
