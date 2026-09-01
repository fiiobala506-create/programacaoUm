package atividadestres;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = leia.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = leia.nextInt();

	        System.out.print("Digite a operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
	        int opcao = leia.nextInt();

	        switch (opcao) {
	            case 1:
	                System.out.println("Resultado: " + (num1 + num2));
	                break;
	            case 2:
	                System.out.println("Resultado: " + (num1 - num2));
	                break;
	            case 3:
	                System.out.println("Resultado: " + (num1 * num2));
	                break;
	            case 4:
	                System.out.println("Resultado: " + (num1 / num2));
	                break;
	            default:
	                System.out.println("Opção inválida.");
	        }
	}

}
