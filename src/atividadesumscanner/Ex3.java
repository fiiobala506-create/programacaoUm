package atividadesumscanner;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leia.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int resto = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
	}

}
