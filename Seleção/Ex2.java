package sele��o;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		
		/* 2- Uma loja fornece 10% de desconto para funcion�rios e 5% de desconto para 
			clientes vips. Fa�a um programa que calcule o valor total a ser pago por uma 
			pessoa. O programa dever� ler o valor total da compra efetuada e um c�digo que 
			identifique se o comprador � um cliente comum (1), funcion�rio (2) ou vip (3).*/
		
		Scanner sc = new Scanner(System.in);
		///////////////////
		System.out.println("Digite o valor da compra: ");
		double cmp = sc.nextDouble();
		///////////////////////////////////////////
		System.out.println("Digite o codigo do comprador: \n (1) - Cliente comum = Sem desconto. \n (2) - Funcionario = 10% de desconto \n"
				+ "(3) - Cliente vip = 5% de desconto.");
		int codigo = sc.nextInt();
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		switch (codigo) {
		case 1: {
			
			System.out.println("O valor da compra, visto que ele � um cliente comum � de: " +cmp);
			break;
		}
		
		case 2: {
			cmp = cmp - (cmp*0.10);
			System.out.println("O valor da compra, visto que ele � um funcionario � de: " + cmp*10);
			break;
		}
		case 3: {
			cmp = cmp - (cmp*0.05);
			System.out.println("O valor da compra, visto que ele � um cliente vip � de: " + cmp*10);
			break;
		}
		default:
			System.out.println("Codigo invalido, voc� digitou: " + codigo);
			break;
			
		}
	}
	
	
}
