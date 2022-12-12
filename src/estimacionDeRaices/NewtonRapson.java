package estimacionDeRaices;

import necesario.FuncionX;

/**
 * NewtonRapson
 */
public class NewtonRapson extends EstimacionDeRaices {

    public static FuncionX derivada;

    public static void calcular(double xi, int cantidadDeVeces){
        for (int i = 0; i < cantidadDeVeces; i++) {
            //                  f(xi)
            // xi+1 = xi -  --------------
            //                  f'(xi)
            System.out.println("              f(xi)");
            System.out.println("xi+1 = xi - ----------");
            System.out.println("              f'(xi)");
            var xi_1 = xi - funcion.evaluar(xi) / derivada.evaluar(xi); //formula
            System.out.println("Calculando nos da xi+1 = " + xi_1);      
            System.out.println("Se Cambia el xi");
            System.out.println("xi = xi+1");
            System.out.println("xi = " + xi_1);
            xi = xi_1;  
            System.out.println();
        }
    }
}