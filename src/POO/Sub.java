package POO;

public class Sub extends Coche{
    boolean blindada; 

    public Sub(boolean blindada, String marca, String modelo, String color, String neumatico, String motor, String pasajeros, String anio) {
        super(marca, modelo, color, neumatico, motor, pasajeros, anio);
        this.blindada = blindada;
    }
}
