/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import iss_trab_farmacia.util.ItemCompra;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author guilherme
 */
@Entity("compras")
public class Compra {
    
    @Id
    private ObjectId id;
    
    @Reference
    private PessoaJuridica fornecedor;
    
    private Date dataCompra;
    
    @Embedded
    private final List<ItemCompra> itensCompra = new ArrayList();

    public Compra(PessoaJuridica Fornecedor) {
        this.fornecedor = Fornecedor;
    }

    public Compra() {
    }
    
    public ItemCompra inCompra(Produto produto){
        for (ItemCompra item: this.itensCompra) {
            if (item.getProduto().getId().equals(produto.getId())) return item;
        }
        return null;
    }
}
