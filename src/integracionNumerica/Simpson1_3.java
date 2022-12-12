package integracionNumerica;

public class Simpson1_3 extends IntegracionNumerica{

    public static void calcular() {
        calcular_H_o_N();
        calcularValoresDeX();
        calcularValoresDeY();
        System.out.println("              h");
        System.out.println("Resultado = ----- * (f(a) + 2 * Sumatoria Pares + 4 * Sumatoria Impares + f(b))");
        System.out.println("              3");
        var integral = h/3 * (y[0] + 2 * sumatoria(true) + 4 * sumatoria(false) + y[n]);
        System.out.println("n = " + n);
        System.out.println("h = " + h);
        System.out.println("f(a) = " + y[0]);
        System.out.println("f(b) = " + y[n]);
        System.out.println("Resultado = " + integral);
    }

    private static double sumatoria(boolean esDePares){
        double suma = 0;
        String valores = "";
        for (int i = esDePares ? 2 : 1; i < n; i += 2){
            suma += y[i];
            valores += y[i];
            if(esDePares && i != n - 2 || !esDePares && i != n - 1)
                valores += " + ";
        }
        System.out.println("Sumatoria " + (esDePares ? "Pares" : "Impares") + " = " + valores);
        System.out.println("Sumatoria " + (esDePares ? "Pares" : "Impares") + " = " + suma);
        return suma;
    }
}
