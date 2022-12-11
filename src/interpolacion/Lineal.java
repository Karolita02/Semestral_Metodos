package interpolacion;

/**
 * Lineal
 */
public class Lineal extends Interpolacion {

    public static void calcular(double x_buscada){
        calcularValoresDeY();
        /**
                                  (y1-y0)
            y(x) = y0 + (x-x0) * ---------
                                  (x1-x0)
         */
        var y_buscada = y[0] + (x_buscada - x[0]) * (y[1]-y[0]) / (x[1] - x[0]);

        var central = String.format("y(%s) = y0 + (x - x0) *", x_buscada); 

        System.out.printf("%s  (y1 - y0)\n", " ".repeat(central.length()));
        System.out.printf("y(%s) = y0 + (x - x0) * -----------\n", x_buscada);
        System.out.printf("%s  (x1 - x0)\n", " ".repeat(central.length()));

        var superior = String.format("(%s - %s)", y[1], y[0]);
        central = String.format("y(%s) = %s + (%s - %s) *", x_buscada, y[0], x_buscada, x[0]); 
        var inferior = String.format("(%s - %s)", x[1], x[0]);

        System.out.printf("%s  %s\n", " ".repeat(central.length()), superior);
        System.out.printf("%s %s\n", central, "-".repeat(2 + Math.max(superior.length(), inferior.length())));
        System.out.printf("%s  %s\n", " ".repeat(central.length()), inferior);
        System.out.printf("y(%s) = %s\n", x_buscada, y_buscada);
    }
}