package atividadesquatro;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		  Scanner leia = new Scanner(System.in);

	        System.out.print("Digite o peso: ");
	        double peso = leia.nextDouble();

	        System.out.print("Digite a altura: ");
	        double altura = leia.nextDouble();

	        double imc = peso / (altura * altura);

	        System.out.println("IMC: " + imc);

	        if (imc < 18.5) {
	            System.out.println("Magreza / Abaixo do peso");
	        } else if (imc < 25) {
	            System.out.println("Peso normal / Saudável");
	        } else if (imc < 30) {
	            System.out.println("Sobrepeso (Pré-obesidade)");
	        } else if (imc < 35) {
	            System.out.println("Obesidade Grau I");
	        } else if (imc < 40) {
	            System.out.println("Obesidade Grau II");
	        } else {
	        	System.out.println("Obesidade Grau III (Grave)");
	        }

	}

}
