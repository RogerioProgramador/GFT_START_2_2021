package com.gft.Exercicio03.Classes;

import com.gft.Exercicio03.Interfaces.Imposto;

public class COFINS implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        double imposto;

        if (valor > 13000.0) {
            imposto = 0.04 * valor;
        } else {
            imposto = 0;
        }
        return (imposto);
    }
}
