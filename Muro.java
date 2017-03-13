import java.util.ArrayList;

public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }
    
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    public String toString()
    {
        String cadenaADevolver = null;
        
        for (EntradaTexto entrada : mensajes)
        {
            cadenaADevolver += entrada + "\n";
        }
        
        for (EntradaFoto entrada : fotos)
        {
            cadenaADevolver += entrada + "\n";
        }
        
        return cadenaADevolver;
    }
}
