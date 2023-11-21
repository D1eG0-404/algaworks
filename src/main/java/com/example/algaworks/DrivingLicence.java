package com.example.algaworks;

import java.util.Scanner;

public class DrivingLicence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este algorítimo tem como objetivo checar se a pessoa tem idade mínima para tirar a carteira de motorista");
        //Para praticar os conceitos de constante, vou declarar a váriavel abaixo como uma constante.
        //a idéia é que se em algum momento eu precisar realizar uma manutenção no código, faça apenas em um ponto.
        final int minimumAge = 18;

        System.out.print("Informe sua idade: ");
        int age = scanner.nextInt();

        if(age>=minimumAge){
            System.out.println("Você possui idadee mínima para iniciar seu processo.");
        }else {
            System.out.println("Voce não possui idade para tirar a carteira de motorista");
        }
    }
}
