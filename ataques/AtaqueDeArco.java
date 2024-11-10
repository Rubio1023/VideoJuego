package ataques;
import java.util.Random;
// Clase AtaqueDeArco que contiene métodos para diferentes tipos de ataques con arco
public class AtaqueDeArco 
{
    private int damage; // Daño del ataque
    private int costoMP; // Costo de MP del ataque
    private Random rand = new Random(); // Objeto Random para generar números aleatorios

    // Método para calcular el daño del ataque y costo de MP
    public void FlachaRapida() 
    {
        damage =rand.nextInt(6)+5; // Daño de 5 a 10 
        costoMP = 5; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void FlachaDeFuego() 
    {
        damage =rand.nextInt(11)+10; // Daño de 10 a 20 
        costoMP = 5; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void FlachaOscura() 
    {
        damage =rand.nextInt(31)+30; // Daño de 30 a 60 
        costoMP = 5; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }

    // Métodos para obtener daño 
    public int getDamage() 
    {
        return damage;
    }
    // Método para obtener el costo de MP
    public int getCostoMP() 
    {
        return costoMP;
    }
}