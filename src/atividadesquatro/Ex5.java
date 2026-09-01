package atividadesquatro;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = leia.nextInt();

	        if (idade >= 60) {
	            System.out.println("Cliente possui direito ao desconto.");
	        }

	}

}
