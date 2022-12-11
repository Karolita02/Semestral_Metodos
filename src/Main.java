import estimacionDeRaices.Biseccion;
import estimacionDeRaices.EstimacionDeRaices;
import estimacionDeRaices.NewtonRapson;
import estimacionDeRaices.ReglaFalsa;
import estimacionDeRaices.Secante;
import interpolacion.Lagrange;
import interpolacion.Lineal;
import interpolacion.Newton;

/**
 * Main
 */
public class Main 
{
    /**
        raiz                -> Math.sqrt(numero)
        elevar al cuadrado  -> Math.pow(numero, 2)
        seno                -> Math.sin(numero)
        coseno              -> Math.cos(numero)

     */
     
    public static void main(String[] args) 
    {
        // ─── Estimacion De Raices ────────────────────────────────────

        //Biseccion.funcion = (x) -> x+2;
        // Biseccion.estaEnElIntervalo(-23, 45);
        // Biseccion.calcular(-10, 10, 1);

        // ReglaFalsa.funcion = (x) -> x+2;
        // ReglaFalsa.calcular(-10, 10, 5); // a, b, cantidad de veces

        // Secante.funcion = (x) -> x+2;
        // Secante.calcular(-10, 10, 5); // apenas comenzo a mostrar NAN es q ya llego a la exacta okey

        // NewtonRapson.funcion = (x) -> x+2;
        // NewtonRapson.derivada = (x) -> 1;
        // NewtonRapson.calcular(10,3); // el 3 es la cantidad de veces

        // ─── Interpolacion ───────────────────────────────────────────

        // lo mejore y ahora puedes ingresar la tabla de valores
        // pero recuerda que para tener mayor precision en el resultado 
        // debes ingresar solo los valores cercanos al numero que tas calculando

        
        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        // double[] _x = {1,4};
        // double[] _y = {0,1.3863};
        
        // Lineal.x = _x;
        // Lineal.y = _y;

        // // Lineal.funcion = (x) -> x*x;

        // Lineal.calcular(2); // solo se ingresa x osea el valor buscado
        // ven cosita por eso tenemos los comentarios >< alli yo te los puse en el orden en q se tienen q pone ><

        // forma 1 de hacerlo
        // Newton.x = new double[] {1,4,6};
        // Newton.y = new double[] {0,1.38,1.79};

        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        // forma 2 de hacerlo
        // double[] _x = {1,4,6};
        // double[] _y = {0,1.3863,1.7918};

        // Newton.x = _x;
        // Newton.y = _y;

        // Newton.funcion = (x) -> x*Math.pow(x,2); 

        // Newton.calcular(2);

        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        // double[] _x = {1,4,6};
        // double[] _y = {0,1.3863,1.7918};

        // Lagrange.x = _x;
        // Lagrange.y = _y;

        // // Lagrange.funcion = (x) -> x*Math.pow(x,2); 

        // Lagrange.calcular(2);
        
        

    }
}