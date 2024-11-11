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
            +"La felcha rapida tiene un rango de daño de 5 a 10 y un costo de mana de 15\n"
            +"La flehca de fuego tiene un rango de daño de 10 a 20 y un costo de mana de 25\n"
            +"La flecha oscura tiene un rango de daño de 30 a 60 y un costo de mana de 40\n"
            +"Recargar mana (Recupera 60 MP)");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("\nSelecciona un ataque con el arco milenario:\n 1: Flecha Rapida\n 2: Flecha De Fuego\n 3: Flecha Oscura\n 4: Recargar mana\n");
            System.out.print("Ingresar opcion :");
            int opcion = dato.nextInt();
            // Seleccionar el ataque
            switch (opcion) 
            {
                case 1:
                    if (atacante.tieneSuficienteMP(15)) {
                        ataque = new FlechaRapida();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 2:
                    if (atacante.tieneSuficienteMP(25)) {
                        ataque = new FlechaDeFuego();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 3:
                    if (atacante.tieneSuficienteMP(40)) {
                        ataque = new FlechaOscura();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 4:
                    atacante.recargarMP(60); // Regenera 60 MP al jugador
                    System.out.println("Has recargado 60 puntos de mana. MP actual: " + atacante.getMP());
                    ataqueValido = true;  // Permite salir del bucle, ya que se recargó mana
                    return; // Salimos del método, ya que se recargó mana
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones para realizar el ataque.");
            }
        }
        
        // Llamar al método para ejecutar el ataque
        if (ataque != null) {
            ejecutarAtaque(atacante, objetivo);  // Ejecutar el ataque seleccionado
        }
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
