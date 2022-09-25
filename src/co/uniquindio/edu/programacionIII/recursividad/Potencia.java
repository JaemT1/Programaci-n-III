package co.uniquindio.edu.programacionIII.recursividad;

public class Potencia {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        System.out.println(calcularPotencia(base, exponente));
    }
    
    private static int calcularPotencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) { //calculamos las potencias con exponente negativo
            return calcularPotencia(base, exponente+1) / base;
        } else {
            return base * calcularPotencia(base, exponente-1);
        }
    }
}
