package atividadeFor;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
	Scanner numeros = new Scanner (System.in);
	
	int totalPares = 0;
	int totalImpares = 0;
	
	// 10 números com laço de repetição FOR
	
	for (int i = 1; i <= 10; i++) {
		System.out.print("Digite o " + i + "º número: ");
		int numero = numeros.nextInt();
		
		// Laço condicional para verificar se o número é par ou ímpar
		
		if (numero % 2 == 0) {
			
			totalPares++; // Incrementa o contador de pares
	            } else {
	            	totalImpares++; // Incrementa o contador de ímpares
	            	}
		   }
		
		// Saída de dados com os resultados
		
		System.out.println("\nTotal de números pares: " + totalPares);
		System.out.println("Total de números ímpares: " + totalImpares);

	        numeros.close();

	}

}
