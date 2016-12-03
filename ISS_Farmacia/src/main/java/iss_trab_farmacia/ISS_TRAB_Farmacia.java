/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
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
        datastore = morphia.createDatastore(new MongoClient(new MongoClientURI("mongodb://teste:123456@ds159737.mlab.com:59737/farmacia")),"farmacia");
        
        datastore.ensureIndexes();
        
        Login login = new Login();
        login.setVisible(true);
    }
    
}
