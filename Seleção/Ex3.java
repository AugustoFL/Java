package seleção;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
	
		/* 3- Escrever um programa para ler um número inteiro e informar se ele é divisível 
		   por 5. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro e veremos se ele é divisivel por 5.");
		int n = sc.nextInt();
		if((n%5) == 0) {
			System.out.println("O numero é divisivel por 5. O numero é: " + n);
		}
		else {
			System.out.println("O numero não é divisivel por 5. O numero é: " + n);
		}
	}
	
}
