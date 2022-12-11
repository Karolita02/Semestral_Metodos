import estimacionDeRaices.Biseccion;
import estimacionDeRaices.NewtonRapson;
import estimacionDeRaices.ReglaFalsa;
import estimacionDeRaices.Secante;
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

       // Lineal.calcular(2, 1, 0, 4, 1.3863); // x = el valor buscado, x0, y0, x1, y1   
        // ven cosita por eso tenemos los comentarios >< alli yo te los puse en el orden en q se tienen q pone ><

        // forma 1 de hacerlo
        // Newton.x = new double[] {1,4,6};
        // Newton.y = new double[] {0,1.38,1.79};

        // forma 2 de hacerlo
        double[] _x = {1,4,6,8};
        double[] _y = {0,1.3863,1.7918,1.78234};
        Newton.x = _x;
        Newton.y = _y;

        // // Newton.funcion = (x) -> x*Math.pow(x,2);  // si dan la funcion puedes asignarle la funcion y el coso calculara los valores de Y
        // // pero si te dan los valores de Y no nitas asignarle la funcion

        Newton.calcular(2);
       
    }
}