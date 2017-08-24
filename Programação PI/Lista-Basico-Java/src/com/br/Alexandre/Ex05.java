/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Alexandre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex05 {
    public static Random rd = new Random ();
    
    //Verifica se o numero do usuario é igual ao numero Random.
    public static boolean verifica_Acerto (int num,int random){
        
        boolean acerto = false;
        
        
        if(num == random){
            System.out.println("Parabéns Você Acertou !!");
            System.out.println("O numero foi o "+random);
            acerto = false;
        } else {
            System.out.println("\nQue Pena, você errou ! tente outra Vez, você consegue ! \n");
            acerto = true;
        }
    return acerto;
    }
    
    public static void main(String[] args) {
       int random = rd.nextInt(20)+1;
        Scanner console = new Scanner (System.in);
        boolean desistir = false;
            System.out.println("Tente adivinhar o numero que estou pensando ! Vamos lá.\n");
        do{
            String digitado = console.nextLine().toLowerCase();
            try{
        int num = Integer.parseInt(digitado);
        boolean win = verifica_Acerto(num,random);
        if(win == true){
            desistir = false;
        }else{
            desistir = true;
        }
            }
            catch(java.lang.NumberFormatException e){
                if("desistir".equals(digitado)){
                    System.out.println("\nQue pena, você desistiu...");
                System.out.println("O número para ser adivinhado era "+random);
                    desistir = true;
                }
                else{
                    desistir = false;
                }
            }
        }
        while(!desistir);
    }
}
