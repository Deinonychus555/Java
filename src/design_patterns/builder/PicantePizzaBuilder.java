/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.builder;

/** "ConcreteBuilder" */
class PicantePizzaBuilder extends PizzaBuilder {
    
    public void buildMasa() { 
        pizza.setMasa("cocida"); 
    }
    
    public void buildSalsa() { 
        pizza.setSalsa("picante"); 
    }
    
    public void buildRelleno() { 
        pizza.setRelleno("pimienta+salchichón"); 
    }
}
