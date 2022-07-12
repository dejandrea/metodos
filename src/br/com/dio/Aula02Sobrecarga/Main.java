package br.com.dio.Aula02Sobrecarga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Quadrilátero
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o quadrilátero que você deseja calcular a área?");

        System.out.println("Digite 1 para quadrado.");
        System.out.println("Ditite 2 para retângulo.");
        System.out.println("Digite 3 para trapézio.");
        System.out.println("Digite 4 para losango.");

        int tipoQuadrilatero = scan.nextInt();

        if (tipoQuadrilatero == 1) {
            System.out.println("Digite o tamanho do lado do quadrado:");
            double lado = scan.nextDouble();
            double area = Quadrilatero.area(lado);
            System.out.println("A área do Quadrado é: "+area);
        } else if (tipoQuadrilatero == 2) {
            System.out.println("Digite o tamanho do lado do retângulo:");
            double lado = scan.nextDouble();
            System.out.println("Digite o tamanho da base do retângulo:");
            double base = scan.nextDouble();
            double area = Quadrilatero.area(base,lado);
            System.out.println("A área do retângulo é: "+area);
        } else if (tipoQuadrilatero == 3) {
            System.out.println("Digite o tamanho da Base Maior do trapézio:");
            double lado = scan.nextDouble();
            System.out.println("Digite o tamanho da Base Menor do trapézio:");
            double base = scan.nextDouble();
            System.out.println("Digite o tamanho da Altura do trapézio:");
            double altura = scan.nextDouble();
            double area = Quadrilatero.area(base,lado,altura);
            System.out.println("A área do trapézio é: "+area);
        }else if (tipoQuadrilatero == 4) {
            System.out.println("Digite o tamanho da diagonal 1 do losango:");
            float diagonal1 = scan.nextFloat();
            System.out.println("Digite o tamanho da diagonal 2 do losango:");
            float diagonal2 = scan.nextFloat();
            float area = Quadrilatero.area(diagonal1,diagonal2);
            System.out.println("A área do losango é: "+area);
        }else{
            System.out.println("Valor inválido!");
        }
    }
}
