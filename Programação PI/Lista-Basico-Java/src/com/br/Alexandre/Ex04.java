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
public class Ex04 {
    
    //Método MAIN
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double num,soma = 0,media = 0;
        boolean erro = false;
        
        do{
        for(int i = 0; i < 5; i++){
                System.out.printf("Digite o %dº número: ",i+1);
           num = console.nextInt();
            soma += num;
        }
        media = soma/5;
        
        System.out.printf("Valor da Média é %.1f\n",media);
        
        if(media < 5){
            System.out.println("REPROVADO ! \n\n");
            break;
        }
        else if(media >= 5 && media < 9){
            System.out.println("APROVADO ! \n\n");
            break;
        }
        else if(media == 9){
            System.out.println("PARABÉNS ! \n\n");
            break;
        }if(media == 10){
            System.out.println("MASTERS OF THE UNIVERSE");
            break;
        }else{
            soma *= 0;
            System.out.println("Erro, digite as notas novamente...");
            erro = false;
        }
    }
        while(!erro);
  
}
}
