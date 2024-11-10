package ataques;
import java.util.Random;
// Clase AtaqueDeBaston que contiene métodos para diferentes tipos de ataques con baston
public class AtaqueDeBaston 
{
    private int damage; // Daño del ataque
    private int costoMP; // Costo de MP del ataque
    private Random rand = new Random(); // Objeto Random para generar números aleatorios

    // Método para calcular el daño del ataque y costo de MP
    public void HechizoBasico() 
    {
        damage =rand.nextInt(16)+10; // Daño de 10 a 25 
        costoMP = 5; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void HechizoElemental() 
    {
        damage =rand.nextInt(21)+30; // Daño de 30 a 50 
        costoMP = 5; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void HechizoArcano() 
    {
        damage =rand.nextInt(21)+60; // Daño de 60 a 80 
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