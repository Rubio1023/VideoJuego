// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import personajes.Personajes;
import ataques.AtaqueDeArco.FlechaRapida;
import ataques.AtaqueDeArco.FlechaDeFuego;
import ataques.AtaqueDeArco.FlechaOscura;

// Clase Arco que implementa la interfaz Arma
public class Arco implements Arma 
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
            // Solicitar al jugador que seleccione un ataque
            System.out.println("Selecciona un ataque con el bastón:\n 1: Hechizo Básico\n 2: Hechizo Elemental\n 3: Hechizo Arcano");
            int opcion = scanner.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    ataque = new FlechaRapida();
                    ataqueValido = true;
                    break;
                case 2:
                    ataque = new FlechaDeFuego();
                    ataqueValido = true;
                    break;
                case 3:
                    ataque = new FlechaOscura();
                    ataqueValido = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones que hay para realizar el ataque.");
                    // No se sale del bucle y se solicita nuevamente la selección de ataque.
            }
        }
        // Llamar al método para ejecutar el ataque
        ejecutarAtaque(atacante,objetivo); // Ejecutar el ataque seleccionado
    }
    // Método para ejecutar el ataque seleccionado
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        if (ataque != null) 
        {
            ataque.ejecutarAtaque(atacante,objetivo);  // Aquí pasamos el objetivo al ataque
        }
    }
}
