/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author 082170022
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
     
        Scanner console= new Scanner (System.in);
        int num=0;
        int start=10;
        System.out.println("Digite o numero que deseja a tabuada");       
        num = Integer.parseInt(console.nextLine());
        do
        {
          System.out.println(num + "x" + start+ "=" + num*start); 
          start--;
        } while(start>=0);
    }
    }
    




    

