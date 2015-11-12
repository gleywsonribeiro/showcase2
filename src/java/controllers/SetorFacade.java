/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Setor;

/**
 *
 * @author Gleywson
 */
@Stateless
public class SetorFacade extends AbstractFacade<Setor> {
    @PersistenceContext(unitName = "showcase2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SetorFacade() {
        super(Setor.class);
    }
    
}
