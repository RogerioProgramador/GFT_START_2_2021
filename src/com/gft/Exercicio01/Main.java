package com.gft.Exercicio01;

import com.gft.Exercicio01.Classes.Atleta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Atleta> atletas =  new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            Atleta atleta = new Atleta();
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o nome do Atleta " + i + ":");
            atleta.setNome(leitor.nextLine());
            System.out.print("Digite o país do Atleta " + i + ":");
            atleta.setPaís(leitor.nextLine());
            System.out.print("Digite o resultado(em metros) do Atleta " + i + ":");
            atleta.setMetros(leitor.nextInt());
            atletas.add(atleta);
        }

        Comparator<Atleta> comparator = Comparator
                .comparing(Atleta::getMetros).reversed();
        atletas.sort(comparator);

        System.out.println("Ouro: " + atletas.get(0).dados());
        System.out.println("Prata: " + atletas.get(1).dados());
        System.out.println("Bronze: " + atletas.get(2).dados());
    }
}
