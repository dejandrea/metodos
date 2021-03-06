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
            Quadrilatero.area(lado);

        } else if (tipoQuadrilatero == 2) {
            System.out.println("Digite o tamanho do lado do retângulo:");
            double lado = scan.nextDouble();
            System.out.println("Digite o tamanho da base do retângulo:");
            double base = scan.nextDouble();
            Quadrilatero.area(base,lado);

        } else if (tipoQuadrilatero == 3) {
            System.out.println("Digite o tamanho da Base Maior do trapézio:");
            double lado = scan.nextDouble();
            System.out.println("Digite o tamanho da Base Menor do trapézio:");
            double base = scan.nextDouble();
            System.out.println("Digite o tamanho da Altura do trapézio:");
            double altura = scan.nextDouble();
            Quadrilatero.area(base,lado,altura);

        }else if (tipoQuadrilatero == 4) {
            System.out.println("Digite o tamanho da diagonal 1 do losango:");
            float diagonal1 = scan.nextFloat();
            System.out.println("Digite o tamanho da diagonal 2 do losango:");
            float diagonal2 = scan.nextFloat();
            Quadrilatero.area(diagonal1,diagonal2);

        }else{
            System.out.println("Valor inválido!");
        }
    }
}
