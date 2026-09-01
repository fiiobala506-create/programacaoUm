package atividadesumscanner;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = leia.nextInt();

	        String resultado = (idade >= 18)
	                ? "Maior de idade"
	                : "Menor de idade";

	        System.out.println(resultado);

	}

}
