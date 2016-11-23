/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import com.mongodb.MongoClient;
import iss_trab_farmacia.control.Pessoas;
import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.util.Endereco;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author guilherme
 */
public class ISS_TRAB_Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Morphia morphia = new Morphia();
        
        morphia.mapPackage("iss_trab_farmacia.entity");
        morphia.mapPackage("iss_trab_farmacia.util");
        
        final Datastore datastore;
        datastore = morphia.createDatastore(new MongoClient(),"farmacia");
        
        CadastroUsuario.main(datastore);
        
        datastore.ensureIndexes();
        
        Pessoas clientes = new Pessoas(datastore);
        
        Pessoa cliente = new Pessoa("Guilherme");
        
        cliente.setEndereco(new Endereco(87200260));
        
        clientes.save(cliente);
        
        System.out.println(clientes.findOneId());
    }
    
}
