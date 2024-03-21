package repeticao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		/*Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada 
de 1 a 10 do valor lido. */
		
		System.out.println("Digite um numero para consultar sua tabuada. Apenas numeros"
				+ " entre 1 e 10 são aceitos");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if ( n>0 && n <11 ) {
			for(int i = 1; i<11; i++) {
				int vl = n*i;
				System.out.println(n + " * " + i + " = " + vl + "\n");
			}
		}
		
		else {
			System.out.println("Tente novamente ao reiniciar o programa. Numero invalido error");
		}
		
	}
	
}
