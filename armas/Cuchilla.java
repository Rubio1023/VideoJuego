// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import personajes.Personajes;
import ataques.AtaqueDeCuchilla.AtaqueFurtivo;
import ataques.AtaqueDeCuchilla.AtaqueSigiloso;
import ataques.AtaqueDeCuchilla.Envenenamiento;

// Clase Arco que implementa la interfaz Arma
public class Cuchilla implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque
    private boolean ataqueValido = false;  // Para validar la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        // Bucle para solicitar la selección de ataque en caso de que no sea válida
        while (!ataqueValido) 
        {
            // Información de los ataques disponibles
            System.out.println("Los ataques tienen un rango de daño y conste de mana elige sabiamente\n"
            +"El ataque furtivo tiene un rango de daño de 10 a 20 y un costo de mana de 15\n"
            +"El ataque sigiloso tiene un rango de daño de 25 a 30 y un costo de mana de 25\n"
            +"El envenenamiento tiene un rango de daño de 10 a 80 y un costo de mana de 85");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("Selecciona un ataque con la cuchilla del asesino:\n 1: Ataque Furtivo\n 2: Ataque Sigiloso\n 3: Envenenamiento");
            System.out.print("Ingresar opcion :");
            int opcion = scanner.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    ataque = new AtaqueFurtivo();
                    ataqueValido = true;
                    break;
                case 2:
                    ataque = new AtaqueSigiloso();
                    ataqueValido = true;
                    break;
                case 3:
                    ataque = new Envenenamiento();
                    ataqueValido = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones que hay para realizar el ataque.");
                    // No se sale del bucle y se solicita nuevamente la selección de ataque.
            }
        }
        // Llamar al método para ejecutar el ataque
        ejecutarAtaque(atacante,objetivo);
    }

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        if (ataque != null) 
        {
            ataque.ejecutarAtaque(atacante,objetivo);  // Aquí pasamos el objetivo al ataque
        }
    }
}
