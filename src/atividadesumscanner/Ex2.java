package atividadesumscanner;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o nome do produto: ");
	        String nome = leia.nextLine();

	        System.out.print("Digite o código: ");
	        int codigo = leia.nextInt();

	        System.out.print("Digite o preço: ");
	        double preco = leia.nextDouble();

	        System.out.print("Digite a quantidade em estoque: ");
	        int quantidade = leia.nextInt();

	        System.out.println("Produto: " + nome);
	        System.out.println("Código: " + codigo);
	        System.out.println("Preço: R$ " + preco);
	        System.out.println("Estoque: " + quantidade);

	}

}
