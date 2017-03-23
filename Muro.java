import java.util.ArrayList;

public class Muro
{
    private ArrayList<Entrada> entradas;
    
    public Muro()
    {
        entradas = new ArrayList<>();
    }
    
    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }
    
    public String toString()
    {
        String cadenaADevolver = null;
        
        for (Entrada entrada : entradas)
        {
            cadenaADevolver += entrada + "\n";
        }
        
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public void verCantidadDatosPorEntrada()
    {
        for  (Entrada entrada : entradas)
        {
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }
    
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String autor)
    {        
        for (Entrada entrada : entradas)
        {
            if (entrada.getClass().getSimpleName() == tipoEntrada && entrada.getUsuario() == autor)
            {
                if (entrada instanceof EntradaTexto)
                {
                    ((EntradaTexto)entrada).mostrarDatosExclusivos();
                }
                
                if (entrada instanceof EntradaFoto)
                {
                    ((EntradaFoto)entrada).mostrarDatosExclusivos();
                }
                
                if (entrada instanceof EntradaUnionAGrupo)
                {
                    ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                }
            }
            
        }
    }
}
