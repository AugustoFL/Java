package sele��o;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	/* 6 - Fa�a o algoritmo que leia o valor de uma conta de luz (CL) e, caso o valor seja 
		  maior que R$ 150,00, apresente a mensagem: �Voc� est� gastando muito�. Caso 
		  contr�rio exiba a mensagem: �Seu gasto foi normal�. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu gasto na conta de luz.");
		double cl = sc.nextDouble();
		if (cl < 150.00) {
			System.out.println("Seu gasto foi normal");
			
		}
		else {
			System.out.println("Voc� est� gastando muito.");
		}
	}
}
