/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import iss_trab_farmacia.util.ItemVenda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Entity("vendas")
public class Venda {
    
    @Id
    private ObjectId id;
    
    @Reference
    @NotNull(message = "Cliente não selecionado")
    private Pessoa cliente;
    
    private final Date dataVenda;
    
    @Embedded
    @Size(min = 1,message = "Venda sem itens")
    private final List<ItemVenda> listaProdutos = new ArrayList<>();

    public Venda(Pessoa cliente) {
        this.cliente = cliente;
        this.dataVenda = new Date();
    }

    public Venda() {
        this.dataVenda = new Date();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public ObjectId getId() {
        return id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public List<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }
    
    public void addItemVenda(ItemVenda item) {
        this.getListaProdutos().add(item);
    }
    
    public ItemVenda inVenda(Produto produto) {
        for (ItemVenda item : this.listaProdutos) {
            if (item.getProduto().equals(produto)) {
                return item;
            }
        }
        return null;
    }
    
    public float getTotal() {
        float total = 0;
        for (ItemVenda item : this.getListaProdutos()) {
            total += item.subTotal();
        }
        
        return total;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    
    public Object[] toVector() {
        Object[] o = {this.getClass().getSimpleName(), this.getTotal()};
        return o;
    }
}
