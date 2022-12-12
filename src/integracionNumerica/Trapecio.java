package integracionNumerica;

public class Trapecio extends IntegracionNumerica{
    public static void calcular(){
        calcular_H_o_N();
        calcularValoresDeX();
        calcularValoresDeY();
        System.out.println("             b - a      ( f(a) + f(b)                 (         b - a ))");
        System.out.println("Resultado = -------  *  (-------------  +  Sumatoria f(a + k * -------))");
        System.out.println("               n        (      2                      (           n   ))");
        var resultado = h * ((y[0] + y[n]) / 2 + sumatoria());
        System.out.println("n = " + n);
        System.out.println("h = " + h);
        System.out.println("f(a) = " + y[0]);
        System.out.println("f(b) = " + y[n]);
        System.out.println("Resultado = " + resultado);
    }

    private static double sumatoria(){
        double suma = 0;
        String valores = "";
        String formula = "";
        String remplazada = "";
        for (int i = 1 ; i < n ; i++){
            suma += y[i];
            formula += "f(a + k * ((b - a) / n))";
            remplazada += String.format("f(%s + %s * ((%s - %s) / %s))", a, i, b, a, n);
            valores += y[i];
            if(i != n - 1){
                formula += " + ";
                remplazada += " + ";
                valores += " + ";
            }
        }
        // si es multiplo de 3  o no son multiplos de 3, procedemos normal  // sino 0 
        System.out.println("Sumatoria f(a + k * ((b - a) / n)) = " + formula);
        System.out.println("Sumatoria f(a + k * ((b - a) / n)) = " + remplazada);
        System.out.println("Sumatoria f(a + k * ((b - a) / n)) = " + valores);
        return suma;
    }
}
