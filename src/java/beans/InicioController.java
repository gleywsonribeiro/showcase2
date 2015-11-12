/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author blaze
 */
@ManagedBean
@SessionScoped
public class InicioController {

    public String saudacao() {
        String saudacao = "Bom dia";
        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);

        if (hora >= 12) {
            saudacao = "Boa tarde";
        }
        if (hora >= 18) {
            saudacao = "Boa noite";
        }
        return saudacao;
    }
}
