package com.example.algaworks;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GuiTest {
//    public GUI(){
//        JFrame frame = new JFrame();
//        JPanel panel = new JPanel();
//        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10,30));
//        panel.setLayout(new GridLayout(0,1));
//
//        frame.add(panel, BorderLayout.CENTER);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Diego Teste");
//        frame.pack();
//        frame.setVisible(true);
//
//
//    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa verifica se uma pessoal pode tirar a carteira de habilitação");

        System.out.println("Informe sua idades");
        int idade = scanner.nextInt();

//        if (idade >=18){
//            System.out.println("Voce pode tirar sua carteira, 01.");
//        }else {
//            System.out.println("Você não possui ididade suficiente para tirar sua carteira de habilitação");
//        }

        String result;
        System.out.println(result = idade >=18 ? "Pode tirar sua carteira" : "Não pode tirar sua carteira");

    }
}
