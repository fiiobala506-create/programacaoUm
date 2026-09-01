package atividadesumscanner;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o nome: ");
	        String nome = leia.nextLine();

	        System.out.print("Digite o curso: ");
	        String curso = leia.nextLine();

	        System.out.print("Digite a idade: ");
	        int idade = leia.nextInt();

	        System.out.println("==============================");
	        System.out.println("Aluno: " + nome);
	        System.out.println("Curso: " + curso);
	        System.out.println("Idade: " + idade + " anos");
	        System.out.println("==============================");

	}

}
