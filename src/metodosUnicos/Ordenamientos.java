/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosUnicos;

/**
 *
 * @author ricardomedina
 */
public class Ordenamientos {
    
    //Ordenamiento Shell...
    public static String[] ordenamientoSehll(String registro[]){
        
        int salto, i; 
        String aux;
        boolean cambios; 
        
        for(salto = registro.length / 2; salto != 0; salto /= 2){
            cambios = true; 
            while(cambios){
                cambios = false; 
                for(i = salto; i < registro.length; i++){
                    if(registro[i - salto].compareTo(registro[i])<0){
                        aux = registro[i]; 
                        registro[i] = registro[i - salto]; 
                        registro[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        
        return registro;
    }
    
    //Ordenamiento burbuja...
    public static String[] ordenamientoBurbuja(String registro[]){
        int n = registro.length;
        String aux;
        boolean cambios;
        
        for(int i = 0; i < n - 1; i++){
            cambios = false; 
            for(int j = 0; j < n - i - 1; j++){
                if(registro[j].compareTo(registro[j+1])<0){
                    aux = registro[j];
                    registro[j] = registro[j + 1];
                    registro[j + 1] = aux; 
                    cambios = true;
                }
            }
            
            if(!cambios){
                break;
            }
        }
        
        return registro;
    }
    //Ordenamiento por selección...
    public static String[] ordenamientoSeleccion(String registro []){
        
        int n = registro.length; 
        int minimo; 
        String aux; 
        
        for(int i = 0; i < n - 1; i++){
            minimo = i; 
            for(int j = i + 1; j < n; j++){
                if(registro[j].compareTo(registro[minimo]) > 0){
                    minimo = j;
                }
            }
            aux = registro[i]; 
            registro[i] = registro[minimo]; 
            registro[minimo] = aux;
        }
        
        return registro;
    }
}
