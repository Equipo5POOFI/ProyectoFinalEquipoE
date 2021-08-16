/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Propietario
 */
public class AdmnistracionEscolar {
    protected String[] nombreCompleto = new String[50];// Almacena los nombres de los alumnos
    protected int[] edades = new int[50];// Almacena las edades de los alumnos
    protected int[] semestres = new int[50];// Almacena los semestres de los alumnos
    protected int[][] asiganturasCreditos = new int[50][2];// Almacena el numero de asignaturas y creditos del alumno
    protected int[] numeroInscripcion = new int[50];// Almacena los numeros de inscripción
    protected float[] promedios = new float[50];
    protected String[] direcciones = new String[50];
    protected String[] materias = new String[50];
    protected String[] calificaciones = new String[50];
    
    KeyboardInput in = new KeyboardInput();
    
    
    
  
    
    public void archivoAlumnos(String[][] registrosAlumnos){
        
        String texto = "Nombre, Edad, Semestre, NumeroInscripcion, Direccion"+"\n";
        for (int i = 0; i < registrosAlumnos.length; i++) {
            texto += registrosAlumnos[i][0] + ", " + registrosAlumnos[i][1]+"\n";
        }
        
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("datosProyectoFinal.csv");//Se crea un archivo
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.close();
        }catch(IOException ioe){
            System.out.println("\n\nError al abrir o guardar el archivo: ");
            ioe.printStackTrace();
        }catch(Exception e){
            System.out.println("\n\nError al leer de teclado: ");
            e.printStackTrace();
        }
    }
}
