//Archivo creado el 25 de mayo del 2023...
/*Aqui tenemos el objeto que recopilara toda la informacion del Jframe de la encuesta...*/
package POO;

/**
 *
 * @author ricardomedina
 */
public class Encuestado {
    String genero; 
    String ultimoGrado; 
    String namEscuela; 
    String estadoCivil;
    String nacionalidad; 
    String estadoMigratorio; 
    String Intereses; 
    String Email; 
    
    public Encuestado(){
        //Constructor vacio por si acaso... 
    }
    public Encuestado(String genero, String ultimoGrado, String namEscuela, 
            String estadoCivil, String nacionalidad, String estadoMigratorio, 
            String Intereses, String Email){
        
        
        this.genero = genero; 
        this.ultimoGrado = ultimoGrado;
        this.namEscuela = namEscuela; 
        this.estadoCivil = estadoCivil; 
        this.nacionalidad = nacionalidad; 
        this.estadoMigratorio = estadoMigratorio; 
        this.Intereses = Intereses; 
        this.Email = Email; 
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUltimoGrado() {
        return ultimoGrado;
    }

    public void setUltimoGrado(String ultimoGrado) {
        this.ultimoGrado = ultimoGrado;
    }

    public String getNamEscuela() {
        return namEscuela;
    }

    public void setNamEscuela(String namEscuela) {
        this.namEscuela = namEscuela;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoMigratorio() {
        return estadoMigratorio;
    }

    public void setEstadoMigratorio(String estadoMigratorio) {
        this.estadoMigratorio = estadoMigratorio;
    }

    public String getIntereses() {
        return Intereses;
    }

    public void setIntereses(String Intereses) {
        this.Intereses = Intereses;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    @Override
    public String toString() {
        return "\nCorreo electronico: " + Email;
    }  
    
    /*public String Acomodo(){
        return l;
    }*/
}
