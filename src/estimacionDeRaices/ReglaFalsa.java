package estimacionDeRaices;


/**
 * ReglaFalsa
 */
public class ReglaFalsa extends EstimacionDeRaices {

    public static void calcular(double a, double b, int cantidadDeVeces){
        System.out.println("Comprobando si esta en el intervalo");
        if(!estaEnElIntervalo(a,b)){
            System.out.println("No esta en el Intervalo\n");
            return;
        }
        System.out.println("Esta en el Intervalo\n");
        System.out.println();

        for (int i = 0; i < cantidadDeVeces; i++) {
            //           f(b) * (a-b)
            // x = b -  --------------
            //            f(a)-f(b)
            var x = b - (funcion.evaluar(b) * (a-b)) / (funcion.evaluar(a) - funcion.evaluar(b));//formula
            System.out.println("         f(b) * (a-b)");
            System.out.println("x = b - --------------");
            System.out.println("          f(a) - f(b)");
            System.out.println("Calculando nos da x = " + x);
            if(estaEnElIntervalo(a,x)){
                System.out.println("Se Cambia la b, vamos por la izquierda");
                System.out.println("b = x");
                System.out.println("b = " + x);
                b = x;
            }
            else{
                System.out.println("Se Cambia la a, vamos por la derecha");
                System.out.println("a = x");
                System.out.println("a = " + x);
                a = x;
            }
            System.out.println();
        }
    }
}