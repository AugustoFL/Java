package sequencial;

import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) {
		
		/*Fa�a um algoritmo que receba o sal�rio-base de um funcion�rio, calcule e 
mostre o sal�rio a receber, sabendo-se que esse funcion�rio tem gratifica��o de 
5% sobre o sal�rio-base e paga imposto de 7% sobre o total. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o s�lario base de um funcionario, considerando que ele tenha gratifica��o"
				+ " ele receber� 5% a mais, e paga� 7% do total em impostos");
		
		double salB = sc.nextDouble();
		double grat = salB*0.05;
		double salT = salB+grat;
		double imps = salT*0.07;
		double recT = salT-imps;
		
		System.out.println("O salario base �: " +salB);
		System.out.println("A gratifica��o �: " +grat);
		System.out.println("O salario total �: " +salT);
		System.out.println("Os impostos tem valor de: " +imps);
		System.out.println("Ent�o ele recebera um total de: "+recT);
		
		
		
		
				
		
	}
}
