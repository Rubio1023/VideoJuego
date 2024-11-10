package ataques.AtaqueDeArco;

import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;

public class FlechaOscura implements Ataque
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage =rand.nextInt(31)+30; // Daño de 30 a 60 
        costoMP = 40; // Costo de MP de la flecha rápida

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        atacante.reducirMP(costoMP);
        System.out.println("Ataque Flecha Oscura realizo :" + damage + " de daño a "+ objetivo.getNombre() +" Costo de MP :" + costoMP);
    } 
}
