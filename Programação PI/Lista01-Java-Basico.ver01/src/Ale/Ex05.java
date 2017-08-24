/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex05 {
   static Scanner console = new Scanner (System.in);
    static Random rd = new Random ();
       static int random = rd.nextInt(20)+1;
    
    public static boolean validaChute (int random, int num){
        boolean acertou = false;
        if(random == num){
            System.out.printf("Parábens Você Adivinhou ! o numero %d\n\n",random);
            acertou = true;
        }else{
            acertou = false;
        }
      return acertou;
    }
    
    public static void main(String[] args) {
        boolean chance = false;
        do{
        System.out.println("Tente adivinhar o número que estou pensando... Vamos Lá !");
        String num1 = console.next().toLowerCase();
           try{
        int num = Integer.parseInt(num1);
        boolean chutometro = validaChute(random,num);
        if(chutometro == true){
            chance = true;
        }
            }catch (java.lang.NumberFormatException e){
                if("desistir".equals(num1)){
                System.out.println("Que pena, Você desistir.");
                System.out.println("O número que estava em minha cabeça era "+random);
                chance = true;
                }else{
                    System.out.println("Ops ! você não digitou um numero, tente outra vez!");
                }
            }
                }
        while(!chance);
    }
    
}
