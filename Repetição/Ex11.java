package repeticao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		/*11. Ler dois números e imprimir todos os números ímpares entre eles. Suponha que 
o segundo é maior que o primeiro*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros, iremos ver todos os impares entre eles. \n" +
		"O primeiro DEVE ser menor que o segundo.");
		
		System.out.println("Digite o primeiro numero.");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero.");
		int n2 = sc.nextInt();
		
		if (n1<n2) {
			if (n1%2 == 0) {
				System.out.println("Mostrando resultados:");
				n1 = n1+1;
				System.out.println( n1 + " \n");
				while(n1<n2-2) {
					n1 = n1+2;
					System.out.println(n1+"\n");
					
				}
			}
		
			else {
				System.out.println("Mostrando resultados:");
				System.out.println(n1 + " \n");
				while(n1<n2-2) {
					n1 = n1+2;
					System.out.println(n1+ "\n");
				}
			}
		}									
	}			
}
