/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.control;

import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.entity.Produto;
import iss_trab_farmacia.entity.Venda;
import iss_trab_farmacia.util.ItemVenda;
import iss_trab_farmacia.util.SingletonBd;
import iss_trab_farmacia.view.BuscarCliente;
import iss_trab_farmacia.view.BuscarProduto;
import java.util.List;
import javax.swing.JFrame;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.BasicDAO;

/**
 *
 * @author guilherme
 */
public class Vendas extends BasicDAO<Venda, ObjectId> {
   
    BuscarProduto buscarProduto;
    BuscarCliente buscarCliente;
    
    public Vendas() {
        super(Venda.class, SingletonBd.getInstance().getDs());
    }    

    public void buscarCliente(){    
        JFrame busca = new JFrame();
        busca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        busca.setSize(600, 400);
        busca.setVisible(true);

        buscarCliente = new BuscarCliente();
        buscarCliente.setSize(busca.getSize());
        buscarCliente.alterarTitulo("Adicionar Cliente");
        buscarCliente.habilitarAdicionarCliente(true);
        buscarCliente.setVisible(true);

        busca.add(buscarCliente);
    }

    public void buscarProduto(){
        JFrame busca = new JFrame();
        busca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        busca.setSize(600, 400);
        busca.setVisible(true);

        buscarProduto = new BuscarProduto();
        buscarProduto.setSize(busca.getSize());
        buscarProduto.alterarTitulo("Adicionar Produto");
        buscarProduto.habilitarAdicionarProduto(true);
        buscarProduto.setVisible(true);

        busca.add(buscarProduto);
    }
        
    public List<Venda> buscarCliente(Pessoa cliente) {
       return this.getDs().createQuery(Venda.class).field("Pessoa.nome").equal(cliente.getNome()).asList();
    }
    
    public void addProdutoVenda(Venda venda, Produto produto, int qnt){
        Produtos produtos = new Produtos();
        
        ItemVenda item = venda.inVenda(produto);
        if (venda.inVenda(produto) == null) {
            float valorVenda = produtos.sugestaoValor(produto);
            float custo = produtos.custo(produto);
            item = new ItemVenda(qnt, valorVenda, custo, produto);
        }
        else {
            item.addQnt(qnt);
        }
        venda.addItemVenda(item);
    }
}
