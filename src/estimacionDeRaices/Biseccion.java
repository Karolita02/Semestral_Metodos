package estimacionDeRaices;


/**
 * Biseccion
 */
public class Biseccion extends EstimacionDeRaices {
  
    // public static double
    // mira si nitamos saber si ta en el intervalo nama iriamos al main
    // ven sigueme

    public static void calcular(double a, double b, int cantidadDeVeces){
        System.out.println("Comprobando si esta en el intervalo");
        if(!estaEnElIntervalo(a,b)){
            System.out.println("No esta en el Intervalo\n");
            return;
        }
        System.out.println("Esta en el Intervalo\n");
        System.out.println();
        for (int i = 0; i < cantidadDeVeces; i++) {
            var x = (a + b) / 2;
            System.out.println("Calculando x = (a + b) / 2 nos da x = " + x);
            if (estaEnElIntervalo(a, x)){
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