/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author guilherme
 */
@Entity("produtos")
public class Produto {

    @Id
    private ObjectId id;

    private String descricao;

    private String categoria;

    private float valorPadrao;

    private int codigoBarras;

    private boolean requerReceita;

    public boolean isRequerReceita() {
        return requerReceita;
    }

    public void setRequerReceita(boolean requerReceita) {
        this.requerReceita = requerReceita;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public float getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(float valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Produto(String descricao, String marca) {
        this.descricao = descricao;
        this.marca = marca;
    }

    public Produto() {
    }

    private String marca;

    public ObjectId getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Object[] toVetor() {
        Object[] ret = {this.descricao, this.id, this.marca, this.valorPadrao};
        return ret;
    }

}
