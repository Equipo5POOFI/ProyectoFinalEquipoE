package proyecto;

import java.io.IOException;
import java.util.Scanner;

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
    protected String[][] registrosAlumnos = new String[50][2];
    protected String[] datosAlumnos = new String[50];

    public Alumno() throws IOException {
        generadorDeNombres pr1 = new generadorDeNombres();// cambiar nombre del objeto
        GeneradorDatosPersonales pr = new GeneradorDatosPersonales();// cambiar nombre del objeto
        RegistrosAcademicos reg = new RegistrosAcademicos();
        GeneradorNumerosInscripcion NumInscripcion = new GeneradorNumerosInscripcion();
        this.nombreCompleto = pr1.generarNombre(pr1.nombres, pr1.apellidos);
        this.edades = pr.generarEdades();
        this.semestres = pr.generarSemestre();
        this.asiganturasCreditos = reg.generarAsignaturas(this.semestres);
        this.promedios = reg.generarPromedio();
        this.direcciones = pr.generarDirecciones();
        this.numeroInscripcion = NumInscripcion.generarNumero(reg.totalMateriasReprobadas, this.asiganturasCreditos,
                this.promedios, reg.creditosDescontar);
        this.materias=reg.generarMaterias();
        this.calificaciones=reg.getCalificaciones();

    }

    protected String[][] traerDatos( ) {
        for (int i = 0; i < this.datosAlumnos.length; i++) {
            this.datosAlumnos[i] = this.edades[i] + ", " + this.semestres[i] + ", " + this.numeroInscripcion[i] + ", "
                    + this.direcciones[i]+ "\n ,Meterias,"+materias[i]+ "\n ,Calificaciones,"+calificaciones[i];
            for (int j = 0; j < registrosAlumnos[i].length; j++) {
                if (j == 0)
                    this.registrosAlumnos[i][j] = nombreCompleto[i];
                else if (j == 1)
                    this.registrosAlumnos[i][j] = datosAlumnos[i];
            }
        }
        return registrosAlumnos;
    }
    
    public void CRUD(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nombre del alumno a modificar con el formato:\n Nombre (s) Apellido Apellido");
        name = sc.nextLine();
        KeyboardInput in = new KeyboardInput();
        int op;
        op = in.readInteger();
        
        int indiceAcambiar=-1;
        for (int i = 0; i < nombreCompleto.length; i++) {
            if (name == nombreCompleto[i])
                indiceAcambiar  = i;
        }
        
        System.out.println("Que dato desea cambiar\n1.Edad || 2.Semestres || 3.Dirección \n4.Salir");
        op = in.readInteger();
        int cambio = 0;
        String cambioDir = "";
        switch (op) {
                case 1:
                    
                    System.out.println("Ingrese la nueva edad: ");
                    cambio = in.readInteger();
                    while(true){
                        if (cambio > 18 || cambio < 30){
                            this.edades[indiceAcambiar] = cambio;
                            break;
                        }else
                            System.out.println("Edad no valida. Intentelo de nuevo");
                    }
                    traerDatos( );
                
                case 2:
                    cambio = 0;
                    System.out.println("Ingrese el nuevo semestre: ");
                    cambioDir = sc.nextLine();
                    while(true){
                        if (cambio > 1 || cambio < 11){
                            this.semestres[indiceAcambiar] = cambio;
                            break;
                        }else
                            System.out.println("Semestre no valida. Intentelo de nuevo");
                    }
                    traerDatos( );
                    
                case 3:
                    System.out.println("Ingrese la nueva dirección: \nCon el formato Calle #número Colonia Alcaldia/Municipio Estado");
                    cambioDir = sc.nextLine();
                    this.direcciones[indiceAcambiar]= cambioDir;
                    traerDatos( );
                    break;
                
                case 4:
                    System.out.println("Salir");
                    break;
                
                default:
                    System.out.println("Opción incorrecta. Intentelo de nuevo\nIngrese 4 para salir");
        }
    }

    protected void consultar() {
        // metodo para consultar los datos de un alumno en específico
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar tu nombre con el formato:\n Nombre (s) Apellido Apellido");
        name = sc.nextLine();
        
        for (int i = 0; i < nombreCompleto.length; i++) {
            if (name == nombreCompleto[i]){
                System.out.println( datosAlumnos[i]);
                break;
                        }
        
        }
    }
}
