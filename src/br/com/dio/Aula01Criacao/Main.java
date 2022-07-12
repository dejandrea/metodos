package br.com.dio.Aula01Criacao;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício de Calculadora:");
        Scanner scan  = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o Segundo valor:");
        double num2 = scan.nextDouble();

        Calculadora.soma(num1,num2);
        Calculadora.subtracao(num1,num2);
        Calculadora.divisao(num1,num2);
        Calculadora.multiplicacao(num1,num2);

        System.out.println("Exercício da mensagem:");

//        System.out.println("Digite a hora:");
//        long hora = scan.nextLong();

        long hora  = new Date().getHours();
        Mensagem.saudacao(hora);
    }
}
