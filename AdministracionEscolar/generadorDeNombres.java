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
public class generadorDeNombres extends Alumno {

    private int numeroAleatorio, numeroAleatorio2;
    public String nombres[] = { "Manuel", "Antonio", "José", "William", "George", "Joseph", "Thomas", "Carlos", "Frank",
            "Edward,Walter", "Damián", "Martín", "Samuel", "Santiago", "Sebastián", "Alejandro", "Jack", "Donald",
            "Albert", "Paul", "Daniel", "David", "Roy", "Hector", "Alejandra", "Elizabeth", "María", "Lucía",
            "Guadalupe", "Adriana", "Verónica", "Isabel", "Erika", "Daniela", "Mónica", "Carmen", "Carolina",
            "Patricia", "Pilar", "Rosario", "Juana", "Isabel", "Antonia", "Dolores", "Luisa", "Gabriela", "Sofía",
            "Andrea", "Rosario" };

    public String apellidos[] = { "González", "Rodríguez", "Gómez", "Fernández", "López", "Díaz", "Díaz", "Pérez",
            "García", "Sánchez", "Romero", "Sosa", "Álvarez", "Torres", "Ruiz", "Ramírez", "Flores", "Acosta",
            "Benítez", "Medina", "Suárez", "Herrera", "Aguirre", "Pereyra", "Gutiérrez", "Giménez", "Molina", "Silva",
            "Castro", "Rojas", "Ortíz", "Núñez", "Luna", "Juárez", "Cabrera", "Ríos", "Ferreyra", "Huchín", "Morales",
            "Domínguez", "Moreno", "Peralta", "Vega", "Carrizo", "Hernández", "Quiroga", "Castillo", "Ledesma",
            "Ledesma", "Ojeda" };

    public generadorDeNombres() {
    }

    public String[] getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String[] nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String[] generarNombre(String nombres[], String apellidos[]) {
        for (int i = 0; i < this.nombreCompleto.length; i++) {
            numeroAleatorio = (int) (Math.random() * 49);
            numeroAleatorio2 = (int) (Math.random() * 49);
            System.out.println(numeroAleatorio + " " + numeroAleatorio2);
            if (0 == numeroAleatorio % 2 && numeroAleatorio <= 20) {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.nombres[numeroAleatorio2] + " "
                        + this.apellidos[numeroAleatorio] + " " + this.apellidos[numeroAleatorio2];
            } else {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.apellidos[numeroAleatorio] + " "
                        + this.apellidos[numeroAleatorio2];
            }
        }
        for (int i = 0; i < this.nombreCompleto.length; i++) {
            System.out.println(nombreCompleto[i]);
        }
        return nombreCompleto;

    }

}
