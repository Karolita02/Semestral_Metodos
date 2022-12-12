package integracionNumerica;

public class Simpson3_8 extends IntegracionNumerica{

    public static void calcular() {
        calcular_H_o_N();
        calcularValoresDeX();
        calcularValoresDeY();
        System.out.println("             3 * h");
        System.out.println("Resultado = ------- * (f(a) + 2 * Sumatoria MultiplosDe3 + 3 * Sumatoria Resto + f(b))");
        System.out.println("               8");
        var integral =  3 * h / 8 * (y[0] + 2 * sumatoria(true) + 3 * sumatoria(false) + y[n]);
        System.out.println("n = " + n);
        System.out.println("h = " + h);
        System.out.println("f(a) = " + y[0]);
        System.out.println("f(b) = " + y[n]);
        System.out.println("Resultado = " + integral);
    }

    private static double sumatoria(boolean esDeMultiplo3){
        double suma = 0;
        String valores = "";
        for (int i = esDeMultiplo3 ? 3 : 1; i < n ; i += esDeMultiplo3 ? 3 : 1){
            if(esDeMultiplo3 || i % 3 != 0){
                suma += y[i];
                valores += y[i];
                if(esDeMultiplo3 && i != n - 3 + n % 3 || !esDeMultiplo3 && i != n - 1)
                    valores += " + ";
            }
        }
        // si es multiplo de 3  o no son multiplos de 3, procedemos normal  // sino 0 
        System.out.println("Sumatoria " + (esDeMultiplo3 ? "MultiploDe3" : "Resto") + " = " + valores);
        System.out.println("Sumatoria " + (esDeMultiplo3 ? "MultiploDe3" : "Resto") + " = " + suma);
        return suma;
    }
}