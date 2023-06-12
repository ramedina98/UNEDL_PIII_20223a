
/*
esta es la clase futbolista...
*/

package POLIMORFISMO;

public class Futbolista extends EquipoFutbol{
    
    private int numDorsal; 
    private String ciudadOrigen; 

    public Futbolista() {
    }

    public Futbolista(int numDorsal, String ciudadOrigen, int ID, String nombre, String apellido, byte edad) {
        super(ID, nombre, apellido, edad);
        this.numDorsal = numDorsal;
        this.ciudadOrigen = ciudadOrigen;
    }   

    public int getNumDorsal() {
        return numDorsal;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setNumDorsal(int numDorsal) {
        this.numDorsal = numDorsal;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
   
    
    @Override
    public void entrenamiento() {
        System.out.println(getNombre() + " " + getApellido()  + " Echale ganas carajo");
    }

    @Override
    public void partido() {
        System.out.println(getNombre() + " " + getApellido()  + " Hay que jugar al puro toque");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " " + getApellido()  + " Nada de fiestas, hay que estar concentrados"); 
    }
}
