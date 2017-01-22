/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.entity;

import iss_trab_farmacia.util.ItemCompra;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guest-e6ap0z
 */
public class CompraTest {
    
    public CompraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItensCompra method, of class Compra.
     */
    @Test
    public void testGetItensCompra() {
        System.out.println("getItensCompra");
        Compra instance = new Compra();
        List<ItemCompra> expResult = null;
        List<ItemCompra> result = instance.getItensCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inCompra method, of class Compra.
     */
    @Test
    public void testInCompra() {
        System.out.println("inCompra");
        Produto produto = null;
        Compra instance = new Compra();
        ItemCompra expResult = null;
        ItemCompra result = instance.inCompra(produto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Compra.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Compra instance = new Compra();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFornecedor method, of class Compra.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Pessoa fornecedor = null;
        Compra instance = new Compra();
        instance.setFornecedor(fornecedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemCompra method, of class Compra.
     */
    @Test
    public void testAddItemCompra() {
        System.out.println("addItemCompra");
        ItemCompra item = null;
        Compra instance = new Compra();
        instance.addItemCompra(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
