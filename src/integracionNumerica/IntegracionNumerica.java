package integracionNumerica;

import necesario.FuncionX;

public abstract class IntegracionNumerica {

    public static FuncionX funcion;

    public static double[] x;
    public static double[] y;

    public static double a, b, h;
    public static int n;

    static void calcular_H_o_N() {
        if(n != 0 && h != 0) return;
        if(n != 0)
            h = (b - a) / n;
        else
            n = (int)((b - a) / h);
    }

    static void calcularValoresDeX() {
        if(x != null || n == 0) return;
        x = new double[n+1];
        for (double i = 0, valor = a; i < x.length; i++, valor += h) 
            x[(int)i] = valor;
    } 

    static void calcularValoresDeY() {
        if(n == 0) return;
        if(funcion == null) {
            mostrarTabla(x, y);
            return;
        }
        y = new double[n+1];
        System.out.println("Tabla Generada");
        for (int i = 0; i < y.length; i++) 
            y[i] = funcion.evaluar(x[i]);
        mostrarTabla(x, y);
    } 

    private static void mostrarTabla(double[] x, double[] y){
        System.out.println(" n ||  x  ||  y  ");
        for (int i = 0; i < x.length; i++) 
            System.out.printf("%2d || %s || %s\n", i, x[i], y[i]);
        System.out.println();
    }
}