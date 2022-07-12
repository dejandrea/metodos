package br.com.dio.Aula01Criacao;

import java.util.Date;

public class Mensagem {
    public static void saudacao(long hora) {
        String mensagem = "---";
        if (hora >= 5 && hora <= 12) {
                mensagem = "Bom Dia!";
        } else if (hora > 12 && hora < 18) {
                mensagem = "Boa Tarde!";
        }else {
            mensagem = "Boa Noite!";
        }
        System.out.println("São " +hora + " horas. "+mensagem);

    }
}
