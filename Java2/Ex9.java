package exerciciosSelecao;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um codigo de produto e em seguida sua"
				+ " quantidade, vamos calcular o valor total. Um produto por vez"
				+ "\n  Código - Cargo - Percentual " 
				+ "\n   101  | Gerente    | 10%"
				+ "\n   102  | Engenheiro | 20%"
				+ "\n   103  | Técnico    | 30%"
				+ "\n    -   | Outros     | 40%"
				+ "\n Digite o codigo do produto: ");
		
		int cod = sc.nextInt();
		
		System.out.println("\n Codigo selecionado: " + cod);
		
		System.out.println("\n Digite o salario: ");
		double sal = sc.nextDouble();
		double aumento = 0;
		switch (cod) {
		case 101: {
			
			aumento = sal*0.10;
			break;
		}
		
		case 102: {
		
			aumento = sal*0.20;
			break;
		}
		 
		case 103: {
			aumento = sal*0.30;
			break;
		}
		
		default: {
			System.out.println("\nCodigo não reconhecido, considerando aumento de 40%");
			aumento = sal*0.40;
			break;
		}
		}
		
		 double sal2= sal+aumento;
		 System.out.println("\nO salario antigo era: " + sal);
		 System.out.println("\nO novo salario é: " + sal2);
		 System.out.println("A diferença entre eles é: " + (sal2-sal));
		 
		 
		}
	}

