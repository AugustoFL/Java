package sele��o;

import java.util.Scanner;

public class Ex4 {
	
public static void main(String[] args) {
	
     /* 4- A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os funcion�rios 
		estatut�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio 
		bruto. Fazer um algoritmo que permita entrar com o sal�rio bruto e o valor da 
		presta��o e informar se o empr�stimo pode ou n�o ser concedido. */
	
	Scanner sc = new Scanner(System.in);
	
	// -------------------------------------------------------- //
	System.out.println("Informe o salario bruto do funcionario.");
	double sal = sc.nextDouble();
	// -------------------------------------------------------- //
	System.out.println("Informe o valor da presta��o.");
	double prest = sc.nextDouble();
	// -------------------------------------------------------- //
	double cred = (sal*0.30);
	if (cred >= prest) {
		System.out.println("O emprestimo pode ser concedido");
	}
	else {
		System.out.println("O emprestimo n�o pode ser concedido");
		
	}
	// -------------------------------------------------------- //
}
}
