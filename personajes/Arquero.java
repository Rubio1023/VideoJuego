package personajes;
import armas.Armas;
import ataques.Ataque;

public class Arquero 
{
    private Armas arma;
    // Constructor
    public Arquero(Armas arma) 
    {
        this.arma = arma;
    }
    // Método para realizar un ataque
    public void realizarAtaque() 
    {
        // arquero selecciona el primer ataque
        Ataque ataque = arma.getAtaques().get(0);  // Obtenemos el primer ataque de la lista
        arma.realizarAtaque(ataque);  // Realizamos el ataque
    }
}
