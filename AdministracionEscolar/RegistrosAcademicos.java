package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class RegistrosAcademicos extends AdmnistracionEscolar {
    
    private int semestre, totalAsignaturas, totalCreditosSemestres;
    
    // Se comienza a contar desde indice 0, para coinidir con numero de semestrese generan cantidad y creditos de asignatura asiganturasCreditos[i] = [cantidad][creditos]
    private final int[] creditosPorSemestre = { -1, 46, 44, 46, 42, 42, 48, 46, 44, 40, 40 } ;
    private final int [] asignaturasPorSemestre = { -1, 5, 5, 6, 5, 5, 5, 6, 5, 5, 5 };
    public RegistrosAcademicos() {
    }
    
    
    
    protected int [][] generarAsignaturas(int [] semestres) {
        //Se va a rrecorreer asiganturasCreditos[50][2]
        for (int i = 0; i < this.asiganturasCreditos.length; i++) {
            this.semestre = semestres[i];
            totalAsignaturas = 0;
            totalCreditosSemestres = 0;
            for (int j = 0; j < 2; j++) {
                if (j == 0){
                    for (int k = 1; k<semestre+1; k++){
                        totalAsignaturas += asignaturasPorSemestre[k];
                    }                        
                    this.asiganturasCreditos[i][j] = totalAsignaturas;
                }else if (j==1){
                        for (int k = 1; k<semestre+1; k++){
                        totalCreditosSemestres += creditosPorSemestre[k];
                    }
                    this.asiganturasCreditos[i][j] = totalCreditosSemestres;
                        }
                     
            }
        }
        
        return this.asiganturasCreditos;
    
    }
}
    
