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
abstract class AbstractFactory {
    
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();

    
}
