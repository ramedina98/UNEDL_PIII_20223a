package POLIMORFISMO;

public class Entrenador extends EquipoFutbol{

    private int idFMF; 
    
    //Constructor vacio...
    public Entrenador(){
        
    }

    //Constructor sobre cargado, con todas las variables de su clase padre...
    public Entrenador(int idFMF, int ID, String nombre, String apellido, byte edad) {
        //Estas variables como no estan definidas en esta clase, se mandan a la super clase de la cual
        //provienen, y recaen el constructor de la super clase (la clase padre "Equipo de futbol")
        super(ID, nombre, apellido, edad);
        this.idFMF = idFMF;
    }

    public int getIdFMF() {
        return idFMF;
    }

    public void setIdFMF(int idFMF) {
        this.idFMF = idFMF;
    }
    
    @Override
    public void entrenamiento() {
        System.out.println(getNombre() + " " + getApellido()  + " esta pleaneando el juego.");
    }

    @Override
    public void partido() {
        System.out.println(getNombre() + " " + getApellido()  + " dirige el juego 4-4-2.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " " + getApellido()  + " viaje con el equipo a pachuca."); 
    }
    
}
