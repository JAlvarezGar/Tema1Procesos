/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasaleatorias;

/**
 *
 * @author jjalvarezgar@gmail.com
 */
public class PalabrasAleatorias {

      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeroPalabras=0;
        int numeroLetras=0;
        String palabra="";
        String nombreFichero;
           // Si tenemos un argumento, el primero es el número de palabras a generar
        if (args.length > 0) {
            numeroPalabras = Integer.parseInt(args[0]);
        } else {
            numeroPalabras = 10;
        }
        //Identificamos el sistema operativo
        String osName = System.getProperty("os.name");
        
        if (osName.toUpperCase().contains("WIN")) { 
            //Windows
            if (args.length > 1) {
                // Si tenemos segundo argumento corregimos la dirección
                 nombreFichero = args[1].replace("\\", "\\\\");
            } 
            else {
                 nombreFichero = ".\\lenguaje.txt";
                //Fichero si se omite el deseado
            }
        } else { 
            //GNU/Linux
            if (args.length > 1) {
                // Si tenemos segundo argumento
                 nombreFichero = args[1];
            } 
            else {
                nombreFichero = "./lenguaje.txt";
                //Fichero si se omite el deseado
            }
        }
        
        //System.out.println(numeroLetras);
        for (int j = 0; j < numeroPalabras; j++) {
            
            palabra="";
            numeroLetras = (int) (Math.random()*10+1);
              for (int i = 0; i < numeroLetras; i++) {
            
            // 123 es el código ASCII del la z
            // y 97 es el código ASCII de la a 
            // Para hallar un numero comprendido entre estos 
            // hay que utilizar esta fórmula: (numeroMayor-numeroMenor+1)+numeroMenor
            
            int palabraAscii = (int) (Math.random()*(122-97+1)+97);
            palabra+=(char) palabraAscii;
            
            
            
        }
        System.out.println(palabra);
        
            
        }
      

    }
    
}
