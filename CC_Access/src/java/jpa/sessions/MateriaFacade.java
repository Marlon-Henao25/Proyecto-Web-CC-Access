/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Materia;

/**
 *
 * @author Henao
 */
@Stateless
public class MateriaFacade extends AbstractFacade<Materia> {

    @PersistenceContext(unitName = "CC_AccessPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriaFacade() {
        super(Materia.class);
    }
    
}
