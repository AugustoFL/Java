package sele��o;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/* 1- Fa�a um algoritmo para ler dois n�meros inteiros e informar se estes s�o iguais 
		 ou diferentes. */
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Vamos comparar dois numeros intieros e ver se eles s�o iguais ou diferentes. \n");
			System.out.println("Digite o primeiro numero inteiro: ");
			int n1 = sc.nextInt();
			System.out.println("Digite o segundo numero inteiro: ");
			int n2 = sc.nextInt();
			
			if (n1 == n2) {
				System.out.println("Os numeros s�o iguais");
			}
			else {
				System.out.println("Eles s�o diferentes");
			}
	}
	
	
	
}
