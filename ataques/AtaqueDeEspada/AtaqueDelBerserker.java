package ataques.AtaqueDeEspada;

import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;

public class AtaqueDelBerserker implements Ataque
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage = rand.nextInt(56)+25; // Daño de 25 80 
        costoMP = 90; // Costo de MP de la flecha rápida

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        atacante.reducirMP(costoMP);
        System.out.println("\n"+"Resumen del ataque\n"+"Ataque Del Berserker realizo " + damage + " de daño a "+ objetivo.getNombre() +" y le costo :" + costoMP+" puntos de mana a "+ atacante.getNombre());
    }     
}