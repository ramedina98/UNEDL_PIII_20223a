/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoParcial;

/**
 *
 * @author ricardomedina
 */
import java.util.Scanner;
import java.util.function.Function;

public class IvanBiseccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ecuación en términos de x (grado máximo 6): ");
        String ecuacion = scanner.nextLine();

        System.out.print("Ingrese el límite inferior del intervalo (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el límite superior del intervalo (b): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de error deseado: ");
        double porcentajeError = scanner.nextDouble();

        System.out.print("Ingrese el número de decimales para redondear el resultado: ");
        int numDecimales = scanner.nextInt();

        metodoBiseccion(ecuacion, a, b, porcentajeError, numDecimales);
    }

    public static void metodoBiseccion(String ecuacion, double a, double b, double porcentajeError, int numDecimales) {
        Function<Double, Double> funcion;
        funcion = x -> {
            // Aquí se define la función f(x) proporcionada por el usuario
            // Utiliza la biblioteca adecuada para evaluar la expresión
            // Asegúrate de manejar adecuadamente las excepciones en caso de errores de evaluación
            // Ejemplo básico utilizando la biblioteca JEP (Java Expression Parser):
            try {
                org.nfunk.jep.JEP jep = new org.nfunk.jep.JEP();
                jep.addVariable("x", x);
                jep.parseExpression(ecuacion);
                return jep.getValue();
            } catch (Exception e) {
                throw new RuntimeException("Error al evaluar la función.");
            }
        };

        double xr;
        double Xm;
        double Xa;
        double Xb;
        double error = 0;

        int iteraciones = 0;
        do {
            //Ejemplo... [3, 8] funcion = x^2-7x+10
            xr = (a + b) / 2.0; // Calcula el punto medio
            //xr = 5.5...
            //Aqui hay que evualuar la funcion con 3, 8 y 5.5
            Xa = funcion.apply(a); //Evalúa la función de a... -2
            Xb = funcion.apply(b); //Evalua la funcion de b...18
            Xm = funcion.apply(xr); //Evalua la funcion de punto medio(xr)... 1.75

            /*System.out.println("Iteración " + (iteraciones + 1));
            System.out.println("Aproximación (Xr): " + round(xr, numDecimales));
            System.out.println("Porcentaje de error: " + round(error, numDecimales) + "%");
            System.out.println("------------------------");*/

            if(Xa * Xm < 0) {
                error = Math.abs((xr - Xa) / xr) * 100.0;
                b = xr; // La solución está en el intervalo [a, xr]
            } 
            else if(Xb * Xm < 0){
                error = Math.abs((xr - Xb) / xr) * 100.0;
                a = xr; // La solución está en el intervalo [xr, b]
            }
            else{
                iteraciones = 100; 
            }

            iteraciones++;
        } while (error > porcentajeError && iteraciones < 100); // Continúa hasta alcanzar el porcentaje de error deseado o un máximo de 100 iteraciones

        System.out.println("\nLa solución aproximada es: " + round(xr, numDecimales));
    }

    public static double round(double value, int numDecimales) {
        double factor = Math.pow(10, numDecimales);
        return Math.round(value * factor) / factor;
    }
}
