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
public class RecipeHawaiFactory extends RecipeFactory {
    
    public static final String masa = "pan de centeno";
    public static final String salsa = "tomate";
    public static final ArrayList<String> ingredientes = new ArrayList();
    
    public RecipeHawaiFactory() {
        ingredientes.add("piña");
        ingredientes.add("cebolla");
        ingredientes.add("bacon");
    }
    
    
    public String getMasa() {
        return masa;
    }
    
    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
    
    public  String getSalsa() {
        return salsa;
    }
    
    
    
}
