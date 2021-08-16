/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Propietario
 */


public class CrudAlumno {
    
    
    
    
    public static void main(String[] args) throws IOException {
        Alumno alu = new Alumno();
        AdmnistracionEscolar ad = new AdmnistracionEscolar();
        
        int op;
        int contrasena;
        
        KeyboardInput in = new KeyboardInput();
        
        alu.traerDatos();
        ad.archivoAlumnos(alu.registrosAlumnos);
        
        
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
            switch (op) {
                case 1:
                    System.out.println("Consulta tus datos con tu nombre");
                    alu.consultar();
                    
                    break;
                case 2:
                    // Se podran consultar los datos utilizando el nombre de usuario
                    System.out.println("Ingresa contraseña de administrador: ");
                    contrasena = in.readInteger();
                    
                    while (true) {
                        switch (contrasena) {
                            case 1234:
                                alu.CRUD();
                                ad.archivoAlumnos(alu.registrosAlumnos);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Contrasena incorrecta. Intentelo de nuevo\nIngrese 4 para salir");
                                break;
                        }
                    }
                case 3:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    System.out.println("Opción incorrecta !!!!\n Intentelo de nuevo");
                    break;
            }
        }
        
        
        
    }
    
    
}
