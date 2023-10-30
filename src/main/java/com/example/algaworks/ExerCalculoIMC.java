package com.example.algaworks;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerCalculoIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        double resAltura = altura * altura;
        double result = peso / resAltura;
        System.out.println("Seu indice de massa corpória é de: " +result);

        scanner.close();
    }
}
