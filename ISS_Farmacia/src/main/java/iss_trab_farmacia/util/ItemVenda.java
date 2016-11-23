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
public class ItemVenda {
    
    private int qnt;
    
    private float valorVenda;
    private final float valorCusto;
    
    @Reference
    private final Produto produto;


    public int getQnt() {
        return qnt;
    }


    public Produto getProduto() {
        return produto;
    }

    public ItemVenda(int qnt, float valorVenda, float valorCusto, Produto produto) {
        this.qnt = qnt;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.produto = produto;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    public int addQnt(int qnt) {
        this.setQnt(this.getQnt() + qnt);
        return this.getQnt();
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public float subTotal() {
        return this.getQnt() * this.getValorVenda();
    }
}
