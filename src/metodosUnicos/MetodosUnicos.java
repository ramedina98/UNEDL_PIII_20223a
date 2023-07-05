/*Aqui debemos de tener todos los metodos de: estructuras, ordenamiento y busqueda...*/
package metodosUnicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ricardomedina
 */
public class MetodosUnicos {
    
    //Estructuras E1a... 
    public String[] E1a(File Archivo) throws IOException{
        BufferedReader f = new BufferedReader(new FileReader(Archivo));

        
        //Aqui se guarda todo, en ese array...
        String[] E1a = new String[1221];

        String cad = f.readLine();
        //System.out.println(cad);
        int cont = 0;
        while (cad != null) {
            String CRN = cad.substring(0, 5);
            //System.out.println(CRN);
            //CRN = completa(CRN, 5);
            cad = cad.substring(6, cad.length());

            String CLAVE = cad.substring(0, 5);
            //CLAVE = completa(CLAVE, 5);
            cad = cad.substring(6, cad.length());
            //System.err.println(cad);
            int pos=0;
            while (!ApoyoEstructuras.digito(cad.charAt(pos))) {                    
                pos++;
            }
            String MATERIA=cad.substring(0, pos-2);
            //System.err.println(MATERIA);
            cad=cad.substring(pos+3, cad.length());

            //System.out.println(cad);
            pos=0;
            while (ApoyoEstructuras.digito(cad.charAt(pos))){
                pos++;
            }
            String CREDITOS=cad.substring(0,pos);
            //System.out.println(CREDITOS);
            cad=cad.substring(pos+1,cad.length());

            pos=0;
            while (ApoyoEstructuras.digito(cad.charAt(pos))) {                    
                pos++;
            }
            String CUPO=cad.substring(0,pos);
            cad=cad.substring(pos+1,cad.length());


            pos=0;
            while (ApoyoEstructuras.digito(cad.charAt(pos))||ApoyoEstructuras.negativo(cad.charAt(pos)))
              pos++;
            String DISPONIBLES=cad.substring(0,pos);
            cad=cad.substring(pos,cad.length());

              //Integer.valueOf(str).intValue();
            int cup=Integer.valueOf(CUPO).intValue();
            int dis;
            if(ApoyoEstructuras.negativo(DISPONIBLES.charAt(0))){
            String DISP2=DISPONIBLES.substring(1,DISPONIBLES.length());
                dis=Integer.valueOf(DISP2).intValue()*-1;
            }else {
                dis=Integer.parseInt(DISPONIBLES);
            }
            String INSCRITOS=String.valueOf(cup-dis);

            pos=cad.length();
            while(!ApoyoEstructuras.coma(cad.charAt(pos-1)))
                pos--;
            String NOMBRE=cad.substring(pos+1,cad.length()-11);
            //NOMBRE=completa(NOMBRE, 35);

            pos--;
            int d=pos;
            while(!ApoyoEstructuras.digito(cad.charAt(pos-1)))
                pos--;
            String APELLIDOS=cad.substring(pos+1,d);
            //APELLIDOS=completa(APELLIDOS, 40);

            String reg=CRN+"|"+CLAVE+"|"+MATERIA+"|"+CREDITOS+"|"+CUPO+"|"+DISPONIBLES+"|"+INSCRITOS+"|"+NOMBRE+"|"+APELLIDOS+"|";
            //System.out.println(reg);
            reg = ApoyoEstructuras.completa(reg, 120);
            
            E1a[cont++] = reg;
            
            cad = f.readLine();
            cont++;
        }
        
        return E1a; 
    }
    
}
