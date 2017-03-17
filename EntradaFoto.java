import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaComentarios
{
    private String urlImagen;
    private String titulo;

    public EntradaFoto(String url, String titulo, String autor)
    {
        super(autor);
        titulo = titulo;
        urlImagen = url;
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloDeLaImagen()
    {
        return titulo;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += titulo + "\n";
        textoADevolver += urlImagen + "\n";
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
