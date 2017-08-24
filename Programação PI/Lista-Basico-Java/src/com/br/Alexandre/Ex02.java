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
public class Ex02 {
// Exercicio Teste Feito de outra Maneira está como 'comentários' no codigo. (teste)
    //Obs. Cada método tem seus comentários.
    
    
    //Verifica se o numero digitado pelo usuário é Par
    public static boolean ehPar(double num) {
        boolean par = true;
        
        //Caso for par a variável receberá Verdadeiro.
        if (num % 2 == 0) {
            par = true;
            // (teste) System.out.printf("O numero digitado -> %.0f é um numero Par \n",num);
            
            //Caso seja ímpar variável 'par' receberá falso.
        } else {
            par = false;
            // (teste) System.out.printf("O numero digitado -> %.0f é um numero Ímpar \n",num);
        }
        return par;
    }
    
    //Verifica se o numero digitado pelo usuário é um numero primo
    public static boolean ehPrimo(double num) {
        boolean primo = true;
        
        /*Faz a contagem para saber se é um numero primo.
        Numeros primos são apenas divisíveis 2 vezes, por um e
        por eles mesmos.
        */
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        // Caso seja um numero primo a variável 'primo' recebe verdadeiro.
        if (cont == 2) {
            primo = true;
            // System.out.printf("O numero digitado -> %.0f é um numero Primo\n\n",num);
            
            
        // Caso não seja um numero primo a variável 'primo' recebe falso.
        } else {
            primo = false;
            //  System.out.printf("O numero digitado -> %.0f não é um numero Primo\n\n",num);
        }
        return primo;
    }
    
    //Imprime os valores retornados dos métodos 'ehPrimo' & 'ehPar'.
    public static void Imprimir(double num) {
        boolean par = ehPar(num);
        boolean primo = ehPrimo(num);
        if (par == true && primo == true) {
            System.out.printf("O numero digitado -> '%.0f' é um número Par e também um numero Primo \n\n",num);
            
        }
        else if (par == true && primo == false) {
            System.out.printf("O numero digitado -> '%.0f' é um número Par e não é um numero Primo \n\n",num);
            
        
        }else if (par == false && primo == false) {
            System.out.printf("O numero digitado -> '%.0f' é um número Ímpar e não é um numero Primo \n\n",num);
        }else{
            System.out.printf("O numero digitado -> '%.0f' é um número Ímpar e é também numero Primo \n\n",num);
            
        }
    }
    
    //Método MAIN
    public static void main(String[] args) {
        boolean erro = false;

        do {
            /*Tratamento de erros caso usuário digite,
            algo que não seja um número válido.
            */
            try {

                Scanner console = new Scanner(System.in);
                System.out.print("\n\nDigite um número: ");
                double num = console.nextDouble();
                Imprimir(num);
                
                /*
                Exercicio Feito de outra Maneira está como 'comentários' no codigo(teste)
                //ehPar(num);
                //ehPrimo(num);
                
                */
                
                if (erro) {
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("\n\nVocê não está digitando um número, por favor tente novamente... ");
                erro = true;
            }
        } while (erro);

    }

}
