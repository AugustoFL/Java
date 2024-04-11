package rp11_4_2024;

public class Ex20 {

	public static void main(String[] args) {
		
		/*20. Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e 
			cresce 3 centímetros por ano. Construir um algoritmo que calcule e imprima 
			quantos anos serão necessários para que Juca seja maior que Chico.*/
		
		System.out.println("Vamos ver quanto tempo leva para Juca ser maior que Chico, "
				+ "com as seguintes condições: "
				+ "\n Chico tem 1,50m e cresce 2cm por ano. "
				+ "\n Juca tem 1,10m e cresce 3cm por ano.");
		
		int alChico = 150; //Usando centimetros
		int alJuca = 110;  //Usando centimetros
		int qtdano = 0;
		
		
		for(alJuca = 110; alJuca <= alChico; alJuca = alJuca + 3 ) {
		
			alChico = alChico + 2;
			qtdano++;
		}
		
		System.out.println("Foram nescessarios: " + qtdano + " anos para Juca se tornar maior que Chico.");
		System.out.println("Altura de Chico no final: " + alChico);
		System.out.println("Altura de Juca no final: " + alJuca);
		
	}
	
}
