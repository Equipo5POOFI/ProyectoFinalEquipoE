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
public class AdmnistracionEscolar {
    protected String[] nombreCompleto = new String[50];
    protected int[] edades = new int[50];
    protected int[] semestres = new int[50];
    protected int[][] asiganturasCreditos = new int[50][2];
    protected int [] numeroInscripcion = new int[50];
    
    public void menu(){
        
        KeyboardInput in = new KeyboardInput();
        int op;
        String name;
            while(true){
                System.out.println("\t\tAdministracosn Escolar\t\t");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("|\t1. Consultar informacion de estudiante\t||\t2.Ingresar para realizar modificaciones\t|");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("Ingrese una opción o ingrese 3 para salir: ");
                op = in.readInteger();
                if (op == 1){
                    System.out.println("Consulta tus datos con tu nombre: ");
                }else if (op == 2){
                    //Se podran consultar los datos utilizando el nombre de usuario
                    System.out.println("Ingresa contraseña de administrador: ");
                    name = in.readString();
                }else if (op == 3){
                    System.out.println("Gracias por utilizar el sistema");
                    break;           
                }else{
                    System.out.println("Opción incorrecta !!!!\n Intentelo de nuevo");
                }
            }
        }
    
    public void CRUD(){
        //metodo para poder hacer cambios 
    }
    
    public void consultar(){
        //metodo para consultar los datos de un alumno en específico
    }
}
