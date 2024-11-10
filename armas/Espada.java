// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import personajes.Personajes;
import ataques.AtaqueDeEspada.FiloCortante;
import ataques.AtaqueDeEspada.Rebanador;
import ataques.AtaqueDeEspada.AtaqueDelBerserker;

// Clase Arco que implementa la interfaz Arma
public class Espada implements Arma 
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
            +"El filo cortante tiene un rango de daño de 15 a 30 y un costo de mana de 40\n"
            +"El rebanador tiene un rango de daño de 15 a 50 y un costo de mana de 60\n"
            +"El ataque del bererker tiene un rango de daño de 25 a 80 y un costo de mana de 90");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("Selecciona un ataque con la espada ensangretada:\n 1: Filo Cortante\n 2: Rebanador\n 3: Ataque del Berserker\n");
            System.out.print("Ingresar opcion :");
            int opcion = scanner.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    ataque = new FiloCortante();
                    ataqueValido = true;
                    break;
                case 2:
                    ataque = new Rebanador();
                    ataqueValido = true;
                    break;
                case 3:
                    ataque = new AtaqueDelBerserker();
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
