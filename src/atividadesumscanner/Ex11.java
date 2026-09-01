package atividadesumscanner;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nomeAluno = leia.nextLine();

	        System.out.print("Digite a nota: ");
	        int nota = leia.nextInt();

	        System.out.print("Digite a frequência: ");
	        int frequencia = leia.nextInt();

	        String resultado = (nota >= 7 && frequencia >= 75)
	                ? "Aprovado"
	                : "Reprovado";

	        System.out.println(nomeAluno + ": " + resultado);

	}

}
