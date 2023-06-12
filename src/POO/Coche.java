/*
Esta va a ser la super clase de la cual se van a heredar caracteristicas a otros 
coches más especificos... 
codigo iniciado el 9 de marzo || clase (Programacion visual)
*/
package POO;


public class Coche {
    //definicion de variables a usar... 
    private String marca; 
    private String modelo; 
    private String color; 
    private String neumatico; 
    private String motor; 
    private String pasajeros; 
    private String anio; 

    public Coche(){
        
    }
    public Coche(String marca, String modelo, String color, String neumatico, String motor, String pasajeros, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.neumatico = neumatico;
        this.motor = motor;
        this.pasajeros = pasajeros;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getNeumatico() {
        return neumatico;
    }

    public String getMotor() {
        return motor;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public String getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNeumatico(String neumatico) {
        this.neumatico = neumatico;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}
