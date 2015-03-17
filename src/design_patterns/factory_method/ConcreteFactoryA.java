/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.factory_method;

/**
 *
 * @author juanan
 */
public class ConcreteFactoryA extends AbstractFactory {
    
    // Es el hijo quién le dice al padre que clase concreta crear
    // El método implementado es protected
    protected Product factoryMethod() {
        return new ProductA();
    }
    
}
