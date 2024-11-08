package personajes;

// Clase concreta de personaje

import armas.Armas;

public class Archimago extends Personajes
{
    // Constructor
    public Archimago(String nombre, int HP, int MP, Armas armas) 
    {
        super(nombre, HP, MP, armas);
    }

    // Metodo para atacar se utiliza el @Override para sobreescribir el metodo de la clase padre
    @Override
    public void atacar(Personajes enemigo) 
    {
        System.out.println(getNombre() + " ataca con su magia a " + enemigo.getNombre());
        enemigo.recibirDamage(20);
    }
}
