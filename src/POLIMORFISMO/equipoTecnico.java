package POLIMORFISMO;

public class equipoTecnico extends EquipoFutbol{
    
    String roll; 

    public equipoTecnico() {
    }

    public equipoTecnico(String roll, int ID, String nombre, String apellido, byte edad) {
        super(ID, nombre, apellido, edad);
        this.roll = roll;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
    
    
    @Override
    public void entrenamiento() {
        System.out.println("El " + getRoll() + " " + getNombre() + " " + getApellido() + " esta apoyando al entrenador");
    }

    @Override
    public void partido() {
        System.out.println("El " + getRoll() + " se hace we, ponte al tiro " + getNombre());
    }

    @Override
    public void viajar() {
        System.out.println("El " + getRoll() + " tiene los boletos");
    }
    
}
