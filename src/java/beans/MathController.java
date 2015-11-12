/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Fatorial;
import modelo.enumeradores.TipoFat;

/**
 *
 * @author Gleywson
 */
@ManagedBean
@RequestScoped
public class MathController {
    private Fatorial fatorial;
    private final Map tiposFat;
    

    public MathController() {
        this.fatorial = new Fatorial();
        tiposFat = new HashMap();
        tiposFat.put("Iterativo", TipoFat.ITERATIVO);
        tiposFat.put("Recursivo", TipoFat.RECURSIVO);
    }

    public Map getTiposFat() {
        return tiposFat;
    }
    
    

    public Fatorial getFatorial() {
        return fatorial;
    }

    public void setFatorial(Fatorial fatorial) {
        this.fatorial = fatorial;
    }
    
    
    
}
