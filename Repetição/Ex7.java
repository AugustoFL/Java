/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Ex7 {
    
    
    public static void main(String[] args) {
    
    /*Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 
valores lidos (incluindo os valores lidos na soma). Considere que o segundo 
valor lido será sempre maior que o primeiro valor lido. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero, iremos calcular a soma dos "
                + "numeros inteiros existentes entre eles. \n"
                + "Lembrese que o segundo deve ser maior que o primeiro");
        
        System.out.print("\n Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        
        System.out.print("\n Digite o segundo numero: ");
        int n2 = sc.nextInt();
        
        int vf = n1 +1;
        int vft = 0;
        
        for(int v = n1 + 1; v < n2 - 1; v++){
            System.out.print("Entre " + n1 + " e " + n2 + " temos o numero: " + v + "\n");
            
            int v2 = v +1;
            
            vf = vf + v2;
            
            System.out.print("\nA soma atual é: " + vf + "\n");
        }
        
        System.out.print(" \nNo final, a soma total é: " + vf + "\n");
        
        
        
        
                
        
            }

    
}
