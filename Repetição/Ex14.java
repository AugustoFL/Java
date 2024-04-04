package repeticao;

public class Ex14 {

	public static void main(String[] args) {
		
		/*Criar um algoritmo que imprima todos os números de 11 até 89 e a soma deles.*/
	
		 
	       
	        
			int v2 = 11;
			int vf = 0;
	        int vft = 0;
	        
	            for(int v = 11; v < 89; v++){
	            
	            vf = v +1;
	            System.out.print("Entre 11 " + "e 89 " + " temos o numero: " + v + "\n");
	            
	            v2 = v +1;
	            
	            vf = vf + v2;
	            
	            System.out.print("\nA soma atual é: " + vf + "\n");
	            }
	        
	        System.out.print(" \nNo final, a soma total é: " + vf + "\n");
		
	}
	
}
