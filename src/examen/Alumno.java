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
public class Alumno extends Persona {
    private String estudia;
    private Vocacion vocacion;
    
    public Alumno (String nombre, int edad,String carrera){
        super(nombre,edad);
        estudia=carrera;
        vocacion=aspira("empresario");
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
    
}
