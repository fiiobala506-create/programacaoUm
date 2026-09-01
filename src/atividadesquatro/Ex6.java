package atividadesquatro;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }

	}

}
