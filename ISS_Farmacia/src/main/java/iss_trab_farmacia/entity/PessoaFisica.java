/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import java.util.Date;

/**
 *
 * @author guilherme
 */
public class PessoaFisica extends Pessoa {
    
    private Date dataNasc;    
    private String rg;    
    private String cpf;    
    private String email;
    
    
    public PessoaFisica() {
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public Object[] toVetor() {
        Object[] pessoaFisica = {this.getId(), this.getNome(), this.getEndereco().getCidade()};
        return pessoaFisica;
    }
}
