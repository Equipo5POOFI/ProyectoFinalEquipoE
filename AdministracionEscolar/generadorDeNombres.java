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
public class generadorDeNombres extends AdmnistracionEscolar {

    private int numeroAleatorio, numeroAleatorio2;
    public String nombres[] = { "Manuel", "Antonio", "Jose", "William", "George", "Joseph", "Thomas", "Carlos", "Frank",
            "Esteban", "Walter", "Damian", "Martin", "Samuel", "Santiago", "Sebastián", "Alejandro", "Jack", "Donald",
            "Albert", "Paul", "Daniel", "David", "Roy", "Hector", "Alejandra", "Elizabeth", "Maria", "Lucia",
            "Guadalupe", "Adriana", "Veronica", "Isabel", "Erika", "Daniela", "Monica", "Carmen", "Carolina",
            "Patricia", "Pilar", "Rosario", "Juana", "Isabel", "Antonia", "Dolores", "Luisa", "Gabriela", "Sofía",
            "Andrea", "Rosario" };

    public String apellidos[] = { "Gonzalez", "Rodriguez", "Gomez", "Fernandez", "Lopez", "Diaz", "Alcantara", "Perez",
            "Garcia", "Sanchez", "Romero", "Sosa", "Alvarez", "Torres", "Ruiz", "Ramirez", "Flores", "Acosta",
            "Benitez", "Medina", "Suarez", "Herrera", "Aguirre", "Pereyra", "Gutierrez", "Gimenez", "Molina", "Silva",
            "Castro", "Rojas", "Ortiz", "Nuez", "Luna", "Juarez", "Cabrera", "Rios", "Ferreyra", "Huchin", "Morales",
            "Dominguez", "Moreno", "Peralta", "Vega", "Carrizo", "Hernández", "Quiroga", "Castillo", "Jasso",
            "Ledesma", "Ojeda" };

    public generadorDeNombres() {
    }

    public String[] generarNombre(String nombres[], String apellidos[]) {
        for (int i = 0; i < this.nombreCompleto.length; i++) {
            numeroAleatorio = (int) (Math.random() * 49);
            numeroAleatorio2 = (int) (Math.random() * 49);
            if (numeroAleatorio % 2 == 0 && numeroAleatorio <= 20) {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.nombres[numeroAleatorio2] + " "
                        + this.apellidos[numeroAleatorio] + " " + this.apellidos[numeroAleatorio2];
            } else {
                nombreCompleto[i] = this.nombres[numeroAleatorio] + " " + this.apellidos[numeroAleatorio] + " "
                        + this.apellidos[numeroAleatorio2];
            }
        }
        return this.nombreCompleto;

    }

}
