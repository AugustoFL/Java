package repeticao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		/*16. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/
		
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
			System.out.println("O n�mero de impars: " +ni);
			System.out.println("O n�mero de pares: " +np);
		
	}
	
}
