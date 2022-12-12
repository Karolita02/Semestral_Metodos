package estimacionDeRaices;

import necesario.FuncionX;

/**
 * EstimacionDeRaices
 */
public class EstimacionDeRaices {

    public static FuncionX funcion;

    static boolean estaEnElIntervalo(double a, double b){
        System.out.printf("f(%s) * f(%s)\n",a,b);
        System.out.println(funcion.evaluar(a) + " * " + funcion.evaluar(b));
        var respuesta = funcion.evaluar(a) * funcion.evaluar(b) < 0; // si es negativo ta en el intervalo
        System.out.println(respuesta ? "Es Negativo" : "Es Positivo");
        return respuesta;
    }
}