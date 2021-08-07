package proyecto;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.S
 */

/**
 *
 * @author Propietario
 */
public class Alumno extends AdmnistracionEscolar {
    
    // Alumno. Edad, Semestre, NumeroAsignaturas, NumeroInscripción
    protected Map<String, String[]> registrosAlumnos = new HashMap<String, String[]>();
    protected String [] datosAlumnos = new String[50];

    public Alumno() {
        generadorDeNombres pr1 = new generadorDeNombres();
        GeneradorDatosPersonales pr = new GeneradorDatosPersonales();
        RegistrosAcademicos reg = new RegistrosAcademicos();
        this.nombreCompleto= pr1.generarNombre(pr1.nombres, pr1.apellidos);
        this.edades= pr.generarEdades();
        this.semestres= pr.generarSemestre();    
        this.asiganturasCreditos = reg.generarAsignaturas(this.semestres);
    }
    
    protected String [] traerDatos(String[] nombreCompleto, int[] edades, int[] semestres, int [] numeroInscripcion ){
        
        
        
        return datosAlumnos;
    }
    
    public void PruebaAlumno(){
               
        System.out.println("Nombres: ");
        for (int i = 0; i < this.nombreCompleto.length; i++) {
            System.out.println(i+": " +this.nombreCompleto[i]);
        }
        
        System.out.println("Edades: ");
        for (int i = 0; i < this.edades.length; i++) {
            System.out.println(i+": " +this.edades[i]);            
        }
        
        System.out.println("Semestres: ");
        for (int i = 0; i < this.semestres.length; i++) {
            System.out.println(i+": " +this.semestres[i]);
        }
        
       System.out.println("Asignaturas y Creditos por semestre: ");
        for (int i = 0; i < this.asiganturasCreditos.length; i++) {
            for (int j = 0; j <this.asiganturasCreditos[i].length; j++) {
                System.out.print(this.asiganturasCreditos[i][j]+"\t");
            }
            System.out.println("\nSemestre: " +this.semestres[i]);
        } 
    }
    
    
    
    
}
