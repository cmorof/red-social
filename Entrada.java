import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

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
        String textoADevolver = "";
        
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += getCantidadMeGusta() + "me gusta ";

        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0)
        {
            textoADevolver += minutosQueHanPasadoDesdeCreacion + "minutos";
        }
        textoADevolver += segundosResiduales + "segundos.\n";       
        
        return textoADevolver;
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    
    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 0;
    }
}
