/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosUnicos;

/**
 *
 * @author ricardomedina
 */
public class ApoyoEstructuras {
    //Este metodo acompleta los espacios vacios...
    public static String completa(String cadx, int longitud) {
        if (cadx.length() > longitud) {
            cadx = cadx.substring(0, longitud);
        } else {
            while (cadx.length() < longitud) {
                //cadx=cadx+'-';
                cadx += '-';
            }
        }
        return cadx;
    }
    
    /*Metodos escenciales en la extracción de información...*/
    public static boolean digito(char c) {
        return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
            || c == '6' || c == '7' || c == '8' || c == '9';
    }

    public static boolean digito5(String cad) {
        return digito(cad.charAt(0))
                && digito(cad.charAt(1))
                && digito(cad.charAt(2))
                && digito(cad.charAt(3))
                && digito(cad.charAt(4));
    }
    
    public static boolean negativo(char j){
        return j=='-';
    }
    
    public static boolean coma(char j){
            return j==',';
    }
}
