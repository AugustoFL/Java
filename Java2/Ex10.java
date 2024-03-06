package exerciciosSelecao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos registrar um funcinario e, se possivel, aplicar um aumento."
				+" \n Categoria 'M' - Mensalista = 10 % "
				+" \n Categoria 'H' - Horista    = 20 % "
				+" \n Categoria 'O' - Outros     =  - %");
		
		System.out.println("\n Primeiro, vamos registrar seu nome: ");
		String nome = sc.next();
		
		System.out.println("\n Agora a categoria. Digite a sua categoria: ");
		String cat = sc.next();
		
		System.out.println("\n Agora, digite seu salario: ");
		double sal = sc.nextDouble();
		
		double aumento = 0;
		
		switch (cat) {
		case "M": {
		System.out.println("Categoria mensalista, aplicando aumento de 10%");	
		 aumento = sal*0.10;
		 break;
		}
		case "H": {
			System.out.println("Categoria horista, aplicando aumento de 20%");
			aumento = sal*0.20;
			break;
		}
		default:
			System.out.println("Codigo invalido, precedendo sem aumento");
			break;
		}
		
		sal = sal+aumento;
		
		System.out.println("Imprimindo ficha: \n"
				+"Nome: " +nome + "\n"
				+"Salario: "+sal + "\n"
				+"Categoria:"+cat + "\n");
	}
}
