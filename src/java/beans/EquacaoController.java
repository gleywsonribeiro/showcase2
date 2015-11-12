/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author blaze
 */
@ManagedBean
@RequestScoped
public class EquacaoController {

    //delta = b^2 - 4*a*c
    // x = (-b +- sqrt(delta))/(2*a)
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public String getResultado() {
        double delta = getDelta();
        String solucao;
        double x1, x2;
        if (delta < 0) {
            solucao = "Nao existe raiz real";
        } else if (delta == 0) {
            x1 = -b/2*a;
            solucao = "Raizes iguais: "+x1;
        } else {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;
            solucao = "Raizes: " + x1 + " e " + x2;
        }
        return solucao;
    }
}
