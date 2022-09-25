package co.uniquindio.edu.programacionIII.archivos;

import java.io.File;

/**
 *
 * @author JaemT1
 */
public class CrearDirectorio {
    public static void main(String[] args) {
        String nombreDirectorio = "Recursividad";
        crearDirectorio(nombreDirectorio);
    }
    
    /**
     * Crea un directorio en la ruta especificada con un nombre especifico
     * @param nombreDirectorio Nombred del directorio a crear
     */
    public static void crearDirectorio(String nombreDirectorio){
        File directorio = new File("C:\\Users\\JaemT1\\archivos\\" + nombreDirectorio);
        
        //Verifica si el directorio existe
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}
