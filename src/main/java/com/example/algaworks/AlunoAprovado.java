package com.example.algaworks;

import java.util.Scanner;

public class AlunoAprovado {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("===================IMPORTANTE===================");
        System.out.println("================================================");

        System.out.println("Estre programa verifica se o aluno passou de ano. \n" +
                "O score mínimo para passar de ano é 7.5");
        System.out.println();
        System.out.println("================================================");

        double media = 7.5;
        System.out.println("Informe sua nota do primeiro bimestre");
        double b1 = scanner.nextDouble();
        System.out.println("Informe sua nota do segungo bimestre");
        double b2 = scanner.nextDouble();
        System.out.println("Informe sua nota do terceiro bimestre");
        double b3 = scanner.nextDouble();
        System.out.println("Informe sua nota do quarto bimestre");
        double b4 = scanner.nextDouble();
        double result = (b1+b2+b3+b4)/4;

        if (result >media){
            System.out.println("você passou de ano");
        }else {
            System.out.println("Você foi reprovado");
        }
        System.out.println("Sua média foi de: "+result);
    }
}
