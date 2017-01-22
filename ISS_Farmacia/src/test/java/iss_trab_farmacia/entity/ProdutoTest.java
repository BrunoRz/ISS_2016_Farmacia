/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import com.github.fakemongo.Fongo;
import iss_trab_farmacia.control.Produtos;
import iss_trab_farmacia.util.SingletonBd;
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author guilherme
 */
public class ProdutoTest {
    
    Produtos produtos;
    
    public ProdutoTest() {
        produtos = new Produtos();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Morphia morphia = new Morphia();
        morphia.mapPackage("iss_trab_farmacia.entity");
        morphia.mapPackage("iss_trab_farmacia.util");
        
        SingletonBd.getInstance().setDs(morphia.createDatastore(new Fongo("Test").getMongo(), "Test"));
        
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isRequerReceita method, of class Produto.
     */
    @Test
    public void testRequerReceita() {
        System.out.println("RequerReceita");
        Produto instance = new Produto();
        instance.setRequerReceita(false);
        boolean expResult = false;
        boolean result = instance.isRequerReceita();
        assertEquals(expResult, result);
        if (!produtos.getValidador().getValidator().validateProperty(instance, 
                "requerReceita").isEmpty()) {
            fail("Não possui validação");
        }
    }

    /**
     * Test of getCodigoBarras method, of class Produto.
     */
    @Test
    public void testGetCodigoBarras() {
        System.out.println("getCodigoBarras");
        Produto instance = new Produto();
        instance.setCodigoBarras("1234567890128");
        String expResult = "1234567890128";
        String result = instance.getCodigoBarras();
        assertEquals(expResult, result);
        if (!produtos.getValidador().getValidator().validateProperty(instance, 
                "codigoBarras").isEmpty()) {
            fail("Validação do codigo de barras errada");
        }
    }

    /**
     * Test of getValorPadrao method, of class Produto.
     */
    @Test
    public void testGetValorPadrao() {
        System.out.println("getValorPadrao");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getValorPadrao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class Produto.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Produto.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Produto instance = new Produto();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Produto.
     */
    @Test
    public void testDescricao() {
        System.out.println("Descricao");
        String descricao = "";
        Produto instance = new Produto();
        instance.setDescricao(descricao);
        if (produtos.getValidador().getValidator().validateProperty(instance, 
                "descricao").isEmpty()) {
            fail("Deveria retornar como invalido");
        }
    }

    /**
     * Test of toVetor method, of class Produto.
     */
    @Test
    public void testToVetor() {
        System.out.println("toVetor");
        Produto instance = new Produto();
        instance.setCategoria("teste");
        instance.setMarca("teste");
        instance.setDescricao("teste");
        instance.setRequerReceita(false);
        instance.setValorPadrao(0);
        Object[] expResult = {"teste", "teste", null, "teste", (float) 0.0};
        Object[] result = instance.toVetor();
        assertArrayEquals(expResult, result);
    }
    
}
