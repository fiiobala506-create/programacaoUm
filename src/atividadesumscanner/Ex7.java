package atividadesumscanner;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o salário: ");
	        double salario = leia.nextDouble();

	        int salarioInteiro = (int) salario;

	        double salarioDouble = (double) salarioInteiro;

	        System.out.println("Salário: " + salario);
	        System.out.println("Salário inteiro: " + salarioInteiro);
	        System.out.println("Salário double: " + salarioDouble);

	}

}
