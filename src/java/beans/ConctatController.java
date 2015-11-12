/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Contato;

/**
 *
 * @author blaze
 */

@ManagedBean
@ViewScoped
public class ConctatController {
    private Contato contato;
    private List<Contato> contatos;
    public ConctatController() {
        contato = new Contato();
        contatos = new ArrayList<>();
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    
    public void novoContato() {
        contatos.add(contato);
        contato = new Contato();
    }
    
    
}
