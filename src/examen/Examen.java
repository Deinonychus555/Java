/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;



/**
 *
 * @author Juanan
 */
import java.util.Collections;
import java.util.Iterator;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.HashMap;

import java.io.File;

import java.util.Scanner;

// E/S para objetos (no necesitan buffer)
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

// E/S para texto
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;  // utilizado para leer lineas de texto (varios strings seguidos)
import java.io.InputStreamReader;   //para leer de consola
import java.io.FileReader;

// E/S para datos (tipos primitivos)
import java.io.DataInputStream;  //para leer numeros y caracteres sueltos
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;


import java.io.RandomAccessFile;

import java.io.StreamTokenizer;   //para sacar texto, te diferencia numeros de letras
import java.io.StringReader;





import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;
import java.lang.ClassNotFoundException;






public class Examen {
    
    private String palabra;
    private int numero;
    private char caracter;
    
    public Examen(){};

    public String getPalabra() {
        return palabra;
    }

    public int getNumero() {
        return numero;
    }

    public char getCaracter() {
        return caracter;
    }
    
    

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws IOException {
          // PRUEBA PERSONA
         
        Persona[] individuos={new Profesor("Jesus",48,"matematicas"),new Alumno("Juan",37,"informatica"),new Profesor("Juampa",32,"java")};
        List <Persona> personas =new ArrayList <Persona> ();
        personas.add(new Profesor("Jesus",48,"matematicas"));
        personas.add(new Alumno("Juan",37,"informatica"));
         personas.add(new Alumno("Sandra",23,"filosofia"));
        personas.add(new Profesor("Juampa",32,"java"));
         personas.add(new Alumno("Amanda",25,"medicina"));
       
        System.out.println("Ordenado por edad (orden por defecto en la clase Persona)");
        Set <Persona> s = new TreeSet<Persona>();
        Iterator<Persona> i = personas.iterator();
        while (i.hasNext()){
            Persona p = i.next();
            s.add(p);
        }
         Iterator<Persona> it = s.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
       System.out.println("Ordenado por nombre (utilizando Comparator)");
        Set <Persona> ss = new TreeSet<Persona>(new OrdenarPorNombre());
        i = personas.iterator();
        while (i.hasNext()){
            Persona p = i.next();
            ss.add(p);
        }
          it = s.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
        
        /*
        System.out.println("MOSTRAR ORDENADO");
        Collections.sort(personas);
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
        
        System.out.println("MOSTRAR ORDENADO POR NOMBRE");
        Collections.sort(personas,new OrdenarPorNombre());
         it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
        
        System.out.println("MOSTRAR ORDENADO POR EDAD");
        Collections.sort(personas,new OrdenarPorEdad());
        it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
        
         System.out.println("CAMBIAR EDAD");
        Collections.sort(personas,new OrdenarPorEdad());
        it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            Scanner e = new Scanner(System.in);
            System.out.println("Introduce una nueva edad para "+p.getNombre());
            //int aux2=0;
            try{
                //aux2 = p.getEdad();
               
                p.setEdad(e.nextInt());
            }
            catch (EdadNulaException ex) {
                System.out.println("ERROR");
                System.out.println(ex.getMessage());
                System.out.println(ex.toString());
                //p.setEdad(aux2+1);
                try{
                p.setEdad(p.getEdad()+1);
            }
                catch(EdadNulaException ex2) {
                System.out.println("ERROR");
                }
            }//catch
        }//while
        System.out.println();
        
        System.out.println("MOSTRAR ORDENADO POR EDAD");
        Collections.sort(personas,new OrdenarPorEdad());
        it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p.toString());
            if (p instanceof Alumno){
                Alumno a = (Alumno)p;
              System.out.println(a.getVocacion().getVocacion())  ;
            }
            
        }
        System.out.println();
         
        */
        
        
       /*  //SET Y LIST
        
         
       Set <String> ss = new TreeSet<String>();
       ss.add("zapato");
       ss.add("abrigo");
       ss.add("guante");
       ss.add("guante");
       
       List <String> sss = new ArrayList<String>();
       sss.add("zapato");
       sss.add("gorro");
       sss.add("guante");
       sss.add("guante");
       sss.add("abrigo");
       
       System.out.println();
       System.out.println("Lista sin ordenar");
       for (String prenda:sss){
           System.out.println(prenda);
       }
       
       
       System.out.println();
       System.out.println("Lista ordenada");
       Collections.sort(sss);
       
       for (String prenda:sss){
           System.out.println(prenda);
       }
       
        System.out.println();
       System.out.println("TreeSet");
       TreeSet s = new TreeSet (sss);
       
       Iterator <String> i = s.iterator();
       
       while(i.hasNext()){
           String aux = i.next();
           System.out.println(aux);
       }
       
       
       */
       
        
        
        
        /* //MAP
         
       Map <String,String> dni =new HashMap <String,String>()  ;
       dni.put("1234","Juan");
       dni.put("1233","Pedro");
       dni.put("1236","Amanda");
       dni.put("1231","Benito");
       
       
       System.out.println();
       System.out.println("MOSTRAR NOMBRES");
       
       Iterator <String> j = dni.values().iterator();
       while(j.hasNext()){
            String aux = j.next();
           System.out.println(aux);
       }
       
        System.out.println();
       System.out.println("MOSTRAR DNI ORDENADO");
       
       
       TreeMap dnio = new TreeMap (dni);
       Iterator <Map.Entry <String,String>> it = dnio.entrySet().iterator();
       
       while(it.hasNext()){
           Map.Entry aux2 = it.next();
           System.out.println(aux2.getKey()+"\t"+aux2.getValue());
       }
       
       // MAP  */
        
        //ficheros
         
         Examen x=new Examen();
         //System.out.println(x.getPalabra()+"\t"+x.getNumero()+"\t"+x.getCaracter());
      //x.crearFichero ();
         
         
      /*    //CREAR FICHEROS Y DIRECTORIOS
       String separador = System.getProperty("file.separator");
             File f = new File("D:"+separador+"personas.txt");
            // File f = new File("D:"+separador+"personas"+separador);
             try{
             if (!f.exists()){
                 f.createNewFile();}
                   // f.mkdir()     ;}
             else{
                 //f = new File("d:"+separador+"personas2.txt");
                  f = new File("D:"+separador+"personas 2.txt");
                 f.createNewFile();
                 
             }
             
             }
             catch(IOException e){
             System.out.println(e.getMessage());
              }
        
         
             // SALIDA OBJETOS
             String separador2 = System.getProperty("file.separator");
             try{
                  
       ObjectOutputStream salida = new ObjectOutputStream (new FileOutputStream(f));
      Iterator<Persona> r  = personas.iterator();
       Persona p =null;
        while (r.hasNext()){
            p = r.next();
            salida.writeObject(p);
            
        }
        salida.close();
        }//try
        catch (IOException e){};
       // catch (FileNotFoundException e) {};
        
             
           
        
            // SENTRADA OBJETOS
        
        List <Persona> fulanitos = new ArrayList <Persona>();
             ObjectInputStream entrada =null;
             Persona pp;
             try{
                entrada = new ObjectInputStream (new FileInputStream(f));
             }
             catch (FileNotFoundException e){;}
             catch (IOException e){;}
             try {
                
              while ( ((pp = (Persona)entrada.readObject())) !=null){
               
                fulanitos.add(pp);
                
              }
        }//try
             catch (ClassNotFoundException e){;}
        catch (IOException e){;}
             try {entrada.close();}
           catch (IOException e){;}
             
             //Collections.sort(fulanitos,new OrdenarPorNombre());
             System.out.println("Ordenados por edad");
             Set lista = new TreeSet(fulanitos);
             Iterator <Persona> iit = lista.iterator();
             while (iit.hasNext()){
                 System.out.println (iit.next().getNombre());
                 
             }
              System.out.println();
              
             System.out.println("Ordenados por nombre");
             Collections.sort(fulanitos,new OrdenarPorNombre());
              iit = fulanitos.iterator();
             while (iit.hasNext()){
                 System.out.println (iit.next().getNombre());
                 
             }
       
         */  //  E/S   crear ficheros y ficheros de objetos
         
         
         
         /*  // E/S  con texto
         
         List <String> lista = Arrays.asList("Juan","Pepe","Matias");
         
          File ruta= new File("D:"+System.getProperty("file.separator")+"texto.txt");
          try {ruta.createNewFile();}
           catch (IOException e){;}
          String path =("D:"+System.getProperty("file.separator")+"texto2.txt");
         try{
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
             
             for(String z:lista){
                 System.out.println("escritura: "+z);
                 pw.println(z.toString());
             }
             pw.close();
         }
         catch (IOException e){;}
         
         BufferedReader br =null;
         FileReader fr = null;
         
         try {
             br= new BufferedReader (new FileReader(path));
         }
        catch (IOException e){;}
         //catch (FileNotFoundException e){;}
         
         List <String>retorno = new ArrayList <String>();
         try {
            
             String linea;
             while( (( linea = br.readLine())) !=null){
                 retorno.add(linea);
             }
         }
          catch (IOException e){;}
         
         Iterator <String> z = retorno.iterator();
         while (z.hasNext()){
             System.out.println("salida: "+z.next());
         }
         
         * 
         */  //E/S  con texto
      
         /*  //leer desde consola
         try{
         BufferedReader br2 =new BufferedReader(new InputStreamReader (System.in));
         System.out.println("Escribe algo");
         String s;
         do{
         s = br2.readLine();}
         while (s.length()==0);
         }
         catch (IOException e){;}
         */
         
         
         
         /*  //randomaccessfile
         String path =("D:"+System.getProperty("file.separator")+"numeros y letras.txt");
         
         RandomAccessFile raf = new RandomAccessFile(path,"rw");
         raf.writeDouble(26);
         raf.writeChars("dulce");
         StringReader s = new StringReader ("dama");
         int aux;
         while (( aux=s.read())!=-1){
         raf.writeChar(aux);}
         raf.writeDouble(37);
         
         raf.close();
         
         
         RandomAccessFile raf2 = new RandomAccessFile(path,"r");
        raf2.seek(8+(6*2));
         System.out.println(raf2.readChar());
         
         raf2.seek(8+(9*2));
          System.out.println(raf2.readDouble());
         raf2.close();
         
         * */ //  randomaccessfile
         
        /* //ligadura dinamica
         Padre padre = new Hija();
         padre.uno();
         padre.dos();
         padre.cuatro();
         Hija hija = (Hija)padre;
         hija.tres();
         * 
         * */ //ligadura dinamica
         
       /*  //ficheros de datos 
         
         File path = new File("D:"+System.getProperty("file.separator")+"data.txt");
         path.createNewFile();
         
          DataOutputStream dos = new DataOutputStream(new BufferedOutputStream (new FileOutputStream(path)));
         
          dos.writeDouble(5);
          StringReader aux = new StringReader("a");
          dos.writeChar(aux.read());
          dos.writeUTF("readUTF"+"\n");
           dos.writeChars("readChars"+"\n");
          dos.writeBytes("readBytes"+"\n");  //escribe mas optimamente un string 
          
          
          dos.close();
          
          DataInputStream dis = new DataInputStream( new BufferedInputStream(new FileInputStream(path)));
          BufferedReader br = new BufferedReader (new InputStreamReader(dis));
          System.out.println("dis: "+dis.readDouble());
         System.out.println("dis: "+dis.readChar());
             System.out.println("dis: "+dis.readUTF());
            
           
          System.out.println("br: "+br.readLine());
          System.out.println("br: "+br.readLine());
          br.close();
          dis.close();
          
          */ // ficheros de datos
         
         // tokens  
           File path = new File("D:"+System.getProperty("file.separator")+"tokens.txt");
         path.createNewFile();
          DataOutputStream dos2 = new DataOutputStream(new BufferedOutputStream (new FileOutputStream(path)));
         
          dos2.writeBytes("23");
          dos2.writeBytes("string");  //escribe mas optimamente un string 
         // dos2.writeInt(3);  //no lo reconoce al leerlo
          StringReader aux = new StringReader("g");
          dos2.writeChar(aux.read());
          dos2.close();
          
          StreamTokenizer st= new StreamTokenizer ( new FileReader(path));
         
         while (st.nextToken()!=StreamTokenizer.TT_EOF){
              switch (st.ttype){
                  case StreamTokenizer.TT_NUMBER : System.out.println(st.nval);break;
                  case StreamTokenizer.TT_WORD : System.out.println(st.sval);break;
                  case StreamTokenizer.TT_EOL : break;
                  case StreamTokenizer.TT_EOF : break;
                  default : System.out.println( String.valueOf(st.ttype));break;
                    
              }
              
          }
          
       
          StreamTokenizer tokenizer = new StreamTokenizer(
        new StringReader("Mary had 1 little lamb..."));

while(tokenizer.nextToken() != StreamTokenizer.TT_EOF){

    if(tokenizer.ttype == StreamTokenizer.TT_WORD) {
        System.out.println(tokenizer.sval);
    } else if(tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
        System.out.println(tokenizer.nval);
    } else if(tokenizer.ttype == StreamTokenizer.TT_EOL) {
        System.out.println();
    }

}
    }// metodo main
}// class Examen
