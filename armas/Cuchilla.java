package armas;

import ataques.Ataque;
import ataques.cuchillo.AtaqueSigiloso;
import ataques.cuchillo.AtaqueFurtivo;
import ataques.cuchillo.AtaqueVenenoso;
import java.util.ArrayList;
import java.util.List;

public class Cuchilla implements Armas {
    private int MP;
    private List<Ataque> ataques; // Lista de ataques del bastón

    public Cuchilla(int MPInicial) {
        this.MP = MPInicial;
        this.ataques = new ArrayList<>();
        this.ataques.add(new AtaqueSigiloso());  // Añadimos ataques específicos para el cuchillo
        this.ataques.add(new AtaqueFurtivo());
        this.ataques.add(new AtaqueVenenoso());
    }

    @Override
    public int realizarAtaque(Ataque ataque) {
        int damage = ataque.calcularDamage();
        System.out.println("Realizando ataque: " + ataque.getClass().getSimpleName() + " daño realizado :" + damage);
        return damage;
    }
    // Metodo para obtener los ataques disponibles
    @Override
    public List<Ataque> getAtaques() 
    {
        return ataques;
    }
    // Metodo para obtener la cantidad de MP
    public int getMP() 
    {
        return MP;
    }
    // Metodo para recargar MP
    public void recargarMP(int cantidad) 
    {
        MP += cantidad;
        System.out.println("MP recargados :" + cantidad + ". MP actual :" + MP);
    }
}
