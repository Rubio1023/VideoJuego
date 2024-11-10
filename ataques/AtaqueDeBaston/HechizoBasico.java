package ataques.AtaqueDeBaston;
import java.util.Random;
import ataques.Ataque;
// Implementación AtaqueBasico
import personajes.Personajes;
public class HechizoBasico implements Ataque 
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage = rand.nextInt(16) + 10; // Daño de 10 a 25
        costoMP = 20;  // Costo de MP

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        atacante.reducirMP(costoMP);
        System.out.println("Ataque Hechizo Basico realizo " + damage + " de daño, Costo de MP: " + costoMP);
    }
}