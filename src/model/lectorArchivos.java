package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author los Mafios
 */
public class lectorArchivos {
    private BufferedReader entrada;
    private ArrayList<String> palabras;
    //private Set hs;
    
    public lectorArchivos(){
        palabras = new ArrayList<String>();
       //Set hs = new HashSet();
    }
    public void leerArchivo(File lectura)throws IOException{
        String renglon;
        entrada = new BufferedReader(new FileReader(lectura));
        String[] cadena;
            while ((renglon = entrada.readLine()) != null) {
                    for (int i = 0; i < renglon.length(); i++) {
                        
                        //System.out.print(renglon.charAt(i));
                        
                    }
                    
                    for (int j = 0; j < darPalabra(renglon).length; j++) {
                            cadena = darPalabra(renglon);
                            palabras.add(cadena[j]);
                            //System.out.println("\n palabras sepoaradas: "+cadena[j]);
                            
                        }
                    
                    System.out.println("");
                }
    }
    
    public String[] darPalabra(String cadena){
        String delimitadores= "[ .,;?!¡¿\'\"\\[\\]]+";
        String[] palabrasSeparadas = cadena.split(delimitadores);
        return palabrasSeparadas;
    }
    
    public Integer buscarPalabra(String cadena){
        Set hs = new HashSet();
        Integer res = 0;
        for (int i = 0; i < palabras.size(); i++) {
            if (cadena.equals(palabras.get(i))) {
                llenarNodo((i+1), hs);
            }
            
            //System.out.println("palabras es: "+palabras.get(i));
        }
        if(hs.size()>0){
            res = darNodoMasCercano(hs);
        }
        return res;
    } 
    
    private void llenarNodo(int nro, Set hs){
        hs.add(nro);
    }
    
    private Integer darNodoMasCercano(Set hs){
        Integer res;
        res = (Integer) Collections.min(hs);
        return res;
    }
    
    public String darCademas(int nro){
        String cadena="";
        
        for (int i = 0; i < nro; i++) {
            cadena = cadena +"Raiz => "+ palabras.get(i)+"\n";
        }
        return cadena;
    }
}
