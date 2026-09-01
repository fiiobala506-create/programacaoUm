package atividadesumscanner;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        System.out.print("Possui ingresso? (true/false): ");
	        boolean possuiIngresso = leia.nextBoolean();

	        System.out.print("Possui documento? (true/false): ");
	        boolean possuiDocumento = leia.nextBoolean();

	        System.out.print("Acompanhante é maior de idade? (true/false): ");
	        boolean acompanhanteMaiorIdade = leia.nextBoolean();

	        System.out.println("Ingresso && Documento: "
	                + (possuiIngresso && possuiDocumento));

	        System.out.println("Ingresso || Documento: "
	                + (possuiIngresso || possuiDocumento));

	        System.out.println("!Documento: "
	                + (!possuiDocumento));

	        System.out.println("Ingresso && (Documento || Acompanhante): "
	                + (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));

	        System.out.println("!(Ingresso && Documento): "
	                + (!(possuiIngresso && possuiDocumento)));

	}

}
