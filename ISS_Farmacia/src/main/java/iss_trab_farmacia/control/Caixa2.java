/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Caixa;
import iss_trab_farmacia.util.SingletonBd;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author swiss_prince
 */
public class Caixa2 extends BasicDAO<Caixa, ObjectId>{

    public Caixa2() {
        super(Caixa.class, SingletonBd.getInstance().getDs());
    }
    
    
    public List<Caixa> buscarTodos(){
        return this.createQuery().asList();
    }
    
    public List<Caixa> buscarEntrada() {
        return this.createQuery().field("entrada").equal(true).asList();
    }
    
    public List<Caixa> buscarSaida(){
        return this.createQuery().field("entrada").equal(false).asList();
    }
    
    public double getSaldo() {
        double soma = 0;
        List<Caixa> lC = this.buscarTodos();
        Iterator<Caixa> iC = lC.iterator();
        
        while(iC.hasNext()) {
            Caixa caixa = iC.next();
            if (caixa.isEntrada()) {
                soma += caixa.getValor();
            } 
            else soma -= caixa.getValor();
        }
        
        return soma;
    }


}
