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

public class GeneradorNumerosInscripcion extends AdmnistracionEscolar {
    private int indicadorEscolar; // (Promedio)(Escolaridad)(Velacidad)
    private float escolaridad; // (Asignatura aprobadas en ordinario/Asignaturas inscritas en ordinario)*100
    private float velocidad; // (Creditos del alumno/Creditos desde el ingreso)*100
    private float promedio;
    private int asignaturasAprobadas, creditosAlumno;

    public int[] generarNumero(int[] totalReprobadas, int[][] asignaturas_y_creditos, float[] promedio, int[] creditosDescontar) {
        for (int i = 0; i < 50; i++) {
            this.escolaridad = generarEscolaridad(totalReprobadas, asignaturas_y_creditos);
            this.velocidad = generarVelacidad(creditosDescontar, asignaturas_y_creditos);

            this.promedio = promedio[i];
            indicadorEscolar = (int) (this.promedio * this.escolaridad * this.velocidad);
            numeroInscripcion[i] = indicadorEscolar;
        }

        return numeroInscripcion;
    }

    /*
     * (Asignatura aprobadas en ordinario/Asignaturas inscritas en ordinario)*100
     * restarle el total de asignatiuras reprobadas a el total de asignaturas, traer
     * de arreglo totalMateriasReprobadas
     */
    private float generarEscolaridad(int[] totalReprobadas, int[][] asignaturas_y_creditos) {
        for (int i = 0; i < asignaturas_y_creditos.length; i++) {
            asignaturasAprobadas = asignaturas_y_creditos[i][0] - totalReprobadas[i];
            escolaridad = (float) ((float) asignaturasAprobadas / (float) asignaturas_y_creditos[i][0]) * 100;
        }
        return escolaridad;
    }

    /*
     * (Creditos del alumno/Creditos desde el ingreso)*100 total de creditos -
     * cantidad de asignaturas reprobadas *(8)
     */
    private float generarVelacidad(int[] creditosDescontar, int[][] asignaturas_y_creditos) {
        for (int i = 0; i < 50; i++) {
            creditosAlumno = (asignaturas_y_creditos[i][1]) - (creditosDescontar[i]);
            velocidad = (float) (((float) creditosAlumno / (float) asignaturas_y_creditos[i][1]) * 100);
        }
        return velocidad;
    }

}