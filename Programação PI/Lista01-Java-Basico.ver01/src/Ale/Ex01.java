/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ale;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex01 {
    
    
    public static void main(String[] args) {
        double num = usuario ();
        
        verifica(num);
        
    }
    
    public static double usuario () {
    
        Scanner console = new Scanner (System.in);
        System.out.println("Digite um valor: ");
        double num = console.nextDouble();
        
        return num;
}
            
    public static boolean verifica (double num){
        boolean verificador = false;
        if(num >= 50.0){
            System.out.println("SUCESSO !");
            verificador = true;
        }else{
            System.out.println("ERRO...");
            verificador = false;
        }
        System.out.println("Fim do Programa...");
      return verificador;  
    }
}
