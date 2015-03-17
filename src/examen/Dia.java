/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juanan
 */

// Revisar como usar clases de copnstantes para crear un tipo numerado
public final class Dia {
    
    public final static String LUNES="Lunes";
    public final static String MARTES="Lunes";
    
    private String nombre;
    
    private Dia (String nombre){
        this.nombre=nombre;}
    
    public String toString (){
    return nombre;
}
    public final static Dia
     L =new Dia("Lunes"),
     M =new Dia("Martes"), //public final static Dia M =new Dia("Martes");
     X =new Dia("Miercoles"),//public final static X =new Dia("Miercoles");
     J =new Dia("Jueves"),
     V =new Dia("Viernes"),
     S =new Dia("Sabado"),
     D =new Dia("Domingo");
    
    
    
}
