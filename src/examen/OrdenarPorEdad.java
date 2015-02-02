/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juanan
 */
import java.util.Comparator;

public class OrdenarPorEdad implements Comparator{
    public int compare (Object o1, Object o2){
        Persona p1 =(Persona) o1;
        Persona p2 =(Persona) o2;
        return (p1.getEdad()<p2.getEdad())?-1:(p1.getEdad()==p2.getEdad())?0:1;
    }
    
}
