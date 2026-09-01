package atividadesquatro;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite a temperatura: ");
	        double temperatura = leia.nextDouble();

	        if (temperatura >= 30) {
	            System.out.println("Está calor.");
	        } else {
	            System.out.println("A temperatura está agradável.");
	        }

	}

}
