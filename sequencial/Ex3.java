package sequencial;

import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) {
		
		/*Faça um algoritmo que receba o salário-base de um funcionário, calcule e 
mostre o salário a receber, sabendo-se que esse funcionário tem gratificação de 
5% sobre o salário-base e paga imposto de 7% sobre o total. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sálario base de um funcionario, considerando que ele tenha gratificação"
				+ " ele receberá 5% a mais, e pagaá 7% do total em impostos");
		
		double salB = sc.nextDouble();
		double grat = salB*0.05;
		double salT = salB+grat;
		double imps = salT*0.07;
		double recT = salT-imps;
		
		System.out.println("O salario base é: " +salB);
		System.out.println("A gratificação é: " +grat);
		System.out.println("O salario total é: " +salT);
		System.out.println("Os impostos tem valor de: " +imps);
		System.out.println("Então ele recebera um total de: "+recT);
		
		
		
		
				
		
	}
}
