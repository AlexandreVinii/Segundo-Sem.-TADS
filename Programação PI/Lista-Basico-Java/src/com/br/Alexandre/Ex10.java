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
public class Ex10 {
       public static void main(String[] args) {
        
        int tamanhoM1 = MatrizPrincipal.tamanho();
        
        int [][] m1 = MatrizPrincipal.CriaMatriz(tamanhoM1);
        m1 = MatrizPrincipal.PopularMatriz(m1);
        int [][] m2 = MatrizPrincipal.CriaMatriz(tamanhoM1);
        m2 = MatrizPrincipal.PopularMatriz(m2);
        
        System.out.print("Soma das Matrizes --> ");Soma(m1,m2);
        
    }
    static int Soma (int [][] m1, int [][] m2){
        int Soma = 0;
        for(int i = 0; i < m1.length; i++)
            for(int j = 0; j < m1[i].length; j++){
                 Soma += m1[i][j] + m2[i][j];
                 }
        System.out.printf("%d\t ", Soma);
        System.out.printf("\n");
                 
        return Soma;
        
    }
}