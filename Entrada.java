import java.time.LocalDateTime;
import java.util.ArrayList;

public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta; 

    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public String toString()
    {
        return "";
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    
    public int getcantidadMeGusta()
    {
        return cantidadMeGusta;
    }
    
    public void mostrar()
    {
        
    }
}
