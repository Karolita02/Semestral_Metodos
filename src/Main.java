import estimacionDeRaices.Biseccion;
import estimacionDeRaices.EstimacionDeRaices;
import estimacionDeRaices.NewtonRapson;
import estimacionDeRaices.ReglaFalsa;
import estimacionDeRaices.Secante;
import integracionNumerica.Simpson;
import integracionNumerica.Simpson1_3;
import integracionNumerica.Simpson3_8;
import integracionNumerica.Trapecio;
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

        // Biseccion.funcion = (x) -> (1 - 0.6*x) / x;
        // Biseccion.calcular(1.5, 2, 6); // a, b, cantidad de veces

        // ReglaFalsa.funcion = (x) -> -0.5*Math.pow(x, 2) + 2.5*x + 4;
        // ReglaFalsa.calcular(5, 9, 3); // a, b, cantidad de veces

        // Secante.funcion = (h) -> 3 * Math.PI * Math.pow(h, 2) - (Math.PI * Math.pow(h, 3)) / 3 - 30;
        // Secante.calcular(2.5, 3, 3); // apenas comenzo a mostrar NAN es q ya llego a la exacta okey

        // NewtonRapson.funcion = (x) -> Math.sin(Math.sqrt(x)) - x;
        // NewtonRapson.derivada = (x) -> (Math.cos(Math.sqrt(x))) / (2 * Math.sqrt(x)) - 1;
        // NewtonRapson.calcular(0.5,3); // el 3 es la cantidad de veces

        // ─── Interpolacion ───────────────────────────────────────────

        // lo mejore y ahora puedes ingresar la tabla de valores
        //? pero recuerda que para tener mayor precision en el resultado 
        //? debes ingresar solo los valores cercanos al numero que tas calculando

        
        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion
        
        // Lineal.x = new double[] {1,4};
        // Lineal.y = new double[] {0,1.3863};

        // // Lineal.funcion = (x) -> x*x;

        // Lineal.calcular(2); // solo se ingresa x osea el valor buscado

        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        // forma 1 de hacerlo
        // Newton.x = new double[] {1,4,6};
        // Newton.y = new double[] {0,1.38,1.79};

        // // Newton.funcion = (x) -> x*Math.pow(x,2); 

        // Newton.calcular(2);

        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        // Lagrange.x = new double[] {1,4,6};
        // Lagrange.y = new double[] {0,1.3863,1.7918};

        // // Lagrange.funcion = (x) -> x*Math.pow(x,2); 

        // Lagrange.calcular(2);

        // ─── Integrales ──────────────────────────────────────────────
        
        //! si te dan los valores de Y no asignes un valor a la funcion
        //* si te dan la funcion, no le asignes los valores de Y, el programa sabe calcular esos valores teniendo la funcion

        //! la A debe vale lo mismo q el primer valor de x
        //! la B debe valer lo mismo q el ultimo valor de x

        //? lo recomendable es usar solo 3 valores para X y para Y

        //* si le das la funcion no habran problemas en la ejecucion

        //* para simpson normal, no necesitas la N

        // Simpson.funcion = (x) -> 1 / (1 + Math.pow(x,2));

        // // Simpson.x = new double[] {0,1,2};
        // // Simpson.y = new double[] {0,2,3.5};
        // Simpson.a = 1;
        // Simpson.b = Math.sqrt(3);
        
        // Simpson.calcular();

        //? en caso de necesitarlo simpson1_3 tambien admite un array con los valores de X y Y
        //* si quieres, puedes ingresar los valores de N y de H a la vez, lo programe para q no de error ni sobre escriba los valores

        // Simpson1_3.x = new double[] {1,2,3};
        // Simpson1_3.y = new double[] {4,5,6};

        // Simpson1_3.funcion = (x) -> 1 / (1 + Math.pow(x,2));

        // Simpson1_3.a = 1;
        // Simpson1_3.b = Math.sqrt(3);
        // Simpson1_3.n = 6;
        // // Simpson1_3.h = 0.1;

        // Simpson1_3.calcular();

        //? en caso de necesitarlo simpson3_8 tambien admite un array con los valores de X y Y
        //* si quieres, puedes ingresar los valores de N y de H a la vez, lo programe para q no de error ni sobre escriba los valores

        // Simpson3_8.x = new double[] {1,2,3};
        // Simpson3_8.y = new double[] {4,5,6};

        // Simpson3_8.funcion = (x) -> 1 / (1 + Math.pow(x,2));

        // Simpson3_8.a = 1;
        // Simpson3_8.b = Math.sqrt(3);
        // Simpson3_8.n = 6;
        // // Simpson3_8.h = 0.1;

        // Simpson3_8.calcular();

        //? en caso de necesitarlo Trapecio tambien admite un array con los valores de X y Y
        //* si quieres, puedes ingresar los valores de N y de H a la vez, lo programe para q no de error ni sobre escriba los valores

        // Trapecio.x = new double[] {1,2,3};
        // Trapecio.y = new double[] {4,5,6};

        Trapecio.funcion = (x) -> 1 / (1 + Math.pow(x,2));

        Trapecio.a = 1;
        Trapecio.b = Math.sqrt(3);
        Trapecio.n = 6;
        // Trapecio.h = 0.1;

        Trapecio.calcular();
    }
}