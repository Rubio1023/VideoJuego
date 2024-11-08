package armas;

import ataques.Ataque;
import ataques.baston.AtaqueMagico;
import ataques.baston.AtaqueFisico;
import java.util.ArrayList;
import java.util.List;

public class Espada implements Armas 
{
    private int MP;
    private List<Ataque> ataques; // Lista de ataques del bastón

    public Espada(int MPInicial) 
    {
        this.MP = MPInicial;
        this.ataques = new ArrayList<>();
        this.ataques.add(new AtaqueMagico());  // Añadimos ataques específicos para el bastón
        this.ataques.add(new AtaqueFisico());
    }

    @Override
    public int realizarAtaque(Ataque ataque) 
    {
        int damage = ataque.calcularDamage();
        System.out.println("Realizando ataque: " + ataque.getClass().getSimpleName() + " con daño: " + damage);
        return damage;
    }

    @Override
    public List<Ataque> getAtaques() 
    {
        return ataques;  // Retorna la lista de ataques disponibles para el bastón
    }

    public int getMP() {
        return MP;
    }

    public void recargarMP(int cantidad) 
    {
        MP += cantidad;
        System.out.println("MP recargados: " + cantidad + ". MP actual: " + MP);
    }
}
