package POO;

public class Sedan extends Coche{
    
    String tipo2; 
    
    public Sedan(){
        
    }
    public Sedan(String tipo2, String marca, String modelo, String color, String neumatico, String motor, String pasajeros, String anio) {
        super(marca, modelo, color, neumatico, motor, pasajeros, anio);
        this.tipo2 = tipo2;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
    
    
    //Metodo para retornar lo que querio ver de l array de objetos...
    public String ToString(){
        return "tipo:\t" + getTipo2() + "\nMarca:\t"+getMarca()+"\nModelo:\t"+getModelo() + "\nColor:\t" + getColor() + "\nMotor:\t" + getMotor() + "\nAño:\t" + getAnio(); 
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
