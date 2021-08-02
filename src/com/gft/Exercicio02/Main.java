package com.gft.Exercicio02;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio =  new Random();
        int n = aleatorio.nextInt(7);
        int i = 8;

        System.out.println("Descubra qual é o número misterioso!");
        while (n != i) {
            System.out.print("Digite um número: ");
            try {
                i = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Caractere inválido, digite um número");
                break ;
            }
            if (n != i)
                System.out.println("Errou! Tente novamente!");
        }
        if (n == i)
            System.out.println("Acertou! O numero misterioso era " + n);
    }

}
