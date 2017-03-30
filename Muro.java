import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.io.IOException;

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
    
    public void mostrarMuroEnNavegador()
    {
        Path rutaArchivo = Paths.get("C:/Users/alumno/Desktop/Carlos/red-social/output.html");

        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html><head><link rel=stylesheet href=\"estilos.css\" type=\"text/css\"></head><h1>Entradas del muro</h1></head><body>");
            for(int i = 0; i < entradas.size(); i++)
            {                
                archivo.write("<fieldset>");
                archivo.write(entradas.get(i).toString());
                archivo.write("</fieldset>");
            }
            archivo.write("</body></html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            System.out.println(excepcion.toString());
        }
    }
}
