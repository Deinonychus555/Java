/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.builder;

/** "ConcreteBuilder" */
class HawaiPizzaBuilder extends PizzaBuilder {
    
    public void buildMasa() { 
        pizza.setMasa("suave"); 
    }
    
    public void buildSalsa() { 
        pizza.setSalsa("dulce"); 
    }
    
    public void buildRelleno() { 
        pizza.setRelleno("chorizo+alcachofas"); 
    }

    
}
