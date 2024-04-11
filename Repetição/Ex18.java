package rp11_4_2024;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		/*18. Entrar com 20 números e imprimir a soma dos positivos e o total de números 
		  negativos. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos ler vinte numeros, somar os positivos e contar os negativos");
		
		int qtdn = 0;
		int somp = 0;
		
		for(int i = 1; i<=20; i++) {
			
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			
			if (n > 0) {
				somp = somp + n;
			}
			
			else if (n < 0) {
				qtdn++;
			}
			
		}
		
		System.out.println("Soma dos positivos: " + somp);
		System.out.println("Quantidade de negativos: " + qtdn);
		
	}
	
}
