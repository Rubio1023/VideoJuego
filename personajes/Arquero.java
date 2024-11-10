package personajes;
import armas.Arma;

// Clase Arquero que extiende Personajes
public class Arquero extends Personajes 
{
    // Constructor de la clase Arquero
    public Arquero(String nombre, int HP, int MP, Arma armas) 
    {
        super(nombre, HP, MP, armas);
    }
    // Método para atacar
    @Override
    public void atacar(Personajes atacante,Personajes objetivo) 
    {
        System.out.println("El Arquero se esta preparando con su arco milenario.");
        armas.seleccionarAtaque(atacante,objetivo);// Llamar al método de selección de ataque de la clase Arma
    }
}