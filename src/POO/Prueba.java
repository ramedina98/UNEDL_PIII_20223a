/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author ricardomedina
 */

import java.util.Scanner;
public class Prueba {
    
    static Scanner leer = new Scanner(System.in); 
    static Sedan cocheraSedanes[] = new Sedan[5]; 

    public static void main(String[] args){
        
        byte contadorEspacios = 0; 
        boolean salir  = false; 
        
        do{
            System.out.println("Menu coches");
            System.out.println("1 - Guardar un coche");
            System.out.println("2 - Editar un coche");
            System.out.println("3 - Actualizar un coche");
            System.out.println("4 - Eliminar un coche");
            System.out.println("5 - Salir");
            System.out.println("");
            
            switch(leer.nextByte()){
                
                case 1:
                    
                    captura(contadorEspacios); 
                    contadorEspacios++; 
                    
                break;
                
                case 2: 
                    
                break;
                
                case 3: 
                    
                break;
                
                case 4: 
                    
                break;
                
                case 5: 
                    System.out.println("Adios pues...");
                    salir = true; 
                break;
                
            }
        }while(salir == false); 
        
    }
    
    public static void captura(byte fila){
       //Metodo de captura de datos del objeto... 
        System.out.println("Capture el cilindraje");
        byte cilindraje = leer.nextByte(); 
        System.out.println("Capture el rendimiento de kilometros por litros");
        String rendimiento = leer.next(); 
        System.out.println("Capture el modelo");
        String modelo = leer.next(); 
        System.out.println("Capture la direccion");
        String direccion = leer.next(); 
        System.out.println("Tipo de motor");
        String motor = leer.next(); 
        System.out.println("Que tipo de combustible usa?");
        String combustible = leer.next(); 
        System.out.println("Cuantas puertas tiene?");
        byte puertas = leer.nextByte(); 
        System.out.println("De que año es el modelo?");
        byte anyo = leer.nextByte(); 
        
        //Sedan vehiculo = new Sedan((byte) cilindraje, rendimiento, modelo, direccion, motor, combustible, (byte) puertas, (int) anyo); 
        //cocheraSedanes[fila] = vehiculo; 
    }
    public static void imprimir(){
            
    }
    public static void editar(){
            
    }
    public static void eliminar(){
            
    }
}
