package atividadesumscanner;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o valor em dólares: ");
	        double valorDolares = leia.nextDouble();

	        System.out.print("Digite a cotação do dólar: ");
	        double cotacaoDolar = leia.nextDouble();

	        double valorEmReais = valorDolares * cotacaoDolar;

	        System.out.println("O monitor custa " + valorEmReais + " reais");

	}

}
