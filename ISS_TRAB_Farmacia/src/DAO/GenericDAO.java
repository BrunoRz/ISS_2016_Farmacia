/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author guilherme
 * @param <T>
 * @param <I>
 */
public abstract class GenericDAO<T, I> implements DAO<T, I> {

    public GenericDAO() {
    }

    @Override
    public void excluir(T t){
        
    }

    @Override
    public List<T> buscarI(I i){
        return null;
    }

    @Override
    public void salvar(T t){}
    
    
    
}
