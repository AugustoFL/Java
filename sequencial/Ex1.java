package sequencial;

import java.util.Scanner;

public class Ex1 {

	private static Scanner sc;

	public static void main(String[] args) {
	
		/*Fazer um algoritmo que leia um n�mero inteiro e escreva o seu antecessor e o 
		seu sucessor.*/
		
		sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro, iremos ver seu"
				+ "antecessor e seu sucessor");
		
		int n = sc.nextInt();
		
		System.out.println("Seu numero digitado �:" + n);
		System.out.println("Seu antecessor �: " + (n-1));
		System.out.println("Seu sucessor �: " + (n+1));
		
	}
	
	   
	
	
}
