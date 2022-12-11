package estimacionDeRaices;


/**
 * ReglaFalsa
 */
public class ReglaFalsa extends EstimacionDeRaices {

    public static void calcular(double a, double b, int cantidadDeVeces){
        if(!estaEnElIntervalo(a,b)){
            System.out.println("En este intervalo no hay solucion\n");
            return;
        }
        System.out.println();

        for (int i = 0; i < cantidadDeVeces; i++) {
            //           f(b) * (a-b)
            // x = b -  --------------
            //            f(a)-f(b)
            var x = b - (funcion.evaluar(b) * (a-b)) / (funcion.evaluar(a) - funcion.evaluar(b));//formula
            System.out.println("Calculando nos da x = " + x);
            if(estaEnElIntervalo(a,x)){
                System.out.println("Se Cambia la b");
                System.out.println("b = x");
                System.out.println("b = " + x);
                b = x;
            }
            else{
                System.out.println("Se Cambia la a");
                System.out.println("a = x");
                System.out.println("a = " + x);
                a = x;
            }
            System.out.println();
        }
    }
}