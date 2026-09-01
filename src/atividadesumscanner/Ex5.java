package atividadesumscanner;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o valor do arroz: ");
	        double arroz = leia.nextDouble();

	        System.out.print("Digite o valor do feijão: ");
	        double feijao = leia.nextDouble();

	        System.out.print("Digite o valor do óleo: ");
	        double oleo = leia.nextDouble();

	        double total = arroz + feijao + oleo;
	        double media = total / 3;

	        System.out.println("Valor total: R$ " + total);
	        System.out.println("Valor médio: R$ " + media);

	}

}
