package estimacionDeRaices;

/**
 * Secante
 */
public class Secante extends EstimacionDeRaices{

    public static void calcular(double xi_anterior, double xi, int cantidadDeVeces){
        // xi_anterior = xi-1 // se entiende? q es el x sub i -1
        // xi = x0
        for (int i = 0; i < cantidadDeVeces; i++) {
            //               f(xi) * ((xi-1)-xi)
            // xi+1 = xi -  ---------------------
            //                 f(xi-1)-f(xi)
            System.out.println("              f(xi) * ((xi-1)-xi)");
            System.out.println("xi+1 = xi -  ---------------------");
            System.out.println("                 f(xi-1)-f(xi)");
            var xi_nuevo = xi - (funcion.evaluar(xi) * (xi_anterior - xi)) / (funcion.evaluar(xi_anterior) - funcion.evaluar(xi));//formula
            System.out.println("Calculando nos da xi+1 = " + xi_nuevo);

            System.out.println("Se Cambia el xi-1");
            System.out.println("xi-1 = xi");
            System.out.println("xi-1 = " + xi);
            xi_anterior = xi;

            System.out.println("Se Cambia el xi");
            System.out.println("xi = xi+1");
            System.out.println("xi = " + xi_nuevo);
            xi = xi_nuevo;

            System.out.println();
        }
    }
}