/*
// http://es.wikipedia.org/wiki/Builder_%28patr%C3%B3n_de_dise%C3%B1o%29
 */
package design_patterns.builder;

/**
 *
 * @author juanan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
 
        cocina.setPizzaBuilder( hawai_pizzabuilder );
        cocina.construirPizza();
 
        Pizza pizza = cocina.getPizza();
        pizza.showReceta();
    }
    
}
