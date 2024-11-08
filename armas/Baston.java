package armas;

import ataques.Ataque;
import ataques.baston.HechizoBasico;
import ataques.baston.HechizoElemental;
import ataques.baston.HechizoArcano;
import java.util.ArrayList;
import java.util.List;

public class Baston implements Armas 
{
    private int MP;
    private List<Ataque> ataques; // Lista de ataques del bastón

    public Baston(int MPInicial) 
    {
        this.MP = MPInicial;
        this.ataques = new ArrayList<>();
        this.ataques.add(new HechizoBasico());  // Añadimos ataques específicos para el bastón
        this.ataques.add(new HechizoElemental());
        this.ataques.add(new HechizoArcano());
    }

    @Override
    public int realizarAtaque(Ataque ataque) 
    {
        int damage = ataque.calcularDamage();
        System.out.println("Realizando ataque :" + ataque.getClass().getSimpleName() + " daño realizado :" + damage);
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
