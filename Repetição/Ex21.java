package rp11_4_2024;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		/*21. Entrar com um número inteiro positivo e exibir o fatorial deste número, 
			  lembrando que 0! = 1. Exemplo: 5! = 5x4x3x2x1 = 120 */
		
		System.out.println("Vamos exibir o fatorial de um numero inteiro positivo.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		int n = sc.nextInt();
		
		int f = 1;
		
		for(int i = n; i >= 1; i=i-1) {
			
		f = i*f;	
		
		
		}
		
		System.out.println("Fatorial de " + n + ":" + f);
	}
	
}
