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
public class Ex03 {

    //Método transforma o número digitado em um número por extenso,
    public static int numExtenso(int num, boolean checker) {
        if (checker == false){
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
        }
        }else{
            System.out.println("Ops! Acho que ocorreu um erro, desculpe...");
        }
        return num;
    }
    
    /*Método verifica se o numero é 'menor que Zero ou maior que Nove'
    variável 'checker' do tipo boolean recebe true caso maior que Nove OU
    menor que Zero e retorna valor de acordo.
    */
    public static boolean verificaNum (int num){
        boolean checker = false;
        
        if(num < 0 || num > 9){
            checker = true;
        }else{
            checker = false;
        }
        return checker;
    }

    //Método MAIN
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite número de '0 á 9' ");
        int num = console.nextInt();
        
        boolean checker = verificaNum(num);
        numExtenso(num,checker);
    }

}
