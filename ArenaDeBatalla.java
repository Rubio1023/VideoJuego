
import personajes.Personajes;

class ArenaDeBatalla 
{
    private Personajes jugador1;
    private Personajes jugador2;

    public ArenaDeBatalla(Personajes jugador1, Personajes jugador2)
    {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() 
    {
        while (jugador1.estaVivo() && jugador2.estaVivo()) 
        {
            System.out.println("\nTurno de " + jugador1.getNombre()+"\n");
            jugador1.atacar(jugador1, jugador2);
            jugador1.mostrarHPyMP();

            if (!jugador2.estaVivo()) 
            {
                System.out.println(jugador2.getNombre() + " ha sido derrotado.");
                break;
            }

            System.out.println("\nTurno de " + jugador2.getNombre()+"\n");
            jugador2.atacar(jugador2, jugador1);
            jugador2.mostrarHPyMP();

            if (!jugador1.estaVivo()) 
            {
                System.out.println(jugador1.getNombre() + " ha sido derrotado.");
                break;
            }
        }

        if (jugador1.estaVivo()) 
        {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }
}
