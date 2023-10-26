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

        double result = (peso / (altura * altura));
        System.out.println("O seu IMC é de: "+result);

        scanner.close();
    }
}
