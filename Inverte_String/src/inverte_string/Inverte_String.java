/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverte_string;
import java.util.Scanner;
/**
 *
 * @author 082170022
 */
public class Inverte_String {

   
    public static void main(String[] args) {
        Scanner console= new Scanner (System.in);
        String texto;
        String texto_Inv="";
        System.out.println("Digite um texto que será invertido");
        texto=console.nextLine();
        for(int i=texto.length()-1; i>=0;i--)
        {
            texto_Inv = texto_Inv + texto.charAt(i);
        }
        System.out.println("Texto invertido: "+texto_Inv);
    }
    
}
