import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaTexto extends EntradaComentarios
{
    private String mensaje;
    
    public EntradaTexto(String texto, String autor)
    {
        super(autor);
        mensaje = texto;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += mensaje + "\n";
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
        
        if (getComentarios().isEmpty())
        {
            textoADevolver += "La entrada no tiene comentarios";
        }
        else
        {
            textoADevolver += "Comentarios:\n";
            for (String comentario : getComentarios())
            {
                textoADevolver += comentario + "\n";
            }
        }
        
        return textoADevolver;
    }
    
        public void mostrar()
    {
    
    }
}
