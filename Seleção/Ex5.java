package sele��o;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/* 5- Fa�a um programa que o usu�rio informe o sal�rio recebido e o total gasto. 
			Dever� ser exibido na tela �Gastos dentro do or�amento� caso o valor gasto n�o 
			ultrapasse o valor do sal�rio e �Or�amento estourado� se o valor gasto 
			ultrapassar o valor do sal�rio. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salario recebido: ");
		double sal = sc.nextDouble();
		System.out.println("Informe o total gasto: ");
		double gast = sc.nextDouble();
		if (sal > gast) {
			System.out.println("Gastos dentro do or�amento. ");
		}
		else {
			System.out.println("Or�amento estourado.");
		}
	}
}
