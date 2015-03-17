/*
// http://www.oodesign.com/abstract-factory-pattern.html
 */
package design_patterns.abstract_factory;

import design_patterns.factory.*;

/**
 *
 * @author juanan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Factoria
          
          
         AbstractFactory pf=FactoryMaker.getFactory("1");
         AbstractProductA product=pf.createProductA();
         product.operationA1();
	
         System.out.println("");
         /////////////////////////////////////////////
         System.out.println("");
         
         
         AbstractPizzeria pizzeria = new ConcretePizzeria();
         Pizza pizza = pizzeria.crearPizza();
         pizza.showRecipe();
    }
    
}
