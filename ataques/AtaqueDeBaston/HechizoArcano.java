package ataques.AtaqueDeBaston;
import java.util.Random;
import ataques.Ataque;
import personajes.Personajes;
// Implementación AtaqueBasico
public class HechizoArcano implements Ataque 
{
    private int damage;
    private int costoMP;
    private Random rand = new Random();

    @Override
    public void ejecutarAtaque(Personajes atacante,Personajes objetivo) 
    {
        damage = rand.nextInt(21) + 60;  // Daño de 60 a 80
        costoMP = 80;  // Costo de MP

        // Si el objetivo está defendiendo, el daño se reduce
        if (objetivo.estaVivo()) 
        {
            objetivo.recibirDamage(damage);
        } else {
            System.out.println("El objetivo ya está muerto, no se puede atacar.");
        }
        // Reduce los MP del personaje que ejecuta el hechizo
        atacante.reducirMP(costoMP);
        System.out.println("Ataque Hechizo Arcano realizo " + damage + " de daño, Costo de MP: " + costoMP);
    }
}