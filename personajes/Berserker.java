package personajes;

import armas.Arma;
// Clase Berserker que extiende Personajes
public class Berserker extends Personajes
{
    // Constructor de la clase Berserker
    public Berserker(String nombre, int HP, int MP, Arma armas) 
    {
        super(nombre, HP, MP, armas);
    }
    // Método para atacar
    @Override
    public void atacar(Personajes objetivo) 
    {
        System.out.println("El Berserker se esta preparando con su espada ensangretada.");
        armas.seleccionarAtaque(objetivo);// Llamar al método de selección de ataque de la clase Arma
    }
}
