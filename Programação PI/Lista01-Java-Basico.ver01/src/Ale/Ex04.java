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
public class Ex04 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        boolean ver = true;
        do{
            for(int i = 0; i < 5; i++){
        System.out.printf("Digite o %dº Número : ",i+1);
        double num = console.nextDouble();
        soma += num;
            }
        media = soma/5;
            System.out.println("Sua média é "+media);
        if(media < 5){
            System.out.println("REPROVADO !");
            break;
        }
        else if(media >= 5 && media < 9){
            System.out.println("APROVADO !");
            break;
        }
        else if(media == 9){
            System.out.println("PARABÉNS !");
            break;
        }else if (media == 10){
            System.out.println("MASTER OF THE UNIVERSE");
            break;
        }else{
                System.out.println("Ocorreram alguns erros no calculo da média, tente novamente...");
            ver = false;
            soma *= 0;
        }
        }
        while(!ver);
    }
    
}
