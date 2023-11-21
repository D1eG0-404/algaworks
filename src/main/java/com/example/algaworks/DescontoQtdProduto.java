package com.example.algaworks;

import java.util.Scanner;

public class DescontoQtdProduto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa tem como objetivo calcular um percentual de desconto, \n" +
                "caso o cliente compre mais de 10 unidades");
        //Base de dado do programa para realizar o calculo
        double desconto = 10.0;
        double nDesconto = 0.0;
        double valorParcial = 0;
        double valorTotal = 0.0;

        System.out.print("Informe o valor unitário do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Informe a quantidade: ");
        int qtd = scanner.nextInt();


        if(qtd >10){
            desconto = (valorProduto*qtd)/100;
            valorTotal = (valorProduto*qtd)-desconto;
            System.out.println("O valor total da sua compra é de: " + valorTotal);
            System.out.println("Foi aplicado um desconto no valor de: "+desconto);
        }else {
            valorTotal = (valorProduto*qtd)-nDesconto;
            System.out.println("O valor da sua compra é de: "+valorTotal);
        }
        scanner.close();

    }
}
