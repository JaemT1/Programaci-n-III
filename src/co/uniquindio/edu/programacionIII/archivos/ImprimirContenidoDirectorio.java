package co.uniquindio.edu.programacionIII.archivos;

import java.io.File;

/**
 *
 * @author JaemT1
 */
public class ImprimirContenidoDirectorio {
    public static void main(String[] args) {
        int indice = 0;
        String ruta = "C:\\JavaFX";
        listarContenidoDirectorio(ruta, indice);
    }
    
    public static void listarContenidoDirectorio(String ruta, int indice){
        File archivo = new File(ruta);
        
        //Lista el contenido del directorio especificado
        File contenido[] = archivo.listFiles();
        
        //Caso base
        if (indice <= contenido.length-1) {
            //Verifica si el elemento en la posición indice es directorio
            if (contenido[indice].isDirectory()) {
                String path = contenido[indice].getAbsolutePath();
                System.out.println("Dentro del directorio: " + path);
                listarContenidoDirectorio(path, 0);
            }else{
                System.out.println("Archivo: " + contenido[indice].getName());
            }          
            listarContenidoDirectorio(ruta, indice+1); 
        }       
    }
}

