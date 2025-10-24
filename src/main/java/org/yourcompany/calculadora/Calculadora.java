

package org.yourcompany.calculadora;
import java.util.Random;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
        
        // Multiple moneda
        // System.out.println("Numero de cares al tirar 50 monedes " + numcares(50));
        // System.out.println("Numero de cares al tirar 100 monedes " + numcares(100));
        // System.out.println("Numero de cares al tirar 1000 monedes " + numcares(1000));

        //Cinema
        // System.out.println("Si vas al cine amb preu base 5€ al cap de setmana amb carnet jove " + Cinema(5, true, true) + " €");
        // System.out.println("Si vas al cine amb preu base 15€ entre setmana amb carnet jove " + Cinema(15, false, true) + " €");
        // System.out.println("Si vas al cine amb preu base 55€ al cap de setmana sense carnet jove " + Cinema(55, true, false) + " €");
    
    
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int numcares(int vegades) {
        int randomnum = 0;
        int cara = 0;
        Random generator = new Random();
        for (int i = 0; i < vegades ; i++){
            randomnum = generator.nextInt(0,2);
            if (randomnum == 0){
                cara++;
            }
        }
        return cara;
        
    }

    public static int sumaPrimersNumeros(int n) { 
        int suma = n;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static double Cinema(double preu, boolean capdesetmana, boolean carnetjove) {        
        if(capdesetmana == true) {
            preu = preu + (preu * 0.10);
        }
       if (carnetjove == true){
            preu = preu - (preu * 0.15);
        }
        return preu;
    }    


}

