//Ejercicio de polimorfismo...
//la clase padre debe de ser abstracta para poder heredar a las clases hijo 
package POLIMORFISMO;

//El modificador bastrac le agrega esa propiedad a la clase padre, la de ser abstracta la clase... 

import static POLIMORFISMO.Principal.Arr;

public abstract class EquipoFutbol {
    
    private int ID; 
    private String nombre; 
    private String apellido; 
    private byte edad; 

    
    //Constructores
    public EquipoFutbol() {
    }

    public EquipoFutbol(int ID, String nombre, String apellido, byte edad) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //metodos get...

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public byte getEdad() {
        return edad;
    }
    
    //Metodos set...

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }  
    
    //Hay que hacer la definicion de los metodos abstractos...
    /*
    Metodos que tiene que hacer todos los metodos que hereden
    */
    
    public abstract void entrenamiento(); 
    public abstract void partido(); 
    public abstract void viajar(); 
    public String ToString(){
        String salida = ""; 
        
        if(getID() > 0 && getID() <= 5){
            
            salida =  "ENTRENADOR" + "\nID: " + getID() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido();
        } 
        else if(getID() > 5 && getID() <= 10){
            salida = "JUGADOR" + "\nID: " + getID() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido();
        }
        else if(getID() > 10){
            salida = "CUERPO TECNICO" + "\nID: " + getID() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido();
        }
        
        return salida; 
    }
    public void clear(){
        String tipo2 = ""; 
        String marca = ""; 
        String model = ""; 
        String color = ""; 
        String neumatico = ""; 
        String motor= ""; 
        String pasajeros = "";
        String anio = ""; 
    }
}
