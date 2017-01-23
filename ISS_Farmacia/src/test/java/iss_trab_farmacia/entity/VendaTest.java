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
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guest-EsAoTb
 */
public class VendaTest {
    
    public VendaTest() {
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
     * Test of getCliente method, of class Venda.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Venda instance = new Venda();
        Pessoa expResult = null;
        Pessoa result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Venda.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Venda instance = new Venda();
        ObjectId expResult = null;
        ObjectId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataVenda method, of class Venda.
     */
    @Test
    public void testGetDataVenda() {
        System.out.println("getDataVenda");
        Venda instance = new Venda();
        Date expResult = null;
        Date result = instance.getDataVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProdutos method, of class Venda.
     */
    @Test
    public void testGetListaProdutos() {
        System.out.println("getListaProdutos");
        Venda instance = new Venda();
        Produto hipoglos = new Produto();
        hipoglos.setValorPadrao(8.5F);
        ItemVenda iv = new ItemVenda(1, 8.5F, hipoglos);
        instance.addItemVenda(iv);
        ArrayList<ItemVenda> listaItem = new ArrayList();
        listaItem.add(iv);
        List<ItemVenda> expResult = listaItem;
        List<ItemVenda> result = instance.getListaProdutos();
        assertEquals(expResult, result);
    }

    /**
     * Test of addItemVenda method, of class Venda.
     */
    @Test
    public void testAddItemVenda() {
        System.out.println("addItemVenda");
        ItemVenda item = null;
        Venda instance = new Venda();
        instance.addItemVenda(item);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of inVenda method, of class Venda.
     */
    @Test
    public void testInVenda() {
        System.out.println("inVenda");
        Produto produto = null;
        Venda instance = new Venda();
        ItemVenda expResult = null;
        ItemVenda result = instance.inVenda(produto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Venda.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Venda instance = new Venda();
        float expResult = instance.getTotal();
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Venda.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Pessoa cliente = null;
        Venda instance = new Venda();
        instance.setCliente(cliente);
        if(instance.getCliente() != null){
            fail();
        }
    }

}