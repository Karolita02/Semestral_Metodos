package estimacionDeRaices;


/**
 * Biseccion
 */
public class Biseccion extends EstimacionDeRaices {
  
    // public static double
    // mira si nitamos saber si ta en el intervalo nama iriamos al main
    // ven sigueme

    public static void calcular(double a, double b, int cantidadDeVeces){
        if(!estaEnElIntervalo(a,b)){
            System.out.println("En este intervalo no hay solucion\n");
            return;
        }
        System.out.println();
        for (int i = 0; i < cantidadDeVeces; i++) {
            var x = (a + b) / 2;
            System.out.println("Calculando nos da x = " + x);
            if (estaEnElIntervalo(a, x)){
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