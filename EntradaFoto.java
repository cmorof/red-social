import java.time.LocalDateTime;
import java.util.ArrayList;

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
        
    }
    
    public void addComentario(String texto)
    {
    
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
        
        return textoADevolver;
    }
}
