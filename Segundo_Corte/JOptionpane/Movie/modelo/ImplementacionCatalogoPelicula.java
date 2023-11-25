package movie.modelo;

import java.util.*;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas {
    private final ArrayList<String> listaPeliculas;
    
    public ImplementacionCatalogoPelicula() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }
    
    public void listarPelicula() {
        
        JOptionPane.showMessageDialog(
                null,
                this.listaPeliculas,
                "Lista de peliculas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;
        for (var pelicula : this.listaPeliculas) {
            if (pelicula.equals(nombrePelicula)) {
                resultado = pelicula;
                break;
            } else {
                resultado = pelicula;
            }
        }
        if (nombrePelicula.equals(resultado)) {
                 JOptionPane.showMessageDialog(
                    null,
                    "Resultado ->" + resultado,
                    "Buscar pelicula",
                    JOptionPane.QUESTION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontro la Pelicula ->" + nombrePelicula,
                    "Buscar pelicula",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}