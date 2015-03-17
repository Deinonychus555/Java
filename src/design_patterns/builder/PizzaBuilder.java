/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.builder;

/** "Abstract Builder" */
abstract class PizzaBuilder {
    
    protected Pizza pizza;
 
    
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }
    
    public Pizza getPizza() { 
        return pizza; 
    }
    
 
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
