package atividadesquatro;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = leia.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = leia.nextInt();

	        if (numero1 > numero2) {
	            System.out.println("O primeiro número é maior.");
	        } else {
	            System.out.println("O segundo número é maior ou igual.");
	        }

	}

}
