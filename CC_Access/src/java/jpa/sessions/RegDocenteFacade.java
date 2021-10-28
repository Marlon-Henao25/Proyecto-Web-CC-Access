/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.RegDocente;

/**
 *
 * @author Henao
 */
@Stateless
public class RegDocenteFacade extends AbstractFacade<RegDocente> {

    @PersistenceContext(unitName = "CC_AccessPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegDocenteFacade() {
        super(RegDocente.class);
    }
    
}
