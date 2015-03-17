/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Juanan
 */
public class Hija extends Padre{
    private int ahorros;
    
    public Hija (){
        ahorros=2300;
    }
    
     public void uno (){
         System.out.println("uno.hija");
     }
     
     public String uno(int a) {
         return "uno.hija"    ;
     }
    
    public String dos (int a){
        return "dos.hija(a)";
    }
    
    public String dos (int a, int b){
        return "dos.hija(a,b)";
    }
    
    
     public void tres (){
         
        System.out.println("tres.hija");
    }
     
}
