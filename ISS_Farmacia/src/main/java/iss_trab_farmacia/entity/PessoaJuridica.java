/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

/**
 *
 * @author guilherme
 */
public class PessoaJuridica extends Pessoa{
    
    private int cnpj;    
    private String razao;

    public PessoaJuridica() {
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
    
    @Override
    public Object[] toVetor() {
        Object[] pessoaJuridica = {this.getId(), this.getCnpj(), this.getNome(), this.getEndereco().getCidade()};
        return pessoaJuridica;
    }
}
