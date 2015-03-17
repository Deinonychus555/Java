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
class ProductB1 extends AbstractProductB {
    
	ProductB1(String arg){
		System.out.println("Hello "+arg);
	} // Implement the code here
        @Override
	public void operationB1() { System.out.println("ProductB1: operationB1"); }
	
        @Override
        public void operationB2() { System.out.println("ProductB1: operationB2"); }
}

