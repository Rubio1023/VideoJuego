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
    private Scanner dato = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        boolean ataqueValido = false;  // Para validar la opción de ataque
        // Bucle para solicitar la selección de ataque en caso de que no sea válida
        while (!ataqueValido) 
        {
            // Información de los ataques disponibles
            System.out.println("\nLos ataques tienen un rango de daño y conste de mana elige sabiamente\n"
            +"El filo cortante tiene un rango de daño de 15 a 30 y un costo de mana de 35\n"
            +"El rebanador tiene un rango de daño de 15 a 50 y un costo de mana de 60\n"
            +"El ataque del bererker tiene un rango de daño de 25 a 80 y un costo de mana de 90\n"
            +"Recargar mana (Recupera 60 MP)");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("\nSelecciona un ataque con la espada ensangretada:\n 1: Filo Cortante\n 2: Rebanador\n 3: Ataque del Berserker\n 4: Recargar mana\n");
            System.out.print("Ingresar opcion :");
            int opcion = dato.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    // Verificamos si el atacante tiene suficiente MP
                    if (atacante.tieneSuficienteMP(35)) {
                        ataque = new FiloCortante();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 2:
                    // Verificamos si el atacante tiene suficiente MP
                    if (atacante.tieneSuficienteMP(60)) {
                        ataque = new Rebanador();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 3:
                    // Verificamos si el atacante tiene suficiente MP
                    if (atacante.tieneSuficienteMP(90)) {
                        ataque = new AtaqueDelBerserker();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 4:
                    // Recargamos 60 MP al atacante
                    atacante.recargarMP(60);
                    System.out.println(atacante.getNombre() + " ha regenerado 60 puntos de mana. MP actual: " + atacante.getMP());
                    ataqueValido = true;  // Permite que salga del bucle
                    return;  // Salimos del método ya que solo se recargó mana
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones que hay para realizar el ataque.");
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
