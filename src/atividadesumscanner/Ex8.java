package atividadesumscanner;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numA = leia.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numB = leia.nextInt();

	        int divisaoInteira = numA / numB;

	        double divisaoReal = (double) numA / numB;

	        System.out.println("Divisão inteira: " + divisaoInteira);
	        System.out.println("Divisão real: " + divisaoReal);

	}

}
