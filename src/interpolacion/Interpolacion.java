package interpolacion;

import necesario.FuncionX;

public class Interpolacion {

    public static FuncionX funcion;

    public static double[] x;
    public static double[] y;

    static void calcularValoresDeY(){
        if (funcion == null) {
            mostrarTabla(x,y);
            return;
        } 
            
        y = new double[x.length];
        System.out.println("Tabla Generada");
        for (int i = 0; i < x.length; i++) 
            y[i] = funcion.evaluar(x[i]);
        mostrarTabla(x, y);
    }

    private static void mostrarTabla(double[] x, double[] y){
        System.out.println("  x  ||  y  ");
        for (int i = 0; i < x.length; i++) 
            System.out.printf("%s || %s\n", x[i], y[i]);
        System.out.println();
    }
}
