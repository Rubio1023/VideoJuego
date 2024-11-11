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
    private Scanner dato = new Scanner(System.in);  // Para leer la opción de ataque

    @Override
    public void seleccionarAtaque(Personajes atacante,Personajes objetivo) 
    {
        boolean ataqueValido = false;  // Para validar la opción de ataque
        // Bucle para solicitar la selección de ataque en caso de que no sea válida
        while (!ataqueValido) 
        {
            // Información de los ataques disponibles
            System.out.println("\n"+"Los ataques tienen un rango de daño y conste de mana elige sabiamente\n"
            +"El hechizo básico tiene un rango de daño de 10 a 25 y un costo de mana de 20\n"
            +"El hechizo elemental tiene un rango de daño de 30 a 50 y un costo de mana de 50\n"
            +"El hechizo arcano tiene un rango de daño de 60 a 80 y un costo de mana de 80\n"
            +"Recargar mana (Recupera 60 MP)");
            // Solicitar al jugador que seleccione un ataque
            System.out.println("\n"+"Opciones de ataque con el Bastón Antiguo\n 1: Hechizo Básico\n 2: Hechizo Elemental\n 3: Hechizo Arcano\n 4: Recargar Mana\n");
            System.out.print("Ingresar opcion :");
            int opcion = dato.nextInt();
            // Seleccionar el ataque
            switch (opcion) {
                case 1:
                    if (atacante.tieneSuficienteMP(20)) {
                        ataque = new HechizoBasico();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 2:
                    if (atacante.tieneSuficienteMP(50)) {
                        ataque = new HechizoElemental();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 3:
                    if (atacante.tieneSuficienteMP(80)) {
                        ataque = new HechizoArcano();
                        ataqueValido = true;
                    } else {
                        System.out.println("No tienes suficiente MP para realizar este ataque.");
                    }
                    break;
                case 4:
                    atacante.recargarMP(60);
                    ataqueValido = true;  // Permite salir del bucle, ya que la acción se ha realizado
                    System.out.println(atacante.getNombre() + " ha regenerado 60 puntos de mana. MP actual: " + atacante.getMP());
                    return;  // No se ejecuta un ataque, solo se recarga mana
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta.");
            }
        }
        // Llamar al método para ejecutar el ataque
        if (ataque != null) {
            ejecutarAtaque(atacante, objetivo);
        }
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

