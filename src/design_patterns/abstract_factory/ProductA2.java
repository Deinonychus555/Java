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
class ProductA2 extends AbstractProductA{
	ProductA2(String arg){
		System.out.println("Hello "+arg);
	} // Implement the code here
	public void operationA1() { System.out.println("ProductA2: operationA1");};
	public void operationA2() { System.out.println("ProductA2: operationA2");};
}

