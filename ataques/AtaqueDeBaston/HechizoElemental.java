package ataques.AtaqueDeBaston;
import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;
// Implementación AtaqueBasico
public class HechizoElemental implements Ataque 
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage = rand.nextInt(21) + 30; // Daño de 30 a 50
        costoMP = 50;  // Costo de MP

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        objetivo.reducirMP(costoMP);
        System.out.println("Ataque Hechizo Elemental realizo " + damage + " de daño, Costo de MP: " + costoMP);
    }
}