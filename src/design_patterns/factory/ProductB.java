/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory;

/**
 *
 * @author juanan
 */
public class ProductB implements Product{
    
    private static final String DESCRIPTION = "Product B";
    
    
    public ProductB() {
        
       
    }
    
    public String toString() {
        return DESCRIPTION;
    }
    
}
