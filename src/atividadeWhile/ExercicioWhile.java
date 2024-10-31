package atividadeWhile;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
	Scanner menormaior = new Scanner(System.in);
	
	int totalMenoresDe21 = 0;
	int totalMaioresDe50 = 0;
	int idade;
	
	// Laço de repetição para ler as idades
	
	while (true) {
		System.out.print("Digite uma idade: ");
		idade = menormaior.nextInt();
		
		// Verifique se a idade é negativa
		
		if (idade < 0) {
			break; // Encerre o laço se a idade for negativa
	            }
		
		// Condicional para verificar quantas pessoas tem menos de 21 anos
		
		if (idade < 21) {
			totalMenoresDe21++;
	            }
		
		// Condicional para verificar quantas pessoas tem mais de 50 anos
		
		if (idade > 50) {
			totalMaioresDe50++;
	            }
	        }
	
	// Saída de dados com os resultados
	
	System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenoresDe21);
	System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);
	
	menormaior.close();

	}

}
