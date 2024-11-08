package ataques.espada;
import java.util.Random;

import ataques.Ataque;

public class AtaqueDelBerserker implements Ataque
{
    // Objeto Random para generar números aleatorios
    Random rand = new Random(); 
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return rand.nextInt(56)+25; // Daño de 25 a 80
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando Ataque Del Berserker, daño realizado :" + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Ataque Del Berserker"; 
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 90; 
    }    
}
