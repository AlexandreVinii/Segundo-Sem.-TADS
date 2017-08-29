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
public class Ex07 {

    static double[] criaVetor(int tamanho) {

        double vetor[] = new double[tamanho];
        return vetor;
    }

    static double somaVetor(double[] vetor) {
        double soma = 0;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
            System.out.print("Digite a nota do primeiro Aluno: ");
            vetor[i] = console.nextDouble();
            } else {
                System.out.printf("Digite a nota do %dº Aluno: ", i+1);
                vetor[i] = console.nextDouble();
            }
            soma += vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite a quantidade de Alunos.");
        int tamanho = console.nextInt();
        double[] vetor = criaVetor(tamanho);
        
      double soma = somaVetor(vetor);
      
      double media = soma/tamanho;
      
        System.out.printf("A média final da sala é: %.1f\n\n",media);
    }

}
