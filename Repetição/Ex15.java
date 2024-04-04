package repeticao;

public class Ex15 {

	public static void main(String[] args) {
		
		/*15. Criar um algoritmo que imprima a soma dos números pares entre 25 e 200.*/
		
		int v2 = 11;
		int vf = 0;
        
            for(int v = 26; v < 200; v = v+2){
            
            vf = v +1;
            System.out.print("Entre 25 " + "e 100 " + " temos o numero: " + v + "\n");
            
            v2 = v +1;
            
            vf = vf + v2;
            
            System.out.print("\nA soma atual é: " + vf + "\n");
            }
        
        System.out.print(" \nNo final, a soma total é: " + vf + "\n");
	
	}
	
}
