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
        String textoADevolver = "";
        
        textoADevolver += super.toString();
        
        textoADevolver += "se ha unido al grupo " + grupo + "\n";

        
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 4;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("Se ha unido al grupo" + grupo);
    }
}
