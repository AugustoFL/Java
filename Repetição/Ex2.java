package repeticao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/* Fazer um programa para receber um n�mero inteiro do usu�rio e determinar se 
este n�mero � primo ou n�o. Primo � aquele divis�vel somente por ele mesmo e 
um.*/
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero inteiro, iremos verificar se ele � primo ou n�o. \n");
	
	int n = sc.nextInt();
	int veri = 0;
	 for (int i = 2; i <= n / 2; i++) {
		    if (n % i == 0) {
		       veri++;
		       break;
		    }

		    if (veri == 0)
		    	System.out.println(" � um n�mero primo\n" + n);
		    else
		       System.out.println(" n�o � um n�mero primo\n" + n);
	}
	
}
}