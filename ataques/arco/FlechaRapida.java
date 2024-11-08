package ataques.arco;

import ataques.Ataque;

public class FlechaRapida implements Ataque 
{
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return 10 + (int) (Math.random() * 10); // Daño de 10 a 20
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando ataque Flecha Rápida con daño: " + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Flecha Rápida"; // Devuelve el nombre del ataque
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 5; // Devuelve el costo de MP
    }
}
