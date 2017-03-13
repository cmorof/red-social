import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaTexto
{
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    
    public EntradaTexto(String usuario, String mensaje)
    {
        this.usuario = usuario;
        this.mensaje = mensaje;
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
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        textoADevolver += "Usuario: " + usuario;
        textoADevolver += mensaje + "\n";
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
