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
public class Ex02 {

    //Verifica se o numero digitado e Primo
    public static boolean ehPrimo(int num) {
        boolean primo = false;
        int cont = 0;

        for (int i=1;i<=num;i++ ){
   if(num%i == 0){
   cont++;
   }
  }
  if (cont==2){
      primo = true;
        }
        return primo;
    }
    
    //Verifica se o numero digitado é Par
    public static boolean ehPar(int num) {
        boolean par;

        if (num % 2 == 0) {
            par = true;
        } else {
            par = false;
        }
        return par;
    }
    
    public static void imprimir (boolean par,boolean primo,int num){
        
        if(par == true && primo == true){
            System.out.println("O numero digitado é um número par, e também um número primo. ");
        }
        if(par == true && primo == false){
            System.out.println("O numero digitado é um número par, e não é um número primo. ");
        }
        if(par == false && primo == true){
            System.out.println("O numero digitado é um número ímpar, e também um número primo. ");
        }if(par == false && primo == false){
            System.out.println("O numero digitado é um número ímpar, e não é um número primo. ");
            
        }
        
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int num = console.nextInt();
        
        boolean par = ehPar(num);
        boolean primo = ehPrimo(num);
        imprimir(par,primo,num);

    }

}
