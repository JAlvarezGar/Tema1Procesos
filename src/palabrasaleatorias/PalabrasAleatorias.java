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

        int numeroLetras=0;
        String palabra="";
        numeroLetras = (int) (Math.random()*10+1);
        //System.out.println(numeroLetras);
        for (int i = 0; i < numeroLetras; i++) {
            
            int palabraAscii = (int) (Math.random()*(123-97+1)+97);//(N-M+1)+M
            palabra+=(char) palabraAscii;
            
            System.out.println(palabraAscii);
            
        }
        System.out.println(palabra);

    }
    
}
