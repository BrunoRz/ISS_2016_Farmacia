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
 * @param <T> Classe do objeto
 * @param <I> Classe da chave primaria
 */
public interface DAO<T, I> {
    
    /**
     * Persiste documento no Banco de dados
     * @param t 
     */
    void salvar(T t);

    /**
     * Busca documentos por chave primariaa
     * @param i chave primaria a ser buscada
     * @return Retorna lista de documentos encontrados
     */
    List<T> buscarI(I i);
    /**
     * Exclui documento passado
     * @param t 
     */
    void excluir(T t);
    
    
}
