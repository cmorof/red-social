import java.util.ArrayList;

public class Muro
{
    private ArrayList<Entrada> entradas;
    
    public Muro()
    {
        entradas = new ArrayList<>();
    }
    
    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }
    
    public String toString()
    {
        String cadenaADevolver = null;
        
        for (Entrada entrada : entradas)
        {
            cadenaADevolver += entrada + "\n";
        }
        
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
}
