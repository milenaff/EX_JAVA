/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menor_num;
import java.util.Scanner;
/**
 *
 * @author 082170022
 */
public class Menor_Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console= new Scanner (System.in);
        int menor;
        int[] vetor= new int [5];
        System.out.println("Digite 5 numeros");
        for(int i=0; i<5;i++)
        {
            vetor[i]= Integer.parseInt(console.nextLine());
        } 
        menor=vetor[0];
        for(int i=0; i<5;i++)
        {            
            if(vetor[i]< menor)
                menor=vetor[i];
        }
        System.out.println("O menor numero é " + menor);
                
    }
    
}
