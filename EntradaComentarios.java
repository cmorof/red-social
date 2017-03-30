import java.util.ArrayList;

public class EntradaComentarios extends Entrada
{
    private ArrayList<String> comentarios;

    public EntradaComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }

    public ArrayList<String> getComentarios()
    {
        return comentarios;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public String toString()
    {
        String textoADevolver = "";
        
        textoADevolver = super.toString();
        
        if (getComentarios().isEmpty())
        {
            textoADevolver += "<p class=\"segundalinea\">La entrada no tiene comentarios</p>";
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
}
