/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
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

    @Size(min = 3, message = "Descrição deve ter no minimo 3 caracteres")
    private String descricao;

    private String categoria;

    @Min(value = (long) 0.01)
    private float valorPadrao;

    private String codigoBarras;

    private boolean requerReceita;

    public boolean isRequerReceita() {
        return requerReceita;
    }

    public void setRequerReceita(boolean requerReceita) {
        this.requerReceita = requerReceita;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
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
        Object[] ret = {this.id, this.descricao, this.categoria, this.marca, this.valorPadrao};
        return ret;
    }

}
