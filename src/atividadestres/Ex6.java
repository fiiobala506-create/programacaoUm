package atividadestres;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o turno (1-Manhã, 2-Tarde): ");
	        int turno = leia.nextInt();

	        System.out.print("Digite a disciplina (1, 2 ou 3): ");
	        int disciplina = leia.nextInt();

	        switch (turno) {
	            case 1:
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Matemática");
	                        break;
	                    case 2:
	                        System.out.println("Português");
	                        break;
	                    case 3:
	                        System.out.println("Física");
	                        break;
	                    default:
	                        System.out.println("Disciplina inválida.");
	                }
	                break;

	            case 2:
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("História");
	                        break;
	                    case 2:
	                        System.out.println("Geografia");
	                        break;
	                    case 3:
	                        System.out.println("Biologia");
	                        break;
	                    default:
	                        System.out.println("Disciplina inválida.");
	                }
	                break;

	            default:
	                System.out.println("Turno inválido.");
	        }

	}

}
