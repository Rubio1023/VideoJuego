// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import ataques.AtaqueDeArco.FlechaRapida;
import personajes.Personajes;
import ataques.AtaqueDeArco.FlechaDeFuego;
import ataques.AtaqueDeArco.FlechaOscura;

// Clase Arco que implementa la interfaz Arma
public class Arco implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el Arco antiguo:\n 1: Flecha Rapida\n 2: Flecha De Fuego\n 3: Flecha Oscura");
        int opcion = scanner.nextInt();

        // Cambiar el ataque basado en la selección
        switch (opcion) 
        {
            case 1:
                ataque = new FlechaRapida();  // Cambiar a Hechizo Básico
                break;
            case 2:
                ataque = new FlechaDeFuego(); // Cambiar a Hechizo Elemental
                break;
            case 3:
                ataque = new FlechaOscura();  // Cambiar a Hechizo Arcano
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Si no es válida, salir del método
        }
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
