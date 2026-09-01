package atividadesquatro;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite a média: ");
        double media = leia.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

	}

}
