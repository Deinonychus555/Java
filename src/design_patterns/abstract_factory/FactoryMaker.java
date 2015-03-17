/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns.abstract_factory;

import java.util.HashMap;

/**
 *
 * @author juanan
 */
class FactoryMaker{
	private static AbstractFactory pf=null;
        
        
        
	static AbstractFactory getFactory(String choice) {
		if(choice.equals("1")){
                    pf=new ConcreteFactory1();
		}
                else if(choice.equals("2")) {
                    pf=new ConcreteFactory2();
		} 
                return pf;
	}
}
