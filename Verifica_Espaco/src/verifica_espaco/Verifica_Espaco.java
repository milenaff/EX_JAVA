/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_espaco;
import java.util.Scanner;

public class Verifica_Espaco {

   
    public static void main(String[] args) {
        Scanner console= new Scanner (System.in);
        boolean resp=false;
        String texto;
        System.out.println("Digite um texto");
        texto=console.nextLine();
        if(texto.contains(" "))
            resp=true;
        else 
            resp=false;
        
        if(resp)
            System.out.println("O texto possui espaços!");
        else
            System.out.println("O texto não possui espaços");
        
    }
    
}
