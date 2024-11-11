
import personajes.Personajes;

class ArenaDeBatalla 
{
    private Personajes jugador1;
    private Personajes jugador2;
    // Constructor de la clase
    public ArenaDeBatalla(Personajes jugador1, Personajes jugador2)
    {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    // Método para iniciar la pelea
    public void iniciarPelea() 
    {   
        // Mientras ambos jugadores estén vivos, se seguirá ejecutando el ciclo
        while (jugador1.estaVivo() && jugador2.estaVivo()) 
        {
            // Se muestra el turno del jugador 1
            System.out.println("\nTurno de " + jugador1.getNombre()+"\n");
            jugador1.atacar(jugador1, jugador2);
            jugador1.mostrarHPyMP();

            if (!jugador2.estaVivo()) 
            {
                System.out.println(jugador2.getNombre() + " ha sido derrotado.");
                break;
            }
            // Se muestra el turno del jugador 2
            System.out.println("\nTurno de " + jugador2.getNombre()+"\n");
            jugador2.atacar(jugador2, jugador1);
            jugador2.mostrarHPyMP();

            if (!jugador1.estaVivo()) 
            {
                System.out.println(jugador1.getNombre() + " ha sido derrotado.");
                break;
            }
        }
        // Se muestra el resultado de la pelea
        if (jugador1.estaVivo()) 
        {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }
}
