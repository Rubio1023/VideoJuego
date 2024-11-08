package ataques.arco;

import java.util.Random;

import ataques.Ataque;

public class FlechaDeFuego implements Ataque 
{
    // Objeto Random para generar números aleatorios
    Random rand = new Random();
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return rand.nextInt(11)+10; // Daño de 10 a 20
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando ataque Flecha De Fuego, daño realizado :" + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Flecha De Fuego";
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 20;
    }
}
