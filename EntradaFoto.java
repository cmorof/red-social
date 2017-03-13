import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    public EntradaFoto(String usuario, String url, String titulo)
    {
        this.usuario = usuario;
        this.titulo = titulo;
        urlImagen = url;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<String>();
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloDeLaImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        textoADevolver += "Usuario: " + usuario;
        textoADevolver += titulo + "\n";
        textoADevolver += urlImagen + "\n";
        textoADevolver += cantidadMeGusta + "me gusta";

        long segundosQueHanPasadoDesdeCreacion = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0)
        {
            textoADevolver = minutosQueHanPasadoDesdeCreacion + "minutos";
        }
        textoADevolver += segundosResiduales + "segundos.\n";
        
        if (comentarios.isEmpty())
        {
            textoADevolver += "La entrada no tiene comentarios";
        }
        else
        {
            textoADevolver += "Comentarios:\n";
            for (String comentario : comentarios)
            {
                textoADevolver += comentario + "\n";
            }
        }
        
        return textoADevolver;
    }
}
