package ataques;
import java.util.Random;
// Clase AtaqueDeArco que contiene métodos para diferentes tipos de ataques con arco
public class AtaqueDeEspada 
{
    private int damage; // Daño del ataque
    private int costoMP; // Costo de MP del ataque
    private Random rand = new Random(); // Objeto Random para generar números aleatorios

    // Método para calcular el daño del ataque y costo de MP
    public void FiloCortante() 
    {
        damage =rand.nextInt(26)+15; // Daño de 15 a 40 
        costoMP = 40; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void Rebanador() 
    {
        damage =rand.nextInt(36)+15; // Daño de 15 a 50 
        costoMP = 60; // Costo de MP de la flecha rápida
        System.out.println("El arquero ejecuta un disparo rápido con su arco.");
        System.out.println("Daño :" + damage + ", Costo de MP :" + costoMP);
    }
    public void AtaqueDelBerserker() 
    {
        damage =rand.nextInt(56)+25; // Daño de 25 80 
        costoMP = 90; // Costo de MP de la flecha rápida
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