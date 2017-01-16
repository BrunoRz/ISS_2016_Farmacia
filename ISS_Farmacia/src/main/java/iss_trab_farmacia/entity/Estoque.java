/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Entity("estoque")
public class Estoque {
    
    @Id
    ObjectId id;
    
    @Reference
    Produto produto;
    
    //Entrada = 1
    //Saida = 0
    int tipoMovimento;
    
    int Qnt;

    public Estoque(Produto produto, int tipoMovimento, int Qnt) {
        this.produto = produto;
        this.tipoMovimento = tipoMovimento;
        this.Qnt = Qnt;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(int tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public int getQnt() {
        return Qnt;
    }

    public void setQnt(int Qnt) {
        this.Qnt = Qnt;
    }
    
    
}
