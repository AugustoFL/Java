package repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/* Fazer um programa para receber um número inteiro do usuário e determinar se 
este número é primo ou não. Primo é aquele divisível somente por ele mesmo e 
um.*/
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero inteiro, iremos verificar se ele é primo ou não. \n");
	
	int n = sc.nextInt();
	int veri = 0;
	 for (int i = 2; i <= n / 2; i++) {
		    if (n % i == 0) {
		       veri++;
		       break;
		    }

		    if (veri == 0)
		    	System.out.println(" é um número primo\n" + n);
		    else
		       System.out.println(" não é um número primo\n" + n);
	}
	
}
}