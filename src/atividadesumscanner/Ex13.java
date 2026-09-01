package atividadesumscanner;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite a temperatura: ");
	        double temperatura = leia.nextDouble();

	        String situacao = (temperatura > 25)
	                ? "Dia quente"
	                : "Dia agradável";

	        System.out.println("Temperatura: " + temperatura + "°C");
	        System.out.println("Situação: " + situacao);

	}

}
