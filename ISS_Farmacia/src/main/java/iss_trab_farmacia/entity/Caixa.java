/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author guest-NUM8iy
 */

@Entity("caixa")
public class Caixa {
    @Id
    private ObjectId id;
    
    private Date data = new Date();
    
    @NotNull
    private boolean entrada;
    
    @Min(value = (long) 0.01, message = "Menor valor possivel é 0.01")
    private double valor;

    
    public Caixa(boolean entrada, double valor) {
        this.entrada = entrada;
        this.valor = valor;
    }
    
    public Caixa(Venda venda){
        this.valor = venda.getTotal();
        this.entrada = true;
    }
    
    public Caixa(Compra compra){
        this.valor = compra.getTotal();
        this.entrada = false;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
