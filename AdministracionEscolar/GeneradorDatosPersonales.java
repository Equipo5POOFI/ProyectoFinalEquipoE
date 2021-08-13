package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Edad es aleatoria, de edades de entre 18 – 27. Un alumno de 5to semestre no puede 
tener 18. La dirección debe leerse de un archivo de texto con 500 direcciones.
*/

/**
 *
 * @author Propietario
 */
public class GeneradorDatosPersonales extends AdmnistracionEscolar {

    private int edadAleatoria, semestreAleatorio;

    protected int[] generarEdades() {
        for (int i = 0; i < this.edades.length; i++) {
            edadAleatoria = (int) (Math.random() * (17 - 28 + 1) + 28);
            edades[i] = edadAleatoria;
        }
        return edades;
    }

    protected int[] generarSemestre() {
        for (int i = 0; i < this.semestres.length; i++) {
            if (edades[i] == 18) {
                semestreAleatorio = (int) (Math.random() * (0 - 5 + 1) + 5);
                semestres[i] = semestreAleatorio;
            } else if (edades[i] > 18) {
                semestreAleatorio = (int) (Math.random() * (6 - 11 + 1) + 11);
                semestres[i] = semestreAleatorio;
            }
        }
        return semestres;
    }

    // metodo para generar direcciones
    protected String[] generarDirecciones() {

        return direcciones;
    }

}
