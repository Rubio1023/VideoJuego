package personajes;

import armas.Arma;
// Clase Asesino que extiende Personajes
public class Asesino extends Personajes
{
    // Constructor de la clase Asesino
    public Asesino(String nombre, int HP, int MP, Arma armas) 
    {
        super(nombre, HP, MP, armas);
    }
    // Método para atacar
    @Override
    public void atacar(Personajes objetivo) 
    {
        System.out.println("El Asesino se esta preparando en las sombras para atacar son su arma.");
        armas.seleccionarAtaque();// Llamar al método de selección de ataque de la clase Arma
    }
}
