/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.abstract_factory;

/**
 *
 * @author juanan
 */
public class ConcretePizzeria extends AbstractPizzeria{
    
   public Pizza crearPizza() {
        RecipeFactory factory = new RecipeHawaiFactory();
        Pizza pizza = new Pizza(factory);
        return pizza;
    }
    
}
