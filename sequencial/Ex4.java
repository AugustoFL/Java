package sequencial;

import java.util.Scanner;

public class Ex4 {

	
	public static void main(String[] args) {
		/*Fa�a um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, 
calcule e mostre: 
	a) a idade atual dessa pessoa.  
	b) quantos anos ela ter� em 2018. */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento: ");
		int anNasc = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anAtul = sc.nextInt();
		
		int idadeA = anAtul-anNasc;
		int idade2018 = 2018 - anNasc;
		
		System.out.println("Voc� nasceu em: " +anNasc);
		System.out.println("O ano atual �: " +anAtul);
		System.out.println("Sua idade atual �: " + idadeA);
		System.out.println("Sua idade em 2018 era: " +idade2018);
		
		
		
	}
}
