package atividadesumscanner;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite a idade: ");
        int idade = leia.nextInt();

        System.out.print("Digite a altura: ");
        double altura = leia.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = leia.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = leia.next().charAt(0);

        System.out.print("A matrícula está ativa? ");
        String matricula = leia.next();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Matrícula: " + matricula);

	}

}
