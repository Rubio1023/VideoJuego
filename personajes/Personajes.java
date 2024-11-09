package personajes;
import armas.Armas;
// Clase abstracta Personajes con los atributos y métodos comunes a todos los personajes
public abstract class Personajes 
{
    private String nombre; // Nombre del personaje
    private int HP =100; // Puntos de vida
    private int MP =100; // Puntos de magia
    protected Armas armas;  // Referencia al arma 
    private boolean defendiendo; // Variable para saber si el personaje se está defendiendo
    
    // Constructor
    public Personajes(String nombre, int HP, int MP, Armas armas) 
    {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.armas = armas;
        this.defendiendo = false;
    }
    
    // Metodo para obtener el nombre del personaje, la vida, la magia y el arma
    public String getNombre() 
    {
        return this.nombre;
    }
    public int getHP() 
    {
        return this.HP;
    }   
    public int getMP() 
    {
        return this.MP;
    }
    public Armas getArmas() 
    {
        return this.armas;
    }
    
    // Metodos abstractos para atacar sin implementacion
    public abstract void atacar(Personajes enemigo, int indiceAtaque);
    
    // Metodo para defenderse con implementacion
    public void defender() 
    {
        this.defendiendo = true;
        System.out.println(nombre + " se prepara para defender.");
    }
    
    // Metodo para redicir MP con implementacion
    public void reducirMP(int cantidad) 
    {
        this.MP -= cantidad;
    }
    
    // Metodo para recibir daño con implementacion
    public void recibirDamage(int damage) 
    {
        if (!defendiendo) 
        {
            this.HP -= damage;
            if (this.HP < 0) 
            {
                this.HP = 0;
            }
            System.out.println(nombre + " recibe " + damage + " daño recibido. HP restante :" + HP);
        } else {
            System.out.println(nombre + " se defendió y no recibe daño.");
            defendiendo = false;
        }    
    }
    
    // Metodo de validacion, para verificar que este vivo con implementacion
    public boolean estaVivo() 
    {
        return HP > 0;
    }
}
