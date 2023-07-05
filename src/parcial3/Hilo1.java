/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3;

/**
 *
 * @author lidre
 */
public class Hilo1 extends Thread {
    String nombre;
    int edad;
    String profesion;
    public Hilo1(){
        
    }

    public Hilo1(String nombre) {
        //this.nombre = nombre;
        super(nombre);
    }
    public void run(){
        for (int i=0; i<10;i++){
            System.out.println("Terminar el hilo"+getName());
        }
    }
    public static void main(String[]arg){
        new Hilo1("Balam").start();
        new Hilo1("Ivan").start();
        new Hilo1("Ricardo").start();
        new Hilo1("Noel").start();
        new Hilo1("Daniel").start();
    }
    
    
}
