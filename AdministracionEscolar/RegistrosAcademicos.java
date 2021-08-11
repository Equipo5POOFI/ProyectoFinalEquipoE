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
    
    private int semestre, totalAsignaturas, totalCreditosSemestres, sumaCalificaciones;
    private float promedio;
    private int [] totalAsignaturasPromedio= new int [50];
    
    protected int [] totalMateriasReprobadas= new int [50];
    
    
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
            for (int j = 0; j < this.asiganturasCreditos[i].length; j++) {
                if (j == 0){
                    for (int k = 1; k <= semestre; k++){
                        totalAsignaturas += asignaturasPorSemestre[k];
                    }                        
                    this.asiganturasCreditos[i][j] = totalAsignaturas;
                    this.totalAsignaturasPromedio[i] = totalAsignaturas;
                }else if (j == 1){
                    for (int k = 1; k<semestre+1; k++){
                        totalCreditosSemestres += creditosPorSemestre[k];
                        }
                        this.asiganturasCreditos[i][j] = totalCreditosSemestres;
                        } 
            }
            
            
        }
        
        return this.asiganturasCreditos;
    
    }
    
    protected float[] generarPromedio(){
        for (int i = 0; i < totalAsignaturasPromedio.length; i++) {
            int [] calificaciones = new int[totalAsignaturasPromedio[i]];
            sumaCalificaciones = 0;
            totalMateriasReprobadas[i] = 0;
            for (int j = 0; j < totalAsignaturasPromedio[i]; j++) {
                if (totalAsignaturasPromedio[i] % 2 == 0 && totalAsignaturasPromedio[i] > 26)
                    calificaciones[j] = (int) (Math.random() * (7 - 11 + 1) + 11);
                else
                    calificaciones[j] = (int) (Math.random() * (4 - 11 + 1) + 11);
                sumaCalificaciones += calificaciones[j];
                
                //Cantidad de materias reprobadas
                if(calificaciones[j] == 5)
                    totalMateriasReprobadas[i] += 1;
            }
            promedios[i] = (float) sumaCalificaciones/totalAsignaturasPromedio[i];
        }
        return promedios;
    }
}
    
