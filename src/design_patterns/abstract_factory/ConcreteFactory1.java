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
public class ConcreteFactory1 extends AbstractFactory {
    
    AbstractProductA createProductA(){
		return new ProductA1("ProductA1");
	}
    
    AbstractProductB createProductB(){
		return new ProductB1("ProductB1");
	}

    
}
