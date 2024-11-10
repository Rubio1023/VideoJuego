// Paquete armas
package armas;

import java.util.Scanner;
import ataques.AtaqueDeBaston.HechizoArcano;
import ataques.AtaqueDeBaston.HechizoBasico;
import ataques.AtaqueDeBaston.HechizoElemental;
import ataques.Ataque;
import personajes.Personajes;

// Clase Arco que implementa la interfaz Arma
public class Baston implements Arma 
{
    private Ataque ataque; // Referencia a la interfaz Ataque
    private Scanner scanner = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes objetivo) 
    {
        // Seleccionar el ataque
        System.out.println("Selecciona un ataque con el bastón:\n 1: Hechizo Básico\n 2: Hechizo Elemental\n 3: Hechizo Arcano");
        int opcion = scanner.nextInt();

        // Cambiar el ataque basado en la selección
        switch (opcion) 
        {
            case 1:
                ataque = new HechizoBasico();  // Cambiar a Hechizo Básico
                break;
            case 2:
                ataque = new HechizoElemental(); // Cambiar a Hechizo Elemental
                break;
            case 3:
                ataque = new HechizoArcano();  // Cambiar a Hechizo Arcano
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Si no es válida, salir del método
        }
        // Llamar al método para ejecutar el ataque
        ejecutarAtaque(objetivo);
    }

    @Override
    public void ejecutarAtaque(Personajes objetivo) 
    {
        if (ataque != null) 
        {
            ataque.ejecutarAtaque(objetivo);  // Aquí pasamos el objetivo al ataque
        }
    }
}

