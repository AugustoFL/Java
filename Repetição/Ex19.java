package rp11_4_2024;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		/*19. Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram 
			digitados. Quando o valor 0 (zero) for lido, o algoritmo dever� cessar sua 
			execu��o.  */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos ler vinte numeros, vamos ver quantos est�o entre 100 e 200");
		int qtdc = 0;
		
		
		for(int i = 1; i<=20; i++) {
			
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			
			if (n == 0) {
				System.out.println("Voc� n�o deveria ter feito isso...");
				break;
			}
			
			else if ((n>100) && (n<200)) {
				qtdc++;
			}
			
		}
			System.out.println("A quantidade de numeros entre 100 e 200 �: " + qtdc );
			
	}
	
}
