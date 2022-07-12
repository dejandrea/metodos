package br.com.dio.Aula02Sobrecarga;

public class Quadrilatero {
    public static void area(double lado) {
        double area = lado * lado;
        System.out.println("A área do quadrilátero é: "+area);
    }

    public static void area(double base, double lado) {
        double area = base * lado;
        System.out.println("A área do quadrilátero é: "+area);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        double area = ((baseMaior+baseMenor)*altura)/2;
        System.out.println("A área do quadrilátero é: "+area);
    }

    public static void area(float diagonal1, float diagonal2) {
        float area = (diagonal1*diagonal2)/2;
        System.out.println("A área do quadrilátero é: "+area);

    }
}
