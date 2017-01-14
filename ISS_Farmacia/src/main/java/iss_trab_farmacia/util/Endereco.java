/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util;

import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author guilherme
 */
@Embedded
public class Endereco {
    private String rua;
    private String numero;
    private String CEP;
    private String complemento;
    
    private String cidade;

    public Endereco() {
    }

    public Endereco(String rua, String numero, String CEP, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
    }

    public Endereco(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
