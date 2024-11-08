package ataques.baston;
import java.util.Random;

import ataques.Ataque;

public class HechizoElemental implements Ataque
{
    // Objeto Random para generar números aleatorios
    Random rand = new Random(); 
    //Metodo para calcular el daño
    @Override
    public int calcularDamage() 
    {
        return rand.nextInt(21)+30; // Daño de 30 a 50
    }
    //Metodo para realizar el ataque
    @Override
    public int realizarAtaque() 
    { 
        int damage = calcularDamage();
        System.out.println("Realizando ataque Hechizo Elemental, daño realizado :" + damage);
        return damage; // Devuelve el daño como int
    }
    // Metodo para devolver el nombre del ataque
    @Override
    public String getNombre() {
        return "Hechizo Elemental"; 
    }
    // Metodo para devolver el costo de MP
    @Override
    public int getCostoMP() 
    {
        return 50;
    }
}
