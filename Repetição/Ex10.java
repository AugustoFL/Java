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
public class Ex10 {
     public static void main(String[] args) {
         /*10. Leia 5 idades e calcule a média entre as idades (usar uma variável para idade). */
            System.out.print("Vamos ver a media de cinco idades. \n");
            
            Scanner sc = new Scanner(System.in);
            int idade;
            int idadeT = 0;
            
            for(int cont = 1; cont < 6; cont++ ){
                System.out.print("Digite a idade da pessoa número " + cont + ":");
                idade = sc.nextInt();
                
                idadeT = idadeT + idade;
            }
            
            System.out.print("A media de idade das cinco pessoas é: " + idadeT / 5 );
            
            
     }
}
