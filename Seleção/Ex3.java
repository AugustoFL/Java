package sele��o;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
	
		/* 3- Escrever um programa para ler um n�mero inteiro e informar se ele � divis�vel 
		   por 5. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro e veremos se ele � divisivel por 5.");
		int n = sc.nextInt();
		if((n%5) == 0) {
			System.out.println("O numero � divisivel por 5. O numero �: " + n);
		}
		else {
			System.out.println("O numero n�o � divisivel por 5. O numero �: " + n);
		}
	}
	
}
