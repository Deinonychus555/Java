/*
 // http://www.oodesign.com/factory-method-pattern.html
 */
package design_patterns.factory_method;

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
          
          
          AbstractFactory factory = new ConcreteFactoryA();
          Product product = factory.createProduct();
          System.out.println(product.toString());
    }
    
}
