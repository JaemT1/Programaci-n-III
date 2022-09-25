package co.uniquindio.edu.programacionIII.recursividad;

public class Apariciones {
    public static void main(String[] args) {
        int[]numeros = {1,2,5,5,1,5,6,7,5,5};
        int inicio = 0;
        int fin = numeros.length;
        int numeroABuscar = 5;
        System.out.println(contarApariciones(numeros, inicio, fin, numeroABuscar));
    }
    
    public static int contarApariciones(int[]arreglo, int inicio, int fin, int numeroABuscar){        
        int apariciones = 0;
        if (inicio < fin) {
            if (numeroABuscar == arreglo[inicio]) {
                apariciones+=1;
            }
            return apariciones + contarApariciones(arreglo, inicio+1, fin, numeroABuscar);
        }
        return apariciones;
    }
}
