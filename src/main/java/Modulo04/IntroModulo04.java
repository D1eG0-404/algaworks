package Modulo04;

import java.util.Scanner;

public class IntroModulo04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo realizar operações matemáticas para fortalecer meus conhecimento");
        //declarando as váriaveis
        int resultSoma, resultSub, resultMult, resultDiv;
        int resultPrecedencia01, resultPrecedencia02, resultPrecedencia03, resultPrecedencia04;


        //Aqui estamos realizando a captura de dados
        System.out.println("Informe o primeiro número para realizarmos as operações matemáticas: ");
        int num01 = scanner.nextInt();
        System.out.println("Informe segundo número para realizarmos as operações matemáticas: ");
        int num02 = scanner.nextInt();

        //Aqui estamos realizarndo a operação simples de matemática.
        resultSoma = num01+num02;
        resultSub = num01-num02;
        resultMult = num01*num02;
        resultDiv = num01/num02;

        //Aqui estamos realizarndo a usando precedência.
        resultPrecedencia01 = num01*num02+(num01+num01);//Nete caso, é realizada operação dentro do parentese de pois a operação fora.
        resultPrecedencia02 = num01*num02/num01+num02-num02;//O Java segue a mesma ordem imposta pela regra da matemática. parênteses, potências, multiplicações e divisões e adição e subtração.



        //Nessa etapa do código estamos realizarndo a impressão para o usuário
        System.out.println("O resultado da operação de soma é: " +resultSoma);
        System.out.println("O resultado da operação de subtração é: " +resultSub);
        System.out.println("O resultado da operação de multiplicação é: " +resultMult);
        System.out.println("O resultado da operação de divisão é: " +resultDiv);

        //Nessa etapa do código estamos realizarndo a impressão para o usuário das operações de precedencia.
        System.out.println("O resultado da primeira operação de precedência é : " +resultPrecedencia01);
        System.out.println("O resultado da segunda operação de precedência é : " +resultPrecedencia02);


        scanner.close();
    }
}
