/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoParcial;

/**
 *
 * @author ricardomedina
 */
public class encuesta2 {
    String genero; 
    String estadoCivil;
    String nacionalidad;
    String lenguajesP;
    String idiomas; 

    public encuesta2() {
    }

    public encuesta2(String genero, String estadoCivil, String nacionalidad, String lenguajesP, String idiomas) {
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
        this.lenguajesP = lenguajesP;
        this.idiomas = idiomas;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getLenguajesP() {
        return lenguajesP;
    }

    public void setLenguajesP(String lenguajesP) {
        this.lenguajesP = lenguajesP;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
}
