package interpolacion;

public class Lagrange extends Interpolacion{

    public static double[] L;

    public static void calcular(double x_buscada){
        calcularValoresDeY();
        calcularValoresDeL(x_buscada);
        String formula = "";
        String remplazada = "";
        double y_buscada = 0;
        for (int i = 0; i < y.length; i++) {
            y_buscada += (y[i] * L[i]);
            formula += String.format("y%d * L%d(%s)", i, i, x_buscada);
            remplazada += String.format("%s * %s", y[i], L[i]);
            if(i == y.length -1) break;
            formula += " + ";
            remplazada += " + ";
        }

        System.out.printf("y(%s) = %s\n", x_buscada, formula);
        System.out.printf("y(%s) = %s\n", x_buscada, remplazada);
        System.out.printf("y(%s) = %s\n", x_buscada, y_buscada);
    }

    private static void calcularValoresDeL(double x_buscada){
        L = new double[x.length];
        for (int j = 0; j < L.length; j++) {
            String superiorFormula = "";
            String inferiorFormula = "";
            String superiorRemplazada = "";
            String inferiorRemplazada = "";
            L[j] = 1;
            for (int i = 0; i < L.length; i++) {
                if(i == j) continue;
                L[j] *= (x_buscada - x[i]) / (x[j] - x[i]);
                superiorFormula += String.format("(x - x%d) \t", i);
                inferiorFormula += String.format("(x%d - x%d) \t", j, i);
                superiorRemplazada += String.format("(%s - %s) \t", x_buscada, x[i]);
                inferiorRemplazada += String.format("(%s - %s) \t", x[j], x[i]);
            }
            var Li = String.format("L%d(%s) = ", j, x_buscada);
            System.out.println(" ".repeat(1 + Li.length()) + superiorFormula);
            System.out.println(Li + "-".repeat(2 + Math.max(superiorFormula.trim().length(), inferiorFormula.trim().length())));
            System.out.println(" ".repeat(1 + Li.length()) + inferiorFormula);

            System.out.println(" ".repeat(1 + Li.length()) + superiorRemplazada);
            System.out.println(Li + "-".repeat(2 + Math.max(superiorRemplazada.trim().length(), inferiorRemplazada.trim().length())));
            System.out.println(" ".repeat(1 + Li.length()) + inferiorRemplazada);

            System.out.println(Li + L[j]);

            System.out.println();
        }
    }
}
