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
public class Alumno extends Persona implements EstaEnUnCentro {
    private String estudia;
    private Vocacion vocacion;
    private String centro;
    
    
    public Alumno(){
        centro="Salzillo";
    }
    
    public Alumno (String nombre, int edad,String carrera){
        super(nombre,edad);
        estudia=carrera;
        vocacion=aspira("empresario");
    }
    
    public Alumno (String nombre, int edad,String carrera,String centro){
        super(nombre,edad);
        estudia=carrera;
        vocacion=aspira("empresario");
        this.centro= centro;
    }
    
    

    public class Vocacion implements Serializable{
    private String vocacion;
    private Vocacion(String vocacion){
        this.vocacion = vocacion;
    }
        
        public String getVocacion() {
            return vocacion;
        }
    

}// fin class Vocacion

public Vocacion aspira (String vocacion){
            return new Vocacion (vocacion);
        }
    public Vocacion getVocacion() {
        return vocacion;
    }

    public String getEstudia() {
        return estudia;
    }
    
    
    
    
    public void ocupacion(){
        System.out.println("estudia");
    }
    
    
    public void universidad(){
        System.out.println("universidad");
    }
    
    public void caracteristicas(){
        serVivo();
        ocupacion();
        universidad();
    }
    
    public String centroEnElQueEstoy(){
        return centro;
    }
    
}
