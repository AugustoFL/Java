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
public class Ex8 {
    
    
        public static void main(String[] args) {

    /*
    Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os 
dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe: 
    a) a média de salário do grupo; 
    b) quantidade de mulheres com salário até R$1500,00.        
    */
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Vamos ver em um numero de habitantes, a idade,"
                    + " sexo (M/F) e o salario do grupo.");
            
            System.out.print("\nPrimeiro, informe a quantidade de habitantes: ");
            int h = sc.nextInt();
            
            double mediaSal = 0;
            int mS = 0;
            
            for(int ha=1; ha<=h; ha++){
                
                System.out.print("\nInforme a idade do habitante numero " + ha + ":");
                int id = sc.nextInt();
                
                System.out.print("\nInforme o salario do habitante: ");
                double sal = sc.nextDouble();                
                 mediaSal = mediaSal + sal;
                 
                System.out.print("\nInforme o sexo: \n [1] - Masculino \n [2] - Feminino"
                        + "\n Digite:");
                int sex = sc.nextInt();
                 
                if ((sex == 2) && (sal <= 1500)){
                     mS++;
                }
                System.out.print("\nQuantidade de mulheres: " +mS);
            
            System.out.print("\nA media de salario do grupo é: " + mediaSal / h);
            System.out.print("\nA quantidade de mulheres com salario até "
                    + "R$1500,00 é: " + mS);
            
            }
    }
}
