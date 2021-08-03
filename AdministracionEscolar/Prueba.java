/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministracionEscolar;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Propietario
 */
public class Prueba {
    public static void main(String[] args) {

        generadorDeNombres prueba = new generadorDeNombres();
        prueba.generarNombre(prueba.nombres, prueba.apellidos);

        String nombres[] = { "Hola", "Meter" };

        String Cadenas = nombres[0] + " " + nombres[1];

        Map<String, String> datosAlumnos = new HashMap<String, String>();
        datosAlumnos.put("Esteban", Cadenas);

        System.out.println(datosAlumnos);

        GeneradorDatosPersonales pru = new GeneradorDatosPersonales();
       System.out.println("Edades: \n");
        pru.generarEdades();
        System.out.println("\nSemestres: \n");
        pru.generarSemestre();

        //Obtner el cogigo ascci de un caracter para poder combertir de entero a
        //caracter
        int pr = '5';
        System.out.println(pr);

        int prASCII = 53;
        char convertido = (char) prASCII;
        System.out.println(convertido);
        
       RegistrosAcademicos reg = new RegistrosAcademicos();
       reg.generarAsignaturas();

    }

}
