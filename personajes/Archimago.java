package personajes;

import armas.Arma;
// Clase Archimago que extiende Personajes
public class Archimago extends Personajes
{
    // Constructor de la clase Archimago
    public Archimago(String nombre, int HP, int MP, Arma armas) 
    {
        super(nombre, HP, MP, armas);
    }
    // Método para atacar
    @Override
    public void atacar(Personajes objetivo) 
    {
        System.out.println("El Archimago se esta preparando con su baston antiguo.");
        armas.seleccionarAtaque();// Llamar al método de selección de ataque de la clase Arma
    }
}
