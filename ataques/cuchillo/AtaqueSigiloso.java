package ataques.cuchillo;
import java.util.Random;

import ataques.Ataque;

public class AtaqueSigiloso implements Ataque
{
    // Objeto Random para generar números aleatorios
    Random rand = new Random(); 
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return rand.nextInt(6)+26; // Daño de 25 a 30
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando ataque Sigiloso, dao realizado :" + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Ataque Sigiloso"; 
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 25;
    }
}
