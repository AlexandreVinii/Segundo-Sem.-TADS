/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Alexandre;

/**
 *
 * @author Alexandre
 */
public class Ex06 {

    //Método para Criar Matriz.
    public static int[][] criaMatriz() {
        int n = 10;
        int matriz[][] = new int[n][n];

        return matriz;
    }

    public static void Tabuada(int[][] matriz) {
        int[][] tabela = criaMatriz();
        
         for (int j = 1; j < tabela.length; j++) {
             if (j == 1) {
            System.out.printf("          %d\t",j);
             }else{
                 
            System.out.printf("%d\t", j);
             }
            
            
        }
        
            System.out.println("\n   ----|---------------------------------------------------------------------");
        
        int multiplica = 1;
        for (int i = 1; i < matriz.length; i++) {
           
                    System.out.printf("     %d |  ",i);
            for (int j = 1; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
                multiplica = matriz[i][j];
                if(j < 9){
                    System.out.printf("%d\t",multiplica);
                }
                else if (i == 1 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 2 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 3 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 4 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 5 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 6 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 7 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 8 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
                else if (i == 9 && j == 9 ) {
            System.out.printf("%d\n",multiplica);
            }
            }
        }
        
        
        
        
        
        
        //--------------------------------------------------
    }

    public static void main(String[] args) {
        int matriz[][] = criaMatriz();

         Tabuada(matriz);

       // imprimirTabuada(tabuada);
    }

   /* public static void imprimirTabuada(int tabuada) {
        int[][] tabela = criaMatriz();

        for (int i = 1; i < tabela.length; i++) {
            if (i == 1) {
                System.out.printf("   * |", i);
            }
            System.out.printf(" %d", i);
            if (i == 9) {
                System.out.printf("   \n", i);
            }

        }
        System.out.println(" ----|------------------");

        for (int j = 1; j < tabela.length; j++) {
            System.out.printf("   %d | \n", j);
        }
        
        for (int i = 1; i < tabela.length; i++) {
            for (int j = 1; j < tabela[i].length; j++) {
                tabela[i][j] = tabuada;
        System.out.println(tabuada);
            }
        }
        
    }*/

}
