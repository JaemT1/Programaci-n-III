package co.uniquindio.edu.programacionIII.recursividad;

/**
 *
 * @author Juan Tunubala y Juan Emanuel Rodríguez
 */
public class Parcial1 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        imprimirMatriz(transpuesta(matriz, matrizTranspuesta, 0, 0));
    }

    //Punto 2
    /**
     * Método que permite transponer una matriz de nxn
     *
     * @param matriz Matriz a transponer
     * @param matrizTranspuesta Matriz resultante
     * @param i Indice para las filas
     * @param j Indice para las columnas
     * @return Retorna la matriz ya transpuesta
     */
    public static int[][] transpuesta(int[][] matriz, int[][] matrizTranspuesta, int i, int j) {
        int filas = matriz.length;
        int columnas = matriz[i].length;

        if (j >= columnas) {
            j = 0;
            i++;
        }

        if (i >= filas) {
            return matrizTranspuesta;
        }

        matrizTranspuesta[j][i] = matriz[i][j];
        return transpuesta(matriz, matrizTranspuesta, i, j + 1);

    }
    
    
     /**
     * Método que imprime una matriz de enteros
     * @param matriz 
     */
    public static void imprimirMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + "\t");
            }
            System.out.println("");
        }
    }

}
