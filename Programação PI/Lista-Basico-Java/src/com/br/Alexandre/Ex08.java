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
public class Ex08 {

    static double[] criaVetor(int tamanho) {

        double vetor[] = new double[tamanho];
        return vetor;
    }

    static double maiorVetor(double[] vetor, int tamanho) {
        double maior = 0;
        int cont = 0;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = console.nextDouble();
            cont++;

            if (maior < vetor[i]) {
                maior = vetor[i];
            }
            if (cont == tamanho) {
                System.out.printf("O maior numero é o '%.0f' na %dº posição \n\n", maior, i);
            }

        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros para descobrir qual é o maior !.");
        int tamanho = console.nextInt();
        double[] vetor = criaVetor(tamanho);

        maiorVetor(vetor, tamanho);

    }

}
