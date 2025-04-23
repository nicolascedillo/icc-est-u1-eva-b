package Controllers;

import Models.*;

public class BookController {
    
    public void sortByName(Book[] libros){
        int n = libros.length;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-1-i; j++){
                if(libros[j].getName().compareTo(libros[j+1].getName()) < 0){
                    Book temp = libros[j];
                    libros[j] = libros[j+1];
                    libros[j+1] = temp;
                }
            }
        }
    }

    public Book searchByName(Book[] libros, String name){
        int bajo = 0;
        int alto = libros.length -1;
        while (bajo<=alto) {
            int central = bajo + (alto-bajo)/2;
            if (libros[central].getName().toLowerCase().compareTo(name) == 0){
                return libros[central];
            }

            if (libros[central].getName().toLowerCase().compareTo(name) > 0){
                bajo = central +1;
            } else{
                alto = central -1;
            }
        }
        return null;
    }
}
