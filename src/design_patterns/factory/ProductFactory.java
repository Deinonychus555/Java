/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanan
 */
public class ProductFactory {
    
    private HashMap m_RegisteredProducts = new HashMap();
    private static ProductFactory instance = new ProductFactory();
    
    public static ProductFactory instance() {
        return instance;
    }

	public void registerProduct (String productID, Class productClass)
	{
		m_RegisteredProducts.put(productID, productClass);
	}

	public Product createProduct(String productID)
	{
		Class productClass = (Class)m_RegisteredProducts.get(productID);
		Constructor productConstructor = null;
        try {
            productConstructor = productClass.getDeclaredConstructor(new Class[] { });
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        Product newProduct = null;
        try {
            newProduct =  (Product)productConstructor.newInstance(new Object[] { });
        } catch (InstantiationException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ProductFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newProduct;
        }
        
        public void getKeys() {
           Set<String> set =  m_RegisteredProducts.keySet();
           for (String id : set) {
               System.out.println(id);
           }
        }
}
