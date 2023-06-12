package POO;

public class PickUp extends Coche{
     
    String traccion; 
    String TamanoBatea; 

    public PickUp(String traccion, String TamanoBatea, String marca, String modelo, String color, String neumatico, String motor, String pasajeros, String anio) {
        super(marca, modelo, color, neumatico, motor, pasajeros, anio);
        this.traccion = traccion;
        this.TamanoBatea = TamanoBatea;
    }

    public String getTraccion() {
        return traccion;
    }

    public String getTamanoBatea() {
        return TamanoBatea;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setTamanoBatea(String TamanoBatea) {
        this.TamanoBatea = TamanoBatea;
    }
}
