package seleção;

import java.util.Scanner;

public class Ex4 {
	
public static void main(String[] args) {
	
     /* 4- A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários 
		estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário 
		bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da 
		prestação e informar se o empréstimo pode ou não ser concedido. */
	
	Scanner sc = new Scanner(System.in);
	
	// -------------------------------------------------------- //
	System.out.println("Informe o salario bruto do funcionario.");
	double sal = sc.nextDouble();
	// -------------------------------------------------------- //
	System.out.println("Informe o valor da prestação.");
	double prest = sc.nextDouble();
	// -------------------------------------------------------- //
	double cred = (sal*0.30);
	if (cred >= prest) {
		System.out.println("O emprestimo pode ser concedido");
	}
	else {
		System.out.println("O emprestimo não pode ser concedido");
		
	}
	// -------------------------------------------------------- //
}
}
