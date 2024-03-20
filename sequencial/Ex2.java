package sequencial;

import java.util.Scanner;

public class Ex2 {
		
	public static void main(String[] args) {
		
		/*Ler uma medida em polegadas e imprimir a equivalente em centímetros, 
sabendo que 2.54 cm equivale a 1 polegada. */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero em polegas, vamos converte-lo em centimetros."
				+ "\n Lembrese que 1 polegada = 2.54cm ");
		
		double n = sc.nextDouble();
		
		double cm = n*2.54;
		
		System.out.println(n+" polegadas são " + cm+" centimetros");
		
		
	}
}
