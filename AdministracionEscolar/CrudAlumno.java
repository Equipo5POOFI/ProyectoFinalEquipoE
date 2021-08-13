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
public class CrudAlumno {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        AdmnistracionEscolar ad = new AdmnistracionEscolar();

         ad.menu();
        //alu.PruebaAlumno();
        alu.traerDatos();
        ad.archivoAlumnos(alu.registrosAlumnos);
        
        
        
    }
}
