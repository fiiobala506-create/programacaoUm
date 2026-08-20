package iarleykevi;
public class Ex9 {

	public static void main(String[] args) {
		
		 boolean possuiIngresso = true;
	        boolean possuiDocumento = false;
	        boolean acompanhanteMaiorIdade = true;

	        System.out.println("1. " + (possuiIngresso && possuiDocumento));

	        System.out.println("2. " + (possuiIngresso || possuiDocumento));

	        System.out.println("3. " + (!possuiDocumento));

	        System.out.println("4. " + (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));

	        System.out.println("5. " + (!(possuiIngresso && possuiDocumento)));

	}

}
