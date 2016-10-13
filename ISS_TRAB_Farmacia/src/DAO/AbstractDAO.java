/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author guest-dDDa0r
 */
interface  AbstractDAO<T> {

    T busca(String id);

    void salvar(T object);
    void excluir(T object);
    void atualizar(T object);

}
