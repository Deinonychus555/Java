/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Comparator;

/**
 *
 * @author Juanan
 */
public class OrdenarPorNombre implements Comparator{
    public int compare (Object o1, Object o2){
        Persona p1 =(Persona) o1;
        Persona p2 =(Persona) o2;
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
