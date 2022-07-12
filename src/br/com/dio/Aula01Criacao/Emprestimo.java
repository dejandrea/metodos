package br.com.dio.Aula01Criacao;

public class Emprestimo {

    public static double taxaParcelas(int parcela) {
        if (parcela == 1) {
            return 0.1;
        } else if (parcela == 2) {
            return 0.25;
        } else if (parcela == 3) {
            return 0.35;
        } else if (parcela == 4) {
            return 0.45;
        }else if (parcela == 5){
            return 0.55;
        } else if (parcela == 6) {
            return 0.65;
        }else {
            return 0.95;
        }
    }

    public static void calcular(double valor, int parcelas){
        double valorFinal = valor + (valor * taxaParcelas(parcelas));
        double juros = valorFinal - valor;
        double parcelamento = valorFinal/parcelas;

        System.out.println("Valor solicitado: R$ "+valor);
        System.out.println("Número de Parcelas: "+parcelas);
        System.out.println("Juros : R$ " + juros);
        System.out.println("Valor final do empréstimo é: R$ "+ valorFinal);
        System.out.println("Em "+parcelas+" parcelas de: R$ "+parcelamento);
    }


}
