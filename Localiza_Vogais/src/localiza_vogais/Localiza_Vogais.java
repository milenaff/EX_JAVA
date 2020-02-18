/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localiza_vogais;
import java.util.Scanner;

public class Localiza_Vogais {

   
    public static void main(String[] args) {
       Scanner console= new Scanner (System.in);
       String texto;
       String vogais="";
       System.out.println("Type a word");
       texto= console.nextLine();
       
       for(int i=0; i<=texto.length()-1;i++)
       {
           if(texto.toUpperCase().charAt(i)=='A' ||texto.toUpperCase().charAt(i)=='E'|| texto.toUpperCase().charAt(i)=='I'||texto.toUpperCase().charAt(i)=='O'||texto.toUpperCase().charAt(i)=='U')
           {
               vogais=vogais+texto.charAt(i);
           }
       }
       System.out.println("Vogais: "+vogais);
    }
    
}
