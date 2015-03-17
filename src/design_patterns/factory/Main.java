/*
// http://www.oodesign.com/factory-pattern.html
 */
package design_patterns.factory;

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
          
          
          ProductFactory.instance().registerProduct("A", ProductA.class);
          ProductFactory.instance().registerProduct("B", ProductB.class);
          ProductFactory.instance().getKeys();
          Product product1 = ProductFactory.instance().createProduct("A");
          Product product2 = ProductFactory.instance().createProduct("B");
          System.out.println(product1.toString());
          System.out.println(product2.toString());
    }
    
}
