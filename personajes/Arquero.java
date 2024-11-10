package personajes;
import armas.Arma;

// Clase Arquero que extiende Personajes
public class Arquero extends Personajes 
{
    public Arquero(String nombre, int HP, int MP, Arma armas) 
    {
        super(nombre, HP, MP, armas);
    }

    @Override
    public void atacar(personajes.Personajes objetivo) 
    {
        System.out.println("El arquero está atacando con su arma.");
        armas.seleccionarAtaque();// Llamar al método de selección de ataque de la clase Arma
    }
}