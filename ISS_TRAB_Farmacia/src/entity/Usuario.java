/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Random;
import org.bson.BasicBSONObject;

/**
 *
 * @author guest-gvdX53
 */
public class Usuario {
    private String nome;
    private String endereco;
    private int CP;
    private String user;
    private String password; 

    public Usuario(String nome, String endereco, int CP, String user) {
        this.nome = nome;
        this.endereco = endereco;
        this.CP = CP;
        this.user = user;
        this.password = new Random().ints(6).toString();
    }
    
    public Usuario(BasicBSONObject doc) {
        this.nome = doc.get("nome").toString();
        this.endereco = doc.get("endereco").toString();
        this.CP = CP;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUser() {
        return user;
    }

    private String getPassword() {
        return password;
    }

    public int getCP() {
        return CP;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validaSenha(String password) {
        return (this.getPassword().equals(password));
    }
}   