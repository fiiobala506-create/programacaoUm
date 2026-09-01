package atividadesumscanner;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = leia.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = leia.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

	}

}
