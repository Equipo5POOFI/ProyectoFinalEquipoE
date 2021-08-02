/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministracionEscolar;

/**
 *
 * @author Propietario
 */
public class GeneradorNumerosInscripcion {
    private int indicadorEscolar; // (Promedio)(Escolaridad)(Velacidad)
    private float escolaridad;
    private float velacidad;
    private float promedio;

    public GeneradorNumerosInscripcion(int indicadorEscolar, float escolaridad, float velacidad, float promedio) {
        this.indicadorEscolar = indicadorEscolar;
        this.escolaridad = escolaridad;
        this.velacidad = velacidad;
        this.promedio = promedio;
    }

    public int getIndicadorEscolar() {
        return indicadorEscolar;
    }

    public void setIndicadorEscolar(int indicadorEscolar) {
        this.indicadorEscolar = indicadorEscolar;
    }

    public float getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(float escolaridad) {
        this.escolaridad = escolaridad;
    }

    public float getVelacidad() {
        return velacidad;
    }

    public void setVelacidad(float velacidad) {
        this.velacidad = velacidad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
    
    
    
    
}
