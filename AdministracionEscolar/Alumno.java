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
        boolean bandera = true;
        int indiceAcambiar=-1;
        while(bandera == true){
            System.out.println("Ingresar nombre del alumno a modificar con el formato:\n Nombre (s) Apellido Apellido");
            name = sc.nextLine();
            
            for (int i = 0; i < nombreCompleto.length; i++) {
                if (name.equals(nombreCompleto[i])){
                    indiceAcambiar  = i;
                    bandera = false;
                    break;
                }else if(i == 49){
                    System.out.println("No se encontró el alumno");
                }
            }
        }
        KeyboardInput in = new KeyboardInput();
        int op;
        System.out.println("Que dato desea cambiar\n1.Edad || 2.Semestres || 3.Dirección \n4.Salir");
        op = in.readInteger();
        int cambio = 0;
        String cambioDir = "";
        switch (op) {
                case 1:
                    while(true){
                        System.out.println("Ingrese la nueva edad: ");
                        cambio = in.readInteger();
                        if (cambio > 18 && cambio < 30){
                            this.edades[indiceAcambiar] = cambio;
                            break;
                        }else
                            System.out.println("Edad no valida. Intentelo de nuevo");
                    }
                    traerDatos( );
                break;
                case 2:
                    cambio = 0;
                    //boolean bandera = true;
                    while(true){
                        System.out.println("Ingrese el nuevo semestre: ");
                        cambio = in.readInteger();
                        if (cambio > 1 && cambio < 11){
                            this.semestres[indiceAcambiar] = cambio;
                            break;
                        }else
                            System.out.println("Semestre no valido. Intentelo de nuevo");
                    }
                    traerDatos( );
                break;    
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
        //System.out.println(name + " "+nombreCompleto[0]+""+datosAlumnos[0]);
        for (int i = 0; i < nombreCompleto.length; i++) {
            if(name.equals(nombreCompleto[i])){
                System.out.println("Edad: "+ this.edades[i] + "\nSemestre: " + this.semestres[i] + "\nNumero de inscripción: " + this.numeroInscripcion[i] + "\nDirección: "
                    + this.direcciones[i]+ "\nMeterias: "+materias[i]+ "\nCalificaciones: "+calificaciones[i]);
                break;
            }else if (i == 49)
                System.out.println("No se encontro el alumno");
        
        }
    }
}
