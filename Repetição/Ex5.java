package repeticao;

public class Ex5 {

	public static void main(String[] args) {
		
		/*Faça um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 emita uma 
mensagem: “Múltiplo de 10”.  */
		
		for(int i = 1; i<101; i++ ) {
		
			System.out.println(i);
			
			if (i%10 == 0) {
				System.out.println("Multiplo de 10!\n");
			}
			
		}
	}
}
