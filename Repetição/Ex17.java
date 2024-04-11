package rp11_4_2024;

import java.util.Scanner;

public class Ex17 {

		public static void main(String[] args) {
			
			/*17. Entrar com 15 números e imprimir quantos números maiores que 30 foram 
				  digitados.  */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite 15 numeros, veremos quantos são maiores que trinta");
			
			int qtdn = 0;
			
			for(int i = 1; i <= 15; i++) {
				
				System.out.println("Digite um número: ");
				int n = sc.nextInt();
				
				if(n>30) {
					qtdn++;
				}
				
				
			}
			
			System.out.println("A quantidade de numeros maiores que trinta são: " + qtdn);
			
		}
	
}
