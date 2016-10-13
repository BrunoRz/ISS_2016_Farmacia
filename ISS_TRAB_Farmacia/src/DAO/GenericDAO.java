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
class GenericDAO<T> implements AbstractDAO<T> {

	/**
	* Default empty GenericDAO constructor
	*/
	public GenericDAO() {
		super();
	}

    public T busca(String id) {
        T result = null;

        return result;
    }

    public void excluir(T object) {

    }

    public void salvar(T object) {

    }

    public void atualizar(T object) {

    }
}
