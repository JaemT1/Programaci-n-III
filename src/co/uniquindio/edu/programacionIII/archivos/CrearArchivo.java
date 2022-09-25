package co.uniquindio.edu.programacionIII.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JaemT1
 */
public class CrearArchivo {

    public static void main(String[] args) {
        String contenido = "Singleton";
        String nombreArchivo = "PrincipiosSolid";
        crearArchivo(contenido, nombreArchivo);
    }
    /**
     * Crea un archivo .txt en la ruta especificada y escribe el contenido mandado por parámetro
     * @param contenido String a escribir en el archivo
     * @param nombreArchivo Nombre del archivo a crear
     */
    public static void crearArchivo(String contenido, String nombreArchivo) {
        try {
            String ruta = "C:\\Users\\JaemT1\\archivos\\" + nombreArchivo;
            File file = new File(ruta);

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            } else {
                System.out.println("Puede que el archivo ya exista");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
