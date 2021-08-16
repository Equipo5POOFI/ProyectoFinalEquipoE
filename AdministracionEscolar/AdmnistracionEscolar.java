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

    public void menu() {

        
        int op;
        String contrasena;
        while (true) {
            System.out.println("\t\tAdministracosn Escolar\t\t");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------");
            System.out.println(
                    "|\t1. Consultar informacion de estudiante\t||\t2.Ingresar para realizar modificaciones\t|");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------");
            System.out.println("Ingrese una opción o ingrese 3 para salir: ");
            op = in.readInteger();
            if (op == 1) {
                System.out.println("Consulta tus datos con tu nombre: ");
                consultar();
            } else if (op == 2) {
                // Se podran consultar los datos utilizando el nombre de usuario
                System.out.println("Ingresa contraseña de administrador: ");
                contrasena = in.readString();
                if (contrasena == "admin")
                    CRUD();
                else
                    System.out.println("Contrasena incorrecta. Intentelo de nuevo");
            } else if (op == 3) {
                System.out.println("Gracias por utilizar el sistema");
                break;
            } else {
                System.out.println("Opción incorrecta !!!!\n Intentelo de nuevo");
            }
        }
    }

    public void CRUD() {
         // metodo para poder hacer cambios
        String name;
        System.out.println("Ingresar nombre del alumno a modificar con el formato:\n Nombre Apellido Apellido");
        name = in.readString();
       
    }

    public void consultar() {
        // metodo para consultar los datos de un alumno en específico
        String name;
        System.out.println("Ingresa tu nombre con el formato:\n Nombre Apellido Apellido");
        name = in.readString();
        
    }
    
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
