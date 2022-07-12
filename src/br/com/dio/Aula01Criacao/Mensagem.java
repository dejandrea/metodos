package br.com.dio.Aula01Criacao;

import java.util.Date;

public class Mensagem {
    public static void saudacao(long hora) {
        String mensagem = "---";
        if (hora >= 5 && hora <= 12) {
                mensagem = "Bom Dia!";
//                System.out.println(mensagem+ "São " +hora + " horas");

        } else if (hora > 12 && hora < 18) {
                mensagem = "Boa Tarde!";
//                System.out.println(mensagem+ "São " +hora + " horas");
        }else {
            mensagem = "Boa Noite!";
//            System.out.println(mensagem + "São " +hora + " horas");
        }
        System.out.println(mensagem + "São " +hora + " horas");


    }
}
