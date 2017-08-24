/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Alexandre;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex01 {
    static public Scanner console = new Scanner (System.in);
    
    //Verifica o valor do numero digitado pelo usuário.
    public static boolean checker (double num){
        
        boolean check = true;
        
        //Caso seja maior igual que 50.0 aparece no console a mensagem 'SUCESSO'
       if(num >= 50.0){
            check = true;
            System.out.println("\n\nSUCESSO...\n\n");
        }
       
        //Caso seja menor igual que 50.0 aparece no console a mensagem 'ERRO'
       else if(num <= 50.0){
           check = false;
            System.out.println("\n\nERRO...\n\n");
       }
        System.out.println("FIM DO PROGRAMA !\n\n");
        return check;
    }
    
    //Método MAIN
    public static void main(String[] args){
        System.out.print("Digite um Valor -> ");
          double  num = console.nextDouble();
        checker(num);
    }
    
}
