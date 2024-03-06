package seleção;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/* 5- Faça um programa que o usuário informe o salário recebido e o total gasto. 
			Deverá ser exibido na tela “Gastos dentro do orçamento” caso o valor gasto não 
			ultrapasse o valor do salário e “Orçamento estourado” se o valor gasto 
			ultrapassar o valor do salário. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salario recebido: ");
		double sal = sc.nextDouble();
		System.out.println("Informe o total gasto: ");
		double gast = sc.nextDouble();
		if (sal > gast) {
			System.out.println("Gastos dentro do orçamento. ");
		}
		else {
			System.out.println("Orçamento estourado.");
		}
	}
}
