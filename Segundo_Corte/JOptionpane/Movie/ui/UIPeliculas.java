package movie.ui;

import movie.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
     public static void interfazUsuario() {
         ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
         Pelicula pelicula;
         CERRAR:
         while (true) {
             String opcion = JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar Pelicula\n"
                    + "2 - Lista de Peliculas\n"
                    + "3 - Buscar Pelicula\n"
                    + "4 - Salir",
                    "Ingrese una opción",
                    3
             );
             switch (opcion) {
                case "1":
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese nombre de la pelicula ",
                            "Entrada",
                            3
                    );
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                    case "2":
                    peliculas.listarPelicula();
                    break;
                    case "3":
                    nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese nombre de la pelicula",
                            "Ingrese",
                            3
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                    case "4":
                    break CERRAR;
                  default:
                    JOptionPane.showMessageDialog(null,
                            "OPCIÓN INCORRECTA\n"
                            + "Vuelve a ingresar una \n"
                            + "OPCIÓN CORRECTA\n"
                            + "Las opciones son de 1 a 4",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}