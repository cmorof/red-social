import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaComentarios
{
    private String urlImagen;
    private String titulo;

    public EntradaFoto(String url, String titulo, String autor)
    {
        super(autor);
        this.titulo = titulo;
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
        
        textoADevolver = super.toString();
        
        textoADevolver += "<p class=\"terceralinea\">" + titulo + "</p>";
        textoADevolver += "<p>" + urlImagen + "</p>";
        
        return textoADevolver;
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 5;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("La imagen cuyo título es" + titulo + "y su dirección url" + urlImagen);
    }
}
