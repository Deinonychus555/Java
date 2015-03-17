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
    

public class Profesor extends Persona implements EstaEnUnCentro{
    private String enseña;
    private String centro;
    
    public Profesor(){
        centro="Salzillo";
    }
    
    public Profesor (String nombre, int edad,String asignatura){
        super(nombre,edad);
        enseña=asignatura;
        
    }
    
    public Profesor (String nombre, int edad,String asignatura, String centro){
        super(nombre,edad);
        enseña=asignatura;
        this.centro=centro;
        
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
    
    public String centroEnElQueEstoy(){
        return centro;
    }
}
