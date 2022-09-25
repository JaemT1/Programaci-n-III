package co.uniquindio.edu.programacionIII.recursividad;

public class NumeroFila {
    public static void main(String[] args) {
        
    }
    
    public static int numeroFila(int[][]matriz, int i, int j){
        int fila = 0;
        int sumaAnterior = 0;
        int sumaActual = 0;
        
        if (matriz != null) {
            
            if (i < matriz.length) {
                if (j<matriz[i].length-1) {
                    sumaActual = matriz[i][j];
                    return sumaActual + numeroFila(matriz, i, j+1);
                }else{                   
                    
                }    
            }
        }
        return fila;
    }
            
}
