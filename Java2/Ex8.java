package exerciciosSelecao;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		/* 8) O cardápio de uma lanchonete é o seguinte: 
				Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule 
				o valor a ser pago por aquele lanche. Considere que a cada execução somente 
				será calculado um item.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um codigo de produto e em seguida sua"
				+ " quantidade, vamos calcular o valor total. Um produto por vez"
				+ "\n Especificação - Código - Preço " 
				+"\n Cachorro Quente | 100 | 1,20"
				+ "\n Bauru Simples   | 101 | 1,30"
				+ "\n Bauru com ovo   | 102 | 1,50"
				+ "\n Hambúrger       | 103 | 1,20"
				+ "\n Cheeseburger    | 104 | 1,30"
				+ "\n Refrigerante    | 105 | 1,00"
				+ "\n Digite o codigo do produto: ");
		
		int cod = sc.nextInt();
		
		System.out.println(" Codigo selecionado: " + cod);
		double prod = 0; 
		switch (cod) {
		case 100: {
			
			 prod = 1.20;
			break;
		}
		
		case 101: {
			 prod = 1.30;
			break;
		}
		 
		case 102: {
			 prod = 1.50;
			break;
		}
		
		case 103: {
			 prod = 1.20;
			break;
		}
		
		case 104: {
			 prod = 1.30;
			break;
		}
		
		case 105: {
			 prod = 1.00;
		}
		default:
		        System.out.println("Codigo invalido, reinicie o programa e tente novamente.");
		        break;
		}
		
		System.out.println("\n Digite a quantidade: ");
		int qtd = sc.nextInt();
		
		double vltl = prod * qtd;
		 
		System.out.println("O valor total da compra foi: " + vltl);
		
	}
}
