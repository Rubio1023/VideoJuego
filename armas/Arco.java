package armas;
import ataques.Ataque;
import ataques.arco.FlechaRapida;
import ataques.arco.FlechaDeFuego;
import ataques.arco.FlechaOscura;
import java.util.ArrayList;
import java.util.List;

public class Arco implements Armas
{
    private int MP;
    private List<Ataque> ataques; // Lista de ataques del arco
    
    // Constructor
    public Arco(int MPInicial) 
    {
        this.MP = MPInicial;
        this.ataques = new ArrayList<>();
        this.ataques.add(new FlechaRapida()); // Añadimos ataques específicos para el arco
        this.ataques.add(new FlechaDeFuego());
        this.ataques.add(new FlechaOscura());
    }
    
    // Método para realizar un ataque
    @Override
    public int realizarAtaque(Ataque ataque) 
    {
        int damage = ataque.calcularDamage();
        System.out.println("Realizando ataque :" + ataque.getClass().getSimpleName() + " daño realizado :" + damage);
        return damage;
    }
    
    // Método para obtener los ataques
    @Override
    public List<Ataque> getAtaques() 
    {
        return ataques;  
    }
    
    // Método para obtener la cantidad de MP
    public int getMP() 
    {
        return MP;
    }
    
    // Método para recargar MP
    public void recargarMP(int cantidad) 
    {
        MP += cantidad;
        System.out.println("MP recargados :" + cantidad + ". MP actual :" + MP);
    }
    
    // Método para reducir MP
    public int reducirMP(int cantidad) 
    {
        MP -= cantidad;
        System.out.println("MP reducidos :" + cantidad + ". MP actual :" + MP);
        return MP;
    }
    
    // Método para defenderse
    @Override
    public void defender() 
    {
        System.out.println("Defensa activada.");
    }
}
