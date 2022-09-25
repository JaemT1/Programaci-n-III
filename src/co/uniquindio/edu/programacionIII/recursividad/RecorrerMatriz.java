package co.uniquindio.edu.programacionIII.recursividad;

public class RecorrerMatriz {

    public static void main(String[] args) {
        int[][]matriz = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        recorrerMatriz(matriz, 0, 0);
    }
    
    /**
     * Método que permite recorrer una matriz recursivamente
     * @param matriz matriz a recorrer
     * @param i indice para las filas
     * @param j indice para las columnas
     */
    public static void recorrerMatriz(int[][] matriz, int i, int j) {
        if (matriz != null) {
            if (i < matriz.length) {
                if (j<matriz[i].length-1) {
                    System.out.println(matriz[i][j]);
                    recorrerMatriz(matriz, i, j+1);
                }else{
                    System.out.println(matriz[i][j]);
                    recorrerMatriz(matriz, i+1, 0);
                }
            }
        }
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
