package POO;

//colocamos extends para heredarle metodos de Gente
public class Persona extends Gente{
    
    String personalidad; 

    public Persona(String personalidad, String nombre, byte edad) {
        super(nombre, edad); //Los heredo de la super clase (super clase gente)
        this.personalidad = personalidad; // Propiedad local...
    }
    
    public void caminar(){
        System.out.println("Voy a caminar yo... " + nombre);
    }
}
