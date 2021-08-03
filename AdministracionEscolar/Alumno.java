package AdministracionEscolar;

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
public class Alumno {
    protected String[] nombreCompleto = new String[50];
    protected int[] edades = new int[50];
    protected int[] semestres = new int[50];
    protected int[][] asiganturasCreditos = new int[50][2];
    protected int numeroInscripcion;
    protected String arrDatos[] = { "Hola" };

    // Alumno. Edad, Semestre, NumeroAsignaturas, NumeroInscripción
    protected Map<String, String[]> registrosAlumnos = new HashMap<String, String[]>();

    String[][] datosAlumnos = new String[50][5];

}
