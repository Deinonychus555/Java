/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.abstract_factory;

import java.util.ArrayList;

/**
 *
 * @author juanan
 */
public class Pizza {
    
        private String masa;
        private String salsa;
        private ArrayList<String> ingredientes;
    
    public Pizza(RecipeFactory factory) {
        this.masa = factory.getMasa();
        this.salsa = factory.getSalsa();
        this.ingredientes = factory.getIngredientes();
        
    }
    
    public void showRecipe() {
        System.out.println("Masa: " + this.masa);
        System.out.println("Salsa: " + this.salsa);
        System.out.println("Ingredientes: ");
        for (String ingrediente : this.ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
    
}
