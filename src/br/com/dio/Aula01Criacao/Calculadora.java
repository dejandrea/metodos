package br.com.dio.Aula01Criacao;

public class Calculadora {

    public static void soma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("soma: "+resultado);
    }
    public static void subtracao(double num1, double num2){
        double subtracao = num1 - num2;
        System.out.println("subtração: "+subtracao);
    }
    public static void divisao(double num1, double num2){
        double div = num1 / num2;
        System.out.println("divisão: "+div);
    }
    public static void multiplicacao(double num1, double num2){
        double multip = num1 * num2;
        System.out.println("multiplicação: "+multip);
    }
}
