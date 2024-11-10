import java.util.Scanner;
import personajes.Archimago;
import personajes.Arquero;
import personajes.Asesino;
import personajes.Berserker;
import personajes.Personajes;
import armas.Baston;
import armas.Arco;
import armas.Cuchilla;
import armas.Espada;

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
        while(true) 
        {
            System.out.println("\n"+"Jugador " + nombre + " porfavor selecione el personaje que desea \n1 Archimago\n2 Arquero\n3 Asesino\n4 Berserker");
            System.out.print("Ingresar opcion :");
            int opcion = dato.nextInt();
            dato.nextLine();// Limpiar el buffer

            switch (opcion) 
            {
                case 1:
                    return new Archimago(nombre, 100, 100, new Baston());
                case 2:
                    return new Arquero(nombre, 100, 100, new Arco());
                case 3:
                    return new Asesino(nombre, 100, 100, new Cuchilla());
                case 4:
                    return new Berserker(nombre, 100, 100, new Espada());
                default:
                    System.out.println("Opción inválida. Vuelva a intentarlo.");
            }
        }
    }

}