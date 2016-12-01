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
    private int CEP;
    
    private String cidade;

    public Endereco() {
    }

    public Endereco(String rua, String numero, int CEP, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
    }

    public Endereco(int CEP) {
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

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
