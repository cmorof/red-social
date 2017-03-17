import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;

    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        textoADevolver += "El usuario: " + getUsuario();
        textoADevolver += "se ha unido al grupo " + grupo + "\n";
        
        
        textoADevolver += getcantidadMeGusta() + "me gusta";

        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0)
        {
            textoADevolver = minutosQueHanPasadoDesdeCreacion + "minutos";
        }
        textoADevolver += segundosResiduales + "segundos.\n";
        
        return textoADevolver;
    }
    
    public void mostrar()
    {
    
    }
}
