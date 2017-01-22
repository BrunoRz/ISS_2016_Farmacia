/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import iss_trab_farmacia.util.Endereco;
import iss_trab_farmacia.util.hibernateConstraints.CpfOCnpj;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 *
 * @author guilherme
 */
@Entity("pessoas")
@CpfOCnpj
public class Pessoa {
    
    @Id
    private ObjectId id;
    @NotBlank(message = "Nome vazio")
    @Size(min = 3, message = "Minimo 3 caracter")
    private String nome;
  
    private String cpf;
    private String cnpj;
  
    @Size(min =  10,max = 10, message = "Telefone Invalido")
    private String telefone;
    @Email(message = "Email invalido")
    private String email;
    @Embedded
    private Endereco endereco;

    public Pessoa() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Object[] toVetor() {
        return new Object[] {this.getNome(), this.getEndereco().getCidade(), this.getTelefone()};
    }    
}