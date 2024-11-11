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

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        boolean ataqueValido = false;  // Para validar la opción de ataque
        // Bucle para solicitar la selección de ataque en caso de que no sea válida
        while (!ataqueValido) 
        {
            // Información de los ataques disponibles
            System.out.println("\nLos ataques tienen un rango de daño y conste de mana elige sabiamente\n"
            +"El ataque furtivo tiene un rango de daño de 10 a 20 y un costo de mana de 15\n"
            +"El ataque sigiloso tiene un rango de daño de 25 a 30 y un costo de mana de 25\n"
            +"El envenenamiento tiene un rango de daño de 10 a 80 y un costo de mana de 85\n"
            +"Recargar mana (Recupera 60 MP)");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("\nSelecciona un ataque con la cuchilla del asesino:\n 1: Ataque Furtivo\n 2: Ataque Sigiloso\n 3: Envenenamiento\n 4: Recargar Mana\n");
            System.out.print("Ingresar opcion :");
            int opcion = scanner.nextInt();
            // Seleccionar el ataque
            switch (opcion) {
                case 1:
                    // Verifica si el atacante tiene suficiente mana para el Ataque Furtivo
                    if (atacante.tieneSuficienteMP(15)) {
                        ataque = new AtaqueFurtivo();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 2:
                    // Verifica si el atacante tiene suficiente mana para el Ataque Sigiloso
                    if (atacante.tieneSuficienteMP(25)) {
                        ataque = new AtaqueSigiloso();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 3:
                    // Verifica si el atacante tiene suficiente mana para el Envenenamiento
                    if (atacante.tieneSuficienteMP(85)) {
                        ataque = new Envenenamiento();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 4:
                    // Opción de recargar mana
                    atacante.recargarMP(60);
                    System.out.println("Recargaste 60 MP. MP actual: " + atacante.getMP());
                    ataqueValido = true;  // Permite salir del bucle, ya que se recargó mana
                    return;  // Salimos del método porque solo se recargó mana
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
            }
        }

        // Ejecutar el ataque si se seleccionó uno válido
        if (ataque != null) {
            ejecutarAtaque(atacante, objetivo);
        }
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
