// Paquete armas
package armas;

import java.util.Scanner;

import ataques.Ataque;
import ataques.AtaqueDeEspada.FiloCortante;
import ataques.AtaqueDeEspada.Rebanador;
import personajes.Personajes;
import ataques.AtaqueDeEspada.AtaqueDelBerserker;

// Clase Arco que implementa la interfaz Arma
public class Espada implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con la Espada Ensangretada:\n 1: Filo Cortante\n 2: Rebanador\n 3: Ataque Del Berserker");
        int opcion = scanner.nextInt();

        // Cambiar el ataque basado en la selección
        switch (opcion) 
        {
            case 1:
                ataque = new FiloCortante();  // Cambiar a Hechizo Básico
                break;
            case 2:
                ataque = new Rebanador(); // Cambiar a Hechizo Elemental
                break;
            case 3:
                ataque = new AtaqueDelBerserker();  // Cambiar a Hechizo Arcano
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
