/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import iss_trab_farmacia.util.ItemCompra;
import iss_trab_farmacia.util.ItemVenda;
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
    
    int qnt;

    public Estoque() {
    }
    

    public Estoque(Produto produto, int tipoMovimento, int Qnt) {
        this.produto = produto;
        this.tipoMovimento = tipoMovimento;
        this.qnt = Qnt;
    }
    
    public Estoque(ItemVenda item) {
        this.produto = item.getProduto();
        this.tipoMovimento = 0;
        this.qnt = item.getQnt();
    }
    
    public Estoque(ItemCompra item) {
        this.produto = item.getProduto();
        this.tipoMovimento = 1;
        this.qnt = item.getQnt();
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
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    
}
