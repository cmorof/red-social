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
        
        textoADevolver = super.toString();
        
        textoADevolver += mensaje + "\n";
        
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 5;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("El mensaje es el siguiente:\n" + mensaje);
    }
}
