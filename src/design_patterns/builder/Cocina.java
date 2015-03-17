/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.builder;

/** "Director" */
class Cocina {
    
    private PizzaBuilder pizzaBuilder;
 
    public void setPizzaBuilder(PizzaBuilder pb) { 
        pizzaBuilder = pb; 
    }
    
    public Pizza getPizza() { 
        return pizzaBuilder.getPizza(); 
    }
 
    public void construirPizza() {
       pizzaBuilder.crearNuevaPizza();
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
    }
}
