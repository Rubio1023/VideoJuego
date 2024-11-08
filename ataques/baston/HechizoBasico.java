package ataques.baston;
import java.util.Random;

import ataques.Ataque;

public class HechizoBasico implements Ataque
{
    // Objeto Random para generar números aleatorios
    Random rand = new Random(); 
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return rand.nextInt(16)+10; // Daño de 15 a 25
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando ataque Hechizo Basico, daño realizado :" + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Hechizo Basico"; 
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 20; 
    }
}
