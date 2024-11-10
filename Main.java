import java.util.Scanner;
import personajes.Archimago;
import personajes.Arquero;
import personajes.Asesino;
import personajes.Berserker;
import personajes.Personajes;
import armas.Baston;

// Método principal que ejecuta el juego
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner dato = new Scanner(System.in);

        // Solicitar el nombre del jugador 1
        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = dato.nextLine();

        // Solicitar el nombre del jugador 2
        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = dato.nextLine();

        // Crear una instancia del juego con los dos jugadores
        Personajes jugador1 = seleccionarClase(nombre1, dato);
        Personajes jugador2 = seleccionarClase(nombre2, dato);

        ArenaDeBatalla juego = new ArenaDeBatalla(jugador1, jugador2);
        // Iniciar la pelea
        juego.iniciarPelea();
    }

    public static Personajes seleccionarClase(String nombre, Scanner dato) 
    {
        System.out.println("Selecciona la clase de " + nombre + ":");
        System.out.println("1. Archimago");
        System.out.println("2. Arquero");
        System.out.println("3. Aseino");
        System.out.println("4. Berserker");

        int opcion = dato.nextInt();
        dato.nextLine();

        switch (opcion) 
        {
            case 1:
                return new Archimago(nombre, 100, 100, new Baston());
            case 2:
                return new Arquero(nombre, opcion, opcion, null);
            case 3:
                return new Asesino(nombre, opcion, opcion, null);
            case 4:
                return new Berserker(nombre, opcion, opcion, null);
            default:
                System.out.println("Opción inválida. Se seleccionará Archimago por defecto.");
                return new Archimago(nombre, opcion, opcion, null);
        }
    }
}