/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory_method;

/**
 *
 * @author juanan
 */
public abstract class AbstractFactory {
    
    public Product createProduct() {
        return factoryMethod();
    }
    
    protected abstract Product factoryMethod();
    
}
