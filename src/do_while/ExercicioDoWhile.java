package do_while;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner soma = new Scanner(System.in);
		
		int numero;
		int somaPositivos = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = soma.nextInt();
			
			// Verifique se o número é positivo
			
			if (numero > 0) {
				somaPositivos += numero; // Adicione na soma se for positivo
		            }
			} while (numero != 0); // Continue até que o número zero seja digitado
		
		// Saída de dados com os resultados
		
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
		
		soma.close();
		
	}

}
