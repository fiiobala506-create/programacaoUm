package atividadesquatro;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = leia.nextInt();

	        if (idade >= 18) {
	            System.out.println("Maior de idade.");
	        } else {
	            System.out.println("Menor de idade.");
	        }

	}

}
