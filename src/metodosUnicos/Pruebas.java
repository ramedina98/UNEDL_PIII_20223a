//Aqui solo realizo pruebas para ver si esta jalando todo bien...
package metodosUnicos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ricardomedina
 */
public class Pruebas {
    public static void main(String[] args){
        try {
            File argumento;
            BufferedReader f = new BufferedReader(new FileReader("/Users/ricardomedina/Desktop/Estructura2/UNICOS.txt"));
            BufferedWriter f2 = new BufferedWriter(new FileWriter("E1a.txt"));
            

        } catch (IOException eio) {
            System.out.println("Error de I/O " + eio);
        }
    }
}
