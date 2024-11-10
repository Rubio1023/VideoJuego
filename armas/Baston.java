// Paquete armas
package armas;

import java.util.Scanner;
import ataques.Ataque;
import personajes.Personajes;
import ataques.AtaqueDeBaston.HechizoArcano;
import ataques.AtaqueDeBaston.HechizoBasico;
import ataques.AtaqueDeBaston.HechizoElemental;

// Clase Arco que implementa la interfaz Arma
public class Baston implements Arma 
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
            +"El hechizo básico tiene un rango de daño de 10 a 25 y un costo de mana de 20\n"
            +"El hechizo elemental tiene un rango de daño de 30 a 50 y un costo de mana de 50\n"
            +"El hechizo arcano tiene un rango de daño de 60 a 80 y un costo de mana de 80");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("Opciones de ataque con el Bastón Antiguo:\n 1: Hechizo Básico\n 2: Hechizo Elemental\n 3: Hechizo Arcano");
            System.out.print("Ingresar opcion :");
            int opcion = scanner.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    ataque = new HechizoBasico();
                    ataqueValido = true;
                    break;
                case 2:
                    ataque = new HechizoElemental();
                    ataqueValido = true;
                    break;
                case 3:
                    ataque = new HechizoArcano();
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
    // Método para ejecutar el ataque
    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        if (ataque != null) 
        {
            ataque.ejecutarAtaque(atacante,objetivo);  // Aquí pasamos el atacante y el objetivo del ataque
        }
    }
}

