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
public class Ex09 {

    static Scanner console = new Scanner(System.in);

    public static String diasSemana(String diaSemana) {
        String segunda="", terça ="", quarta = "", quinta= "", sexta = "", sabado = "", check;

        switch (diaSemana) {
            case "sair":
                break;
            case "segunda":
                System.out.println("Quais serão suas aulas na Segunda-Feira? ");
                segunda = console.nextLine();
            case "terça":
                System.out.println("Quais serão suas aulas na Terça-Feira? ");
                terça = console.nextLine();
            case "quarta":
                System.out.println("Quais serão suas aulas na Quarta-Feira? ");
                quarta = console.nextLine();
            case "quinta":
                System.out.println("Quais serão suas aulas na Quinta-Feira? ");
                quinta = console.nextLine();
            case "sexta":
                System.out.println("Quais serão suas aulas na Sexta-Feira? ");
                sexta = console.nextLine();
            case "sabado":
                System.out.println("Você tem aulas de Sábado?sim ou não?");
                check = console.nextLine();
                if (check.equalsIgnoreCase("sim") || check.equalsIgnoreCase("s")) {
                    System.out.println("Quais serão suas aulas no Sábado? ");
                    sabado = console.nextLine();
                } else {
                }
                System.out.println("Suas aulas da semana são: ");
                System.out.println("Segunda: "+segunda);
                System.out.println("Terça: "+terça);
                System.out.println("Quarta: "+quarta);
                System.out.println("Quinta: "+quinta);
                System.out.println("Sexta: "+sexta);
                 if (check.equalsIgnoreCase("sim") || check.equalsIgnoreCase("s")) {
                     System.out.println("Sábado: "+sabado);
                 }else{
                     System.out.println("Não tem aulas ao Sábados.");
                 }
        }
        return diaSemana;

    }

    public static void main(String[] args) {
        String diaSemana = "",check = "";
        System.out.println("Deseja Criar uma lista de aulas da semana? ");
        check = console.nextLine();
        if (check.equalsIgnoreCase("sim") || check.equalsIgnoreCase("s")) {
            System.out.println("Porfavor entre com o dia da semana;");
            diaSemana = console.nextLine();
        diasSemana(diaSemana);
        }else{
           
        }
    }
}
