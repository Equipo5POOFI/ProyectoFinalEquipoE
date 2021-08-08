/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Propietario
 */
public class GeneradorNumerosInscripcion extends RegistrosAcademicos {
    private int indicadorEscolar; // (Promedio)(Escolaridad)(Velacidad)
    private float escolaridad;
    private float velacidad;
    private float promedio;
    
    protected int [] numerosInscripcion = new int[50];
    
    public int [] generarNumero(){
        return numerosInscripcion;
    }
    

}
