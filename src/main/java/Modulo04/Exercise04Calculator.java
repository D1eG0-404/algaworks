package Modulo04;

import java.util.Scanner;

public class Exercise04Calculator {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("==========CALCULATOR==========");
        System.out.println("==============================");

//        System.out.print("Digite o primeiro número: ");
//        Double primeiroNumero = scanner.nextDouble();
//
//        System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
//        Integer operacao = scanner.nextInt();
//
//        System.out.print("Digite o segundo número: ");
//        Double segundoNumero = scanner.nextDouble();
//
//        Double resultado = null;
//
//        if (operacao.equals(1)) {
//            resultado = primeiroNumero + segundoNumero;
//        }
//
//        if (operacao.equals(2)) {
//            resultado = primeiroNumero - segundoNumero;
//        }
//
//        if (operacao.equals(3)) {
//            resultado = primeiroNumero / segundoNumero;
//        }
//
//        if (operacao.equals(4)) {
//            resultado = primeiroNumero / segundoNumero;
//        }
//
//        System.out.println("Resultado: " + resultado);

        double result = 0;

        System.out.println("Enter the first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("enter the mathematical operation to be performed\n" +
                "type 1 to multiply, 2 to divide, 3 to add and 4 to subtract.");
        int operation = scanner.nextInt();
        System.out.println("Enter the second number");
        Double secondNum = scanner.nextDouble();

        if(operation==1){
            result = firstNum*secondNum;
        }else if (operation==2){
            result = firstNum/secondNum;
        }if(operation==3){
            result = firstNum+secondNum;
        }else if (operation ==4){
            result = firstNum-secondNum;
        }
        System.out.println("the result of your operation is: "+result);
    }
}
