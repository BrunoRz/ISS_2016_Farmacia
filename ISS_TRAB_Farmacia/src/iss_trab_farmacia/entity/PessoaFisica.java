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
public class PessoaFisica  extends Pessoa{
    
    private final int cpf;
    private String rg;
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    private Date dataNasc;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}
