package com.gft.Exercicio03.Classes;

import com.gft.Exercicio03.Interfaces.Imposto;

public class IPI implements Imposto {


    public double calculaImposto(double valor) {
        double imposto;

        if (valor < 25000.0) {
            imposto = 0.05 * valor;
        } else {
            imposto = 0.11 * valor;
        }
        return (imposto);
    }

}
