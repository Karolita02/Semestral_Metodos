package interpolacion;

import necesario.FuncionX;

/**
 * Newton
 */
public class Newton {
    public static FuncionX funcion;
    public static double[] x;
    public static double[] y;
    private static double[] b;

    public static void calcular(double x_buscada){
        calcularValoresDeY(); // solo se calcularan si le das un valor la funcion, sino se omite este paso
        calcularValoresDeB();
        double multiplicacion;
        double sumatoria = 0;
        String formula = "";
        String remplazada = "";
        for (int i = 0; i < x.length; i++){
            multiplicacion = 1;
            formula += "b" + i;
            remplazada += b[i];
            for (int j = 0; j <= i-1; j++) {
                multiplicacion *= (x_buscada - x[j]);
                formula += String.format("(x - x%d)", j);
                remplazada += String.format("(%s - %s)", x_buscada, x[j]);
            }
            sumatoria += (b[i] * multiplicacion);
            if(i == x.length - 1) break;
            formula += " + ";
            remplazada += " + ";
        }
        var y_buscada = sumatoria;

        System.out.printf("y(%s) = %s\n", x_buscada, formula);
        System.out.printf("y(%s) = %s\n", x_buscada, remplazada);
        System.out.printf("y(%s) = %s\n", x_buscada, y_buscada);
    }

    private static void calcularValoresDeB(){
        b = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            if(i == 0){
                b[0] = y[0];
                System.out.printf("b0 = y0\n");
                System.out.printf("b0 = %s\n", y[0]);
            }
            else if(i == 1){
                b[1] = (y[1] - y[0]) / (x[1] - x[0]);
                System.out.printf("     (y1 - y0)\n");
                System.out.printf("b1 = -------------\n");
                System.out.printf("     (x1 - x0)\n");
                System.out.printf("     (%s - %s)\n", y[1], y[0]);
                System.out.printf("b1 = -------------\n");
                System.out.printf("     (%s - %s)\n", x[1], x[0]);
                System.out.printf("b1 = %s\n", b[1]);
            }
            else{
                b[i] = (y[i] - y[i-1]) / (x[i] - x[i-1]);
                b[i] -= b[i-1];
                b[i] /= (x[i] - x[0]);
                System.out.printf("     (y%d - y%d)\n",i,i-1);
                System.out.printf("b2 = -------------  -  b%d\n",i-1);
                System.out.printf("     (x%d - x%d)\n",i,i-1);
                System.out.printf("     ------------------------\n");
                System.out.printf("            (x%d - x%d)\n",i,0);
                System.out.printf("     (%s - %s)\n", y[i], y[i-1]);
                System.out.printf("b2 = -------------  -  %s\n", b[i-1]);
                System.out.printf("     (%s - %s)\n", x[i], x[i-1]);
                System.out.printf("     ------------------------\n");
                System.out.printf("            (%s - %s)\n",x[i],x[0]);
                System.out.printf("b2 = %s\n", b[i]);
            }
        }
    }

    private static void calcularValoresDeY(){
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
        System.out.println("  x  |  y  ");
        for (int i = 0; i < x.length; i++) 
            System.out.printf("%-5.2f|%-5.2f", x[i], y[i]);
        
    }
}