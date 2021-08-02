package com.gft.Exercicio03.Classes;

import com.gft.Exercicio03.Interfaces.Imposto;

public class ICMS implements Imposto {

    @Override
    public double calculaImposto(double valor) {
        double imposto;

        imposto = 0.27 * valor;
        return (imposto);
    }

}
