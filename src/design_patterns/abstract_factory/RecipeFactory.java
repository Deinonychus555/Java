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
public abstract class RecipeFactory {
    
    public abstract String getMasa();
    
    public abstract ArrayList<String> getIngredientes();
    
    public abstract String getSalsa();
    
    
    
}
