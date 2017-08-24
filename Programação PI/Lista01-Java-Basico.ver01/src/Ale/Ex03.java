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
public class Ex03 {
    public static String extenso (int num){
        switch(num){
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
        if(num < 0 || num > 9){
            System.out.println("Desculpe, encontramos um erro...");
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um Número de '0 á 9': ");
        int num = console.nextInt();
        
        extenso (num);
    }
    
}
