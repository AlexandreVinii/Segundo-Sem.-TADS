/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Alexandre;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vinicius
 */
public class Atividade01 {



    public static void main(String[] args) {
        String[] lista_nomes = Vetor();
        int usuario_keyb;
        do {
            usuario_keyb = menuHUD();
            lista_nomes = menu(usuario_keyb, lista_nomes);

        } while (usuario_keyb != 0);
    }

    // Cria Vetor e elimina "null"
    public static String[] Vetor() {
        String[] lista_nomes = new String[50];

        for (int i = 0; i < lista_nomes.length; i++) {
            lista_nomes[i] = "";
        }
        return lista_nomes;
    }

    public static int menuHUD() {
        Scanner console = new Scanner(System.in);
        System.out.println("\n------Menu da Lista------");
        System.out.println("Digite as opções desejadas, abaixo.");
        System.out.println("1 - Adicionar novo nome ");
        System.out.println("2 - Apresentar os nomes ");
        System.out.println("3 - Pesquisar um nome ");
        System.out.println("4 - Remover um nome ");
        System.out.println("0 - Sair ");
        int usuario_keyb = tecladoInt();

        return usuario_keyb;
    }

    public static String[] menu(int usuario_keyb, String[] lista_nomes) {

        switch (usuario_keyb) {
            case 0:
                System.out.println("  Saindo do Programa...");
                break;
            case 1:
                System.out.println(" -- Digite o nome que seja Adicionar --");
                addNomes(lista_nomes);
                return lista_nomes;

            case 2:
                mostrarLista(lista_nomes);
                return lista_nomes;
            case 3:
                pesquisarNomes(lista_nomes);
                return lista_nomes;
            case 4:
                removeNomes(lista_nomes);
                return lista_nomes;
        }
        return lista_nomes;
    }

    public static String[] mostrarLista(String[] lista_nomes) {
        boolean listavazia = true;
        System.out.println("\n--------- LISTA -----------\n");
        for (int i = 0; i < lista_nomes.length; i++) {
            if (!lista_nomes[i].trim().equalsIgnoreCase("")) {
                System.out.println("Nome: " + lista_nomes[i]);
                listavazia = false;
            }
        }
        if(listavazia){
            System.out.println(" LISTA VAZIA !");
        }
        System.out.println("\n--------- LISTA -----------\n");
        return lista_nomes;
    }

    public static String[] addNomes(String[] lista_nomes) {
        boolean listacheia = checkList(lista_nomes);
        String nome;
        System.out.print("Nome: ");
        Scanner console = new Scanner(System.in);
        nome = tecladoTexto();
        boolean finder = FinderName(lista_nomes, nome);

        if (finder) {
            return lista_nomes;
        } else if (!listacheia) {
            System.out.println("\n\n\tLista lotada, desculpe !\n\n");
            return lista_nomes;
        } else {
            lista_nomes[lista_nomes.length - 1] = nome;
            lista_nomes = reOrganizar(lista_nomes);
            return lista_nomes;
        }

    }
    
    public static String [] removeNomes (String[] lista_nomes){
        
         boolean check = false;
        System.out.println("Digite o nome que deseja Remover ! ");
        System.out.print("Nome: ");
        String nome = tecladoTexto();
        for (int i = 0; i < lista_nomes.length; i++) {
            if (lista_nomes[i].trim().equalsIgnoreCase(nome)) {
                System.out.printf("\n\tO nome '%s' foi Apagado, com sucesso !\n\n", nome, i + 1);
                check = true;
                lista_nomes[i] = "";
                reOrganizar(lista_nomes);
            } 
        }
            if(check == false) {
                System.out.printf("\n\tO nome %s que deseja remover não foi encontrado !\n\n", nome);
            }
        
        return lista_nomes;
    }

    public static void pesquisarNomes(String[] lista_nomes) {
        boolean check = false;
        System.out.println("Digite o nome que deseja encontrar. ");
        System.out.print("Nome: ");
        String nome = tecladoTexto();
        for (int i = 0; i < lista_nomes.length; i++) {
            if (lista_nomes[i].trim().equalsIgnoreCase(nome)) {
                System.out.printf("\n\tO nome '%s' foi encontrado na %dº posição do vetor !\n\n", nome, i + 1);
                check = true;
            } 
        }
            if(check == false) {
                System.out.printf("\n\tO nome '%s' não foi encontrado !\n\n", nome);
            }

    }

    public static boolean checkList(String[] lista_nomes) {
        boolean checklist;
        if (!lista_nomes[lista_nomes.length - 1].trim().equalsIgnoreCase("")) {
            checklist = false;
        } else {
            checklist = true;
        }

        return checklist;
    }

    public static boolean FinderName(String[] lista_nomes, String usuario_keyb) {
        boolean finder = false;
        String nome = usuario_keyb;
        for (int i = 0; i < lista_nomes.length; i++) {
            if (lista_nomes[i].equalsIgnoreCase(nome)) {
                finder = true;
                // System.out.printf("O nome '%s' foi encontrado na %dº posição !\n\n",usuario_keyb,i);
            }
        }
        if (finder) {
            System.out.printf("O nome %s ja existe !\n\n", nome);
            finder = false;
        }

        return finder;
    }

    public static String[] reOrganizar(String[] lista_nomes) {
        for (int i = 0; i < lista_nomes.length; i++) {
            if (lista_nomes[i].equalsIgnoreCase("") && i != (lista_nomes.length - 1)) {
                lista_nomes[i] = lista_nomes[i + 1];
                lista_nomes[i + 1] = "";
            }
        }
        return lista_nomes;
    }
    
    public static String tecladoTexto(){
        Scanner console = new Scanner(System.in);
        String teclado = console.nextLine();
        
        
        return teclado;
    }
    
    public static int tecladoInt(){
        Scanner console = new Scanner(System.in);
        int teclado = console.nextInt();
        
        
        return teclado;
    }

}
