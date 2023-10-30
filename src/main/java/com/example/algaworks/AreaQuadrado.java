package com.example.algaworks;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de um dos lados do quadrado: ");
        int ladoQuadrado = scanner.nextInt();

        int resultQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("A area do seu quadrod é de: " +resultQuadrado);

        scanner.close();
    }
}
