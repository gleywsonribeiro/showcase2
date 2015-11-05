/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enumeradores.TipoFat;

/**
 *
 * @author Gleywson
 */
public class Fatorial {

    private long fator;
    private TipoFat tipo;

    public long getFator() {
        return fator;
    }

    public void setFator(long fator) {
        this.fator = fator;
    }

    public TipoFat getTipo() {
        return tipo;
    }

    public void setTipo(TipoFat tipo) {
        this.tipo = tipo;
    }

    public long getFatorial() {
        if(tipo == TipoFat.ITERATIVO) {
            return  fatIterativo();
        }
        else {
            return fatRecursivo(fator);
        }
    }

    private long fatIterativo() {
        long produto = 1;
        for (int i = 1; i <= fator; i++) {
            produto *= i;
        }
        return produto;
    }

    private long fatRecursivo(long valor) {
        if (valor <= 1) {
            return 1;
        } else {
            return valor * fatRecursivo(valor - 1);
        }
    }
}
