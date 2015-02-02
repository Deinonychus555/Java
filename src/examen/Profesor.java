/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;

/**
 *
 * @author Juanan
 */
public class Profesor extends Persona {
    private String enseña;
    
    public Profesor (String nombre, int edad,String asignatura){
        super(nombre,edad);
        enseña=asignatura;
        
    }

    public String getEnseña() {
        return enseña;
    }
    
    public void ocupacion(){
        System.out.println("trabaja");
    }
    
    
    public void departamento(){
        System.out.println("departamento");
    }
    
    public void caracteristicas(){
        serVivo();
        ocupacion();
        departamento();
    }
}
