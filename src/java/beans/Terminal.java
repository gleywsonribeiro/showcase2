/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gleyw
 */
@Named(value = "terminal")
@RequestScoped
public class Terminal {

    public String comando(String command, String[] params) {
        switch (command) {
            case "greet":
                if(params.length > 0)
                    return "Tudo bem " + params[0] +"?";
                else
                    return "Fala teu nome aí rapá! Depois do comando greet!";
            case "date":
                return new Date().toString();
            default:
                return command + " ->Hum! Ainda não entendo isso!";
        }
    }
    
}
