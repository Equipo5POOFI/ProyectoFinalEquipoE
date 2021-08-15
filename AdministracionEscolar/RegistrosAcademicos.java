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
    private final int[] totalAsignaturasPromedio = new int[50];

    protected int[] totalMateriasReprobadas = new int[50];
    protected int[] creditosDescontar = new int[50];
    protected String [] materiasAlumno = new String[50];
    protected String [] calificaciones = new String[50];
    // Se comienza a contar desde indice 0, para coinidir con numero de semestrese
    // generan cantidad y creditos de asignatura asiganturasCreditos[i] =
    // [cantidad][creditos]
    private final int[] creditosPorSemestre = { -1, 46, 44, 46, 42, 42, 48, 46, 44, 40, 40 };
    private final int[] asignaturasPorSemestre = { -1, 5, 5, 6, 5, 5, 5, 6, 5, 5, 5 };
    private final int[] creditosPorAsignatura = { 8, 12, 10, 6, 10, 8, 8, 12, 6, 10, 8, 8, 8, 2, 10, 10, 8, 10, 8, 8, 8,
            8, 10, 8, 8, 8, 8, 10, 14, 8, 8, 6, 8, 8, 8, 8, 8, 6, 8, 10, 6, 14, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 };
    private final String[] materias = {"Algebra","Calculo y Geometria","Quimica","Fundamentos de Fisica","Fundamentos de Programacion","algebra Lineal", 
                                        "Calculo Integral", "Mecanica","Redaccion y exposicion de temas de ingenieria", "Estructura de datos y algoritmos I",
                                        "Probabilidad","Calculo vectorial","Ecuaciones diferenciales","Cultura y comunicacion", "Estructura de datos y algoritmos ll",
                                        "Programacion orientada a objetos","Fundamentos de estadistica","Electricidad y Magnetismo","Analisis numerico","Matematicas avanzadas",
                                        "Estructuras discretas","Estructura y programacio de computadoras","Dispositivos electronicos","Lenguajes formales y automatas",
                                        "Seniales y sistemas","Ingenieria de software","Sistemas operativos","Disenio digital moderno","Bases de datos","Circuitos electricos",
                                        "Administracion de proyectos de software","Finanzas en la ingenieria en computacion","Disenio digital VLSI","Inteligencia artificial",
                                        "Compiladores","Sistemas de comunicaciones","Introduccion a la economia","Optativas de ciencias sociales y humanidades","Microcomputadoras",
                                        "Computacion grafica e interaccion humano-computadora ","Etica Profesional","Redes de Datos Seguras","Organizacion y arquitectura de computadoras",
                                        "Fundamentos de Sistemas Embebidos","Sistemas Distribuidos","Optativa de Campo de Profundizacion","Recursos y necesidades de Mexico","Optativas","Optativas","Optativas","Optativas","Optativas"};

    public RegistrosAcademicos() {
    }

    protected int[][] generarAsignaturas(int[] semestres) {
        // Se va a rrecorreer asiganturasCreditos[50][2]
        for (int i = 0; i < this.asiganturasCreditos.length; i++) {
            this.semestre = semestres[i];
            totalAsignaturas = 0;
            totalCreditosSemestres = 0;
            for (int j = 0; j < this.asiganturasCreditos[i].length; j++) {
                if (j == 0) {
                    for (int k = 1; k <= semestre; k++) {
                        totalAsignaturas += asignaturasPorSemestre[k];
                    }
                    this.asiganturasCreditos[i][j] = totalAsignaturas;
                    this.totalAsignaturasPromedio[i] = totalAsignaturas;
                } else if (j == 1) {
                    for (int k = 1; k < semestre + 1; k++) {
                        totalCreditosSemestres += creditosPorSemestre[k];
                    }
                    this.asiganturasCreditos[i][j] = totalCreditosSemestres;
                }
            }
        }
        return this.asiganturasCreditos;

    }

    protected float[] generarPromedio() {

        for (int i = 0; i < totalAsignaturasPromedio.length; i++) {
            int[] calificaciones = new int[totalAsignaturasPromedio[i]];
            sumaCalificaciones = 0;
            totalMateriasReprobadas[i] = 0;
            this.calificaciones[i]="";
            for (int j = 0; j < totalAsignaturasPromedio[i]; j++) {
                if (totalAsignaturasPromedio[i] % 2 == 0 && totalAsignaturasPromedio[i] > 26)
                    calificaciones[j] = (int) (Math.random() * (7 - 11 + 1) + 11);
                else
                    calificaciones[j] = (int) (Math.random() * (4 - 11 + 1) + 11);
                sumaCalificaciones += calificaciones[j];
                // Cantidad de materias reprobadas
                if (calificaciones[j] == 5) {
                    totalMateriasReprobadas[i] += 1;
                    creditosDescontar[i] += creditosPorAsignatura[j];
                }
                this.calificaciones[i]+= calificaciones[j]+", ";
            }
            promedios[i] = (float) sumaCalificaciones / totalAsignaturasPromedio[i];
            
            
                    
            
        }
        return promedios;
    }
    
    protected String[] generarMaterias(){
        
        for (int i = 0; i < totalAsignaturasPromedio.length; i++) {
            materiasAlumno[i]="";
            for (int j = 0; j < totalAsignaturasPromedio[i]; j++) {
                materiasAlumno[i]+= materias[j]+", ";
            } 
        }
        return materiasAlumno;
    }
    
    protected String[] getCalificaciones(){
        return calificaciones;
    }
}
