/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juanan
 */
public abstract class Padre {
    private int dinero;
    
    public Padre(){
        dinero=33000;
    }
    
    public abstract void uno ();
    
    public void dos (){
        System.out.println("dos.padre");
    }
    
     private void tres (){
        System.out.println("tres.padre");
    }
     
     public void cuatro (){
        System.out.println("cuatro.padre");
    }
     
    
    
     
    
    
}
