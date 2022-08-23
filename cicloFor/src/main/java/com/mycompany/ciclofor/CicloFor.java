/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ciclofor;

/**
 *
 * @author juan bonilla
 */
public class CicloFor {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int tolalEpisodes = 1; // variable asiganada

        if (tolalEpisodes > 1 && tolalEpisodes <= 10) {  //aqui agregamos dos condiciones al if usando &&
            System.out.println("Es una miniserie");
        } else if (tolalEpisodes > 10) {  // podemos usar varios else if para agragar mas condiciones extras sino se cumple la primera
            System.out.println("Es una serie");
        } else if (tolalEpisodes == 1) {  // este se usa para indicar que si no se cumpla la anterior condicion imprima este mensaje
            System.out.println("Es una pelicula");
        } else { // en caso de que ninguna de las anteriores condiciones sea verdadera imprimira este mensaje
            System.out.println("Debe tener al menos un episodio");
        }

        int i = 0; // contador  // el programa determina que parte de la pelicula es en funcion de los segundos que lleva
        int duration = 10;

        while (i <= duration) { //este cliclo nos permite hacer cumplir una condicion obligatoriamente es usado mayormete en datos de formularios
            if (i < 3) {
                System.out.println("Reproduciendo intro, segundo " + i); // 
            } else if (i < 7) {
                System.out.println("Reproduciendo pelicula, segundo " + i);
            } else {
                System.out.println("Reproduciendo creditos, segundo " + i);
            }
            i++; // acumulador

            System.out.println("-----------------------");
            
            for (int j=0;j<=duration;j++) { // el cliclo for a diferencia del ciclo while no se repeteria infinitamente
                if (j < 3) {
                    System.out.println("Reproduciendo intro, segundo " + j); // 
                   
                } else if (j < 7) {
                    System.out.println("Reproduciendo pelicula, segundo " + j);
                } else {
                    System.out.println("Reproduciendo creditos, segundo " + j);
                }
            }
        }
    }
}
