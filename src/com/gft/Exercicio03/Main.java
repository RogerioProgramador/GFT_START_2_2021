package com.gft.Exercicio03;

import com.gft.Exercicio03.Classes.COFINS;
import com.gft.Exercicio03.Classes.ICMS;
import com.gft.Exercicio03.Classes.IPI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ICMS imposto1 =  new ICMS();
        IPI imposto2 = new IPI();
        COFINS imposto3 = new COFINS();

        try {
            double valor = leitor.nextDouble();
            System.out.format("ICMS: %.2f\n", imposto1.calculaImposto(valor));
            System.out.format("IPI: %.2f\n", imposto2.calculaImposto(valor));
            System.out.format("COFINS: %.2f\n", imposto3.calculaImposto(valor));
            System.out.format("Total: %.2f\n", (imposto1.calculaImposto(valor) + imposto2.calculaImposto(valor)
                    + imposto3.calculaImposto(valor)));
        } catch (Exception e) {
            System.out.println("Caractere inválido");
        }
    }

}
