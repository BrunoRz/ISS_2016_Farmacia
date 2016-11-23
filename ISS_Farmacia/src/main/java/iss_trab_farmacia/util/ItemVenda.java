/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util;

import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.entity.Venda;
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Embedded
public class ItemVenda {
    
    private int qnt;
    
    private final float valorVenda;
    private final float valorCusto;
    
    @Reference
    private final Produto produto;


    public int getQnt() {
        return qnt;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemVenda(int qnt, float valorVenda, Produto produto) {
        this.qnt = qnt;
        this.valorVenda = valorVenda;
        this.valorCusto = produto.custo();
        this.produto = produto;
    }
    
    public ItemVenda(int qnt, Produto produto) {
        this.qnt = qnt;
        this.valorVenda = produto.sugestaoPreco();
        this.valorCusto = produto.custo();
        this.produto = produto;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    public int addQnt(int qnt) {
        this.setQnt(this.getQnt() + qnt);
        return this.getQnt();
    }
    
    public float subTotal() {
        return this.getQnt() * this.getValorVenda();
    }
}
