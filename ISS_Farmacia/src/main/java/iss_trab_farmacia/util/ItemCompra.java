/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util;

import iss_trab_farmacia.entity.Produto;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Embedded
public class ItemCompra {
    
    private float preco = 0;
    
    @Reference
    private Produto produto;
    
    private int qnt = 0;

    public ItemCompra(float preco, Produto produto, int qnt) {
        this.preco = preco;
        this.produto = produto;
        this.qnt = qnt;
    }

    public ItemCompra() {
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void addQnt(int qnt) {
        this.setQnt(this.getQnt() + qnt);
    }
    
    public float subTotal() {
        return this.getPreco() * this.getQnt();
    }

    public Object[] toVector() {
        return new Object[] {this.getProduto().getDescricao(), this.getQnt(), this.getPreco(), this.subTotal()};
    }
}
