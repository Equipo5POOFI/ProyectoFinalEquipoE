package proyecto;

import java.io.IOException;

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
            //System.out.print(this.registrosAlumnos[i][0] + "\t" + this.registrosAlumnos[i][1]);// borrar
            //System.out.println("");
        }
        return registrosAlumnos;
    }
}
