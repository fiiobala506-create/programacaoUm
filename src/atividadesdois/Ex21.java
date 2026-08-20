package atividadesdois;

public class Ex21 {

	public static void main(String[] args) {
		
		 String nome = "João Gomes";
	        double salarioBase = 2500.00;
	        double valorHoraExtra = 35.00;
	        int horasExtras = 8;

	        double valorHorasExtras = horasExtras * valorHoraExtra;
	        double salarioFinal = salarioBase + valorHorasExtras;

	        System.out.println("Nome: " + nome);
	        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
	        System.out.printf("Valor das horas extras: R$ %.2f%n", valorHorasExtras);
	        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);
	

	}

}
