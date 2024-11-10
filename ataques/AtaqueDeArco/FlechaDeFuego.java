package ataques.AtaqueDeArco;

import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;

public class FlechaDeFuego implements Ataque
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage = rand.nextInt(11)+10; // Daño de 10 a 20 
        costoMP = 25; // Costo de MP de la flecha rápida

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        atacante.reducirMP(costoMP);
        System.out.println("Ataque Flecha De Fuego realizo :" + damage + " de daño a "+ objetivo.getNombre() +" Costo de MP :" + costoMP);
    }    
}
