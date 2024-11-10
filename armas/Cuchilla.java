// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import ataques.AtaqueDeCuchilla.AtaqueFurtivo;
import ataques.AtaqueDeCuchilla.Envenenamiento;
import personajes.Personajes;
import ataques.AtaqueDeCuchilla.AtaqueSigiloso;

// Clase Arco que implementa la interfaz Arma
public class Cuchilla implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con la Cuchilla:\n 1: Ataque Furtivo\n 2: Ataque Sigiloso\n 3: Envenenamiento");
        int opcion = scanner.nextInt();

        // Cambiar el ataque basado en la selección
        switch (opcion) 
        {
            case 1:
                ataque = new AtaqueFurtivo();  // Cambiar a Hechizo Básico
                break;
            case 2:
                ataque = new AtaqueSigiloso(); // Cambiar a Hechizo Elemental
                break;
            case 3:
                ataque = new Envenenamiento();  // Cambiar a Hechizo Arcano
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Si no es válida, salir del método
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
