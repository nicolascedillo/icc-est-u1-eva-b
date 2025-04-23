package Views;

import Models.*;
import Controllers.*;

public class ViewConsole {
    
    public void mostrarArreglo(Book[] libros){
        System.out.println("Lista de libros: ");
        for (Book b: libros){
            System.out.println(b);
        }
    }

    public void mostrarBusqueda(Book[] libros, String libroABuscar){
        showMessage("----Busqueda-----");
        showMessage("Libro a buscar: " + libroABuscar);
        BookController bookController = new BookController();
        Book busqueda = bookController.searchByName(libros, libroABuscar);
        if (busqueda != null){
            showMessage("Se encontro libro con título: " + busqueda.getName());
            System.out.println(busqueda);
        } else{
            showMessage("No se encontró libro con ese título.");
        }
    }

    public void showMessage (String message){
        System.out.println(message);
    }
}
