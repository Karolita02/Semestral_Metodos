package interpolacion;

/**
 * Lineal
 */
public class Lineal {

    public static void calcular(double x, double x0, double y0, double x1, double y1){
        /**
                                  (y1-y0)
            y(x) = y0 + (x-x0) * ---------
                                  (x1-x0)
         */
        var y = y0 + (x-x0) * (y1-y0) / (x1-x0);
        System.out.printf("                         (y1 - y0)\n");
        System.out.printf("y(%s) = y0 + (x - x0) * ------------\n", x);
        System.out.printf("                         (x1 - x0)\n");
        System.out.printf("                             (%s - %s)\n",y1, y0);
        System.out.printf("y(%s) = %s + (%s - %s) * ------------\n", x, y0, x, x0);
        System.out.printf("                             (%s - %s)\n", x1, x0);
        System.out.printf("y(%s) = %s\n", x, y);
    }
}