package repeticao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/*16. Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
		
		Scanner sc = new Scanner(System.in);
		int np = 0, ni = 0;
		int n;
		
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um numero:");
			n = sc.nextInt();
			
			if (n%2==0) {
				np++;
			}
			else {
				ni++;
			}
			
		}
			System.out.println("O número de impars: " +ni);
			System.out.println("O número de pares: " +np);
		
	}
	
}
