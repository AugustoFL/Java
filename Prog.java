package brain;


public class Prog {

		static int neuronio = 50;
		static boolean brain = true;
		static boolean empty = false;
		
		public static void main(String[] args) {
			int cont = 0;
			
			while (cont < 5) {
				if (brain!=empty) {
					keepCodding();
					
				} else {
					System.out.println("-------------Pausa pro café-------------");
					orderCoffe();
					System.out.println("----------------------------------------");

				}
				
						cont++;
			}
		}
			
	public static void keepCodding() {
		for(int i = 0; i < 3; i++) {
			int b;
			for(b = 1; b <= 10; b++) {
			System.out.println("Programando..." + b);
			}
			b = 0;
			neuronio -= 20;
			System.out.println("-------------Rodada " +(i+1) + " terminada-------------");
			if (neuronio < 0) {
				empty = true;
			}
		}
	}
	
	public static void orderCoffe() {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Bebendo café..." + i);
			neuronio += 10;			
				empty = false;
				
			}
		}
	}

