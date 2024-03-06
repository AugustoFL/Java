package seleção;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/* 1- Faça um algoritmo para ler dois números inteiros e informar se estes são iguais 
		 ou diferentes. */
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Vamos comparar dois numeros intieros e ver se eles são iguais ou diferentes. \n");
			System.out.println("Digite o primeiro numero inteiro: ");
			int n1 = sc.nextInt();
			System.out.println("Digite o segundo numero inteiro: ");
			int n2 = sc.nextInt();
			
			if (n1 == n2) {
				System.out.println("Os numeros são iguais");
			}
			else {
				System.out.println("Eles são diferentes");
			}
	}
	
	
	
}
