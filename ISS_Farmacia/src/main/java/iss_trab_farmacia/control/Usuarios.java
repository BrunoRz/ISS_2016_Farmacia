/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Usuario;
import iss_trab_farmacia.util.SingletonBd;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Usuarios extends BasicDAO<Usuario, String>{
    
    public Usuarios() {
        super(Usuario.class, SingletonBd.getInstance().getDs());
    }
    
    
    
}
