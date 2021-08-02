package com.gft.Exercício04;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner leitor =  new Scanner(System.in);
        int multiplicando;
        int inicio;
        int fim;

        System.out.print("Multiplicando:");
        multiplicando = leitor.nextInt();
        if (multiplicando > 1000) {
            System.out.println("Valor de Multiplicando inválido");
            exit(1);
        }
        System.out.print("Início do intervalo:");
        inicio = leitor.nextInt();
        if (inicio < 0 || inicio > 1000) {
            System.out.println("Valor de Início invalido");
            exit(1);
        }
        System.out.print("Fim do intervalo:");
        fim = leitor.nextInt();
        if (fim < 0 || fim > 1000) {
            System.out.println("Valor de Fim invalido");
            exit(1);
        }
        if (inicio > fim) {
            System.out.println("Valor de Início menor que valor do Fim");
            exit(1);
        }
        if ((fim - inicio) >= 10) {
            System.out.println("Intevalo inválido");
            exit(1);
        }

        for (int i = inicio; i <=fim; i++) {
            System.out.println(multiplicando + " X " + i + " = " + (multiplicando * i));
        }
    }
}
