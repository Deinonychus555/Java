/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juanan
 */

import java.io.Serializable;

public abstract class Persona implements Comparable,Serializable{
    
   
    private String nombre;
    private int edad;
    
    public Persona (){;}
    
    public Persona (String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

   

    
    public void setEdad(int edad) throws EdadNulaException{
        if ((edad < 0) || (edad >100)){
        throw new EdadNulaException("edad no valida");
    }
        this.edad = edad;
    }
    
    public void serVivo (){
        System.out.println ("nace, crece, se relaciona, se reproduce y muere");
    }
    
    public int compareTo (Object o){
        Persona fulanito=(Persona)o;
        return (edad<fulanito.edad)?-1:(edad==fulanito.edad)?0:1;
    }
    
    public abstract void ocupacion();
    
    public String toString(){
        return (nombre+"\t"+edad);
    }
}
