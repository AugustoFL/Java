package repeticao;

public class Ex3 {

	public static void main(String[] args) {
		
		/*Fazer um programa para encontrar todos os pares entre 1 e 100.  */
		
		
		System.out.println("Vamos olhar todos os numeros pares entre 1 e 100... \n");
		
		for(int i = 1; i<100; i++ ) {
			
		int n = i%2;
		
		if (n == 0) {
			System.out.println(i);
		}
			
		}
		
	}
	
}
