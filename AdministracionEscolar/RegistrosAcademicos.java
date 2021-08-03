package AdministracionEscolar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class RegistrosAcademicos extends Alumno {
    
    private int semestre;
    
    // Se comienza a contar desde indice 0, para coinidir connumro de semestrese generan cantidad y creditos de asignatura asiganturasCreditos[i] = [cantidad][creditos]
    private int[][] creditosSemestre = { { -1, 5, 5, 6, 5, 5, 5, 6, 5, 5, 5 }, { -1, 46, 44, 46, 42, 42, 48, 46, 44, 40, 40 } };
    
    
    protected int [][] generarAsignaturas() {
        //Se va a rrecorreer asiganturasCreditos[50][2]
        for (int i = 0; i < asiganturasCreditos.length; i++) {
            for (int j = 0; j < asiganturasCreditos[i].length; j++) {
                semestre = semestres[i];
                asiganturasCreditos[i][j]=creditosSemestre[semestre][semestre];
            }
        }
        for (int i = 0; i < asiganturasCreditos.length; i++) {
            System.out.println(asiganturasCreditos.length);
            System.out.println(asiganturasCreditos[i].length);
            //For para imprimir 
            /*for (int j = 0; j < asiganturasCreditos[i].length; j++) {
                System.out.println(asiganturasCreditos[i][j]);
                if (j!=asiganturasCreditos[i].length-1){
                    System.out.print("\n");
                }
            }*/
        }
        return creditosSemestre;
    
    }
}
    
