package integracionNumerica;

public class Simpson extends IntegracionNumerica{

    public static void calcular() {
        calcularValoresDeX();
        calcularValoresDeY();
        double integral;
        if(funcion == null)
            integral = (b - a) / 6 * (y[0] + 4 * y[y.length/2] + y[y.length-1]);
        else
            integral = (b - a) / 6 * (funcion.evaluar(a) + 4 * funcion.evaluar((a + b) / 2) + funcion.evaluar(b));

        System.out.println("             b - a");
        System.out.println("Resultado = -------  *  (f(a) + 4 * f((a + b) / 2) + f(b))");
        System.out.println("               6");
        System.out.println("f(a) = " + funcion.evaluar(a));
        System.out.println("f((a + b) / 2) = " + funcion.evaluar((a + b) / 2));
        System.out.println("f(b) = " + funcion.evaluar(b));
        System.out.println("Resultado = " + integral);
    }    
}