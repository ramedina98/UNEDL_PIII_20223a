/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosUnicos;

/**
 *
 * @author ricardomedina
 */
public class busquedas {
    public static String binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;
        String cadena = "no"; // Aquí guardaremos la cadena y la retornaremos...

        while (left <= right) {
            /*en este caso ya esta acomodado */
            System.out.println("Se hace el proceso 0");
            int mid = left + (right - left) / 2;
            // Obtener la subcadena "//CRN" de cada elemento del array
            String subcadena = array[mid].substring(0, 5);
            System.out.println("Esta es la info extraida del array: " + subcadena);

            int compareResult = subcadena.compareTo(target);

            System.out.println("Resultado de la comparacion: " + compareResult);

            if (compareResult == 0) {
                cadena = array[mid];
                return cadena;
            }
            if (compareResult < 0) {
                right = mid - 1; // Descartar la mitad derecha del array
            } else {
                left = mid + 1; // Descartar la mitad izquierda del array
            }
        }

        return cadena; // El valor no se encuentra en el array
    }
    
    //codigo de la busqueda secuencial...
    public static int[] secuencialSearch(String[] array, String target, int campo){
        int[] items = new int[1221]; //Aqui capturamos todo lo encontrado...
        int x = 0;
        int y = 0; 
        int i = 0; 
        int pos = 0; 
        int d = 0; 
        String[] extracto = new String[1221]; 
        
        switch(campo){
            case 0: 
                //busqueda por el crn...
                //extraemos el campo que se necesita...
                for(i = 0; i < array.length; i++){
                    extracto[i] = array[i].substring(0, 5);
                    System.out.println("CRN: " + extracto[i]);
                }
                //buscamos todos los elementos que coincidan... en este caso solo coincidira uno...
                int out = 0;
                x = 0; 
                do{
                    if(extracto[x] == null ? target == null : extracto[x].equals(target)){
                        System.out.println("Encontre algo");
                        items[0] = 0; 
                        items[1] = x; 
                        out = 1; 
                    }
                    x++; 
                }while(out != 1); 
            break;
            
            case 1: 
                //busqueda por la clave...
                //extraemos el campo que se necesita...
                for(i = 0; i < array.length; i++){
                    extracto[i] = array[i].substring(6, 11);
                    System.out.println("clave: " + extracto[i]);
                }
                //buscamos todos los elementos que coincidan con la clave...
                x = 0;
                for(i = 0; i < extracto.length; i++){
                    if(extracto[i].equals(target)){
                        items[x] = i; 
                        x++;  
                    }
                }
            break; 
            
            case 2: 
                //busqueda materia...
                
                //extraemos los datos del campo necesario...
                for(i = 0; i < array.length; i++){
                    pos = 12;
                    while (!ApoyoEstructuras.digito(array[i].charAt(pos))) {
                        pos++;
                    }
                    extracto[i] = array[i].substring(12, pos - 2); 
                }
                //buscamos los indices...
                x = 0; 
                for(i = 0; i < extracto.length; i++){
                    if(extracto[i] == null ? target == null : extracto[i].equals(target)){
                        items[x] = i; 
                        x++; 
                    }
                }
            break; 
            
            case 3: 
                //busqueda Apellidos...
                
                //extraemos los datos del campo necesario...
                for(i = 0; i < array.length; i++){
                    // Obtener la subcadena "//APELLIDOS" de cada elemento del array
                    pos = array[i].length();
                    while (!ApoyoEstructuras.coma(array[i].charAt(pos - 1))) {
                        pos--;
                    }
                    pos--;
                    d = pos;
                    while (!ApoyoEstructuras.digito(array[i].charAt(pos - 1))) {
                        pos--;
                    }
                    extracto[i] = array[i].substring(pos + 1, d); 
                }
                //buscamos los indices...
                x = 0; 
                for(i = 0; i < extracto.length; i++){
                    if(extracto[i] == null ? target == null : extracto[i].equals(target)){
                        items[x] = i; 
                        x++; 
                    }
                }
            break; 
            
            case 4: 
                //busqueda por nombre...
                //primero extraemos todos los campos necesarios y los volvemos a reescribir en el mismo array...
                for(i = 0; i < array.length; i++){
                    // Obtener la subcadena "//NOMBRE" de cada elemento del array
                    pos = array[i].length();
                    while (!ApoyoEstructuras.coma(array[i].charAt(pos - 1))) {
                        pos--;
                    }
                    extracto[i] = array[i].substring(pos + 1, array[i].length() - 11);
                    //System.out.println("Nombre: " + array[i]);
                }
                //buscamos ahora si... 
                x = 0; 
                //System.out.println("El target es: " + target);
                for(i = 0; i < extracto.length; i++){
                    if(extracto[i] == null ? target == null : extracto[i].equals(target)){
                        //System.out.println("Se encontro " + x + " (vez/veces)");
                        items[x] = i; 
                        x++; 
                    }
                }
        }
        
        return items; 
    }
    
}
