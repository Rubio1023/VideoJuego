package ataques.AtaqueDeCuchilla;

import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;

public class AtaqueSigiloso implements Ataque
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes objetivo) 
    {
        damage = rand.nextInt(6)+25; // Daño de 25 a 30 
        costoMP = 25; // Costo de MP de la flecha rápida

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        objetivo.reducirMP(costoMP);
        System.out.println("Ataque Sigiloso realizo " + damage + " de daño, Costo de MP: " + costoMP);
    }    
}
