// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import ataques.AtaqueDeCuchilla.AtaqueFurtivo;
import ataques.AtaqueDeCuchilla.Envenenamiento;
import ataques.AtaqueDeCuchilla.AtaqueSigiloso;

// Clase Arco que implementa la interfaz Arma
public class Cuchilla implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque() 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el bastón:\n 1: Hechizo Básico\n 2: Hechizo Elemental\n 3: Hechizo Arcano");
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
    }
}
