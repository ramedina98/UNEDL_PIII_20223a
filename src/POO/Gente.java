/*
Iniciamos la practica el dia 8 de marzo del 20223
*/
package POO;

public class Gente {
    String nombre; 
    byte edad; 
    
    //constructores...
    public Gente(){
        
    }
    //Sirven para generar nuevas instancias de tipo gente...
    public Gente(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //metodos...
    public void Hablar(){
        System.out.println("Estoy hablando " + nombre);
    }
    public void Callar(){
        System.out.println(nombre + " yo me callo");
    }
}