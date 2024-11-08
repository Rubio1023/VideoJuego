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
    public void realizarAtaque(int indiceAtaque) 
    {
        Ataque ataque = arma.getAtaques().get(indiceAtaque);  // Selecciona el ataque según el índice
        arma.realizarAtaque(ataque);  // Realiza el ataque
    }
    
}
