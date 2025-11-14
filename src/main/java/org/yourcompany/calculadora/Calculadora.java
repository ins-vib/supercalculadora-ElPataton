

package org.yourcompany.calculadora;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {
        mostrarMenuConsola();
        // Exemples de crida per al mètode nombreDigits
        // System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        // System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        // System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        // System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

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
     * Menú per escollir l'opció de la calculadora, cada numero es una funció
     * Si es prem un numero que no te funció et torna a sortir el menu
     * Si es prem 0 es surt del programa
     *
     */
    public static void mostrarMenuConsola(){
        Scanner lectura = new Scanner(System.in);
        int opcio = 1;
        while (opcio != 0) {
            System.out.println("Supercalculadora!");
            System.out.println("1: Suma dels primers numeros");
            System.out.println("2: CalcularFactorial");
            System.out.println("3: Suma de Quadrats");
            System.out.println("4: Calcul de potencies");
            System.out.println("5: Nombre de digits");
            System.out.println("6: Cara o creu");
            System.out.println("7: Entrades cinema");
            System.out.println("0: Sortir");
            System.out.println("Quina opcio de la calculadora vols utilitzar?");
            opcio = lectura.nextInt();
            switch (opcio) {
                case 0 -> {
                    opcio=0;
                    return;
                }
                case 1 -> {
                    int n = 0;
                    System.out.println("Fins a quin numero vols sumar?");
                    n = lectura.nextInt();
                    System.out.println(sumaPrimersNumeros(n));
                }
                case 2 -> {
                    int n = 0;
                    System.out.println("De quin numero vols fer el factorial?");
                    n = lectura.nextInt();
                    System.out.println(calcularFactorial(n));
                }
                case 3 ->{
                    int n = 0;
                    System.out.println("Fins a quin numero vols sumar els seus cuadrats?");
                    n = lectura.nextInt();
                    System.out.println(sumaQuadrats(n));
                }
                case 4 ->{
                    int n = 0;
                    int z = 0;
                    System.out.println("Quin numero es la base de la potencia?");
                    n = lectura.nextInt();
                    System.out.println("Quin numero es el exponent de la potencia?");
                    z = lectura.nextInt();
                    System.out.println(calcularPotencia(n,z));
                }
                case 5 ->{
                    int n = 0;
                    System.out.println("Digues un numero per calcular els digits");
                    n = lectura.nextInt();
                    System.out.println(nombreDigits(n));
                }
                case 6 ->{
                    int n = 0;
                    System.out.println("Cuantes monedas vols llançar?");
                    n = lectura.nextInt();
                    System.out.println(numcares(n));
                }
                case 7 ->{
                    double n = 5;
                    boolean z = false;
                    boolean x = false;
                    char capdesetmana;
                    char carnetJove;
                    System.out.println("Quin es el preu base de la entrada?");
                    n = lectura.nextInt();
                    System.out.println("Es cap de setmana? S/N");
                    capdesetmana = lectura.next().charAt(0);
                    System.out.println("Tens carnet jove? S/N");
                    carnetJove = lectura.next().charAt(0);
                    if ('S' == capdesetmana){
                        z = true;
                    }
                    else{
                        z = false;
                    }
                    if ('S' == carnetJove){
                        x = true;
                    }
                    else{
                        x = false;
                    }
                    System.out.println("La entrada costa " + Cinema(n, z, x) + " €");
                }
                default -> {
                    System.out.println("");
                }
            }
        }
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
/**
     * Suma tots els numeros fins al numero aportat.
     *
     * @param n Ultím numero de la seqüencia de sumes
     * @return La suma total de tots els numeros {@code suma}
     */

    public static int sumaPrimersNumeros(int n) { 
    int suma = 0;
    for (int i = 0; i <= n; i++) {
        suma = suma + i;
    }
    return suma;
}

    /**
         * Retorna el factorial de cert numero.
         * @param n Número del qual es vol saber factorial
         * @return Resultat del factorial {@code factorial}
         */
    public static int calcularFactorial(int n){
        int factorial = 1;
        for (int i = 1; i <=n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    /**
         * Suma tots els numeros cuadrats fins al numero aportat.
         * @param n Ultím numero de la seqüencia de sumes
         * @return Resultat final de la suma {@code quadrat}
         */
    public static int sumaQuadrats(int n){
        int quadrat = 0;
        for(int i = 0; i <=n; i++){
            quadrat = quadrat + (i*i);
        }

        return quadrat;
    }

    /**
         * Retorna el resultat de la base elevada al exponent.
         * @param base La base per la qual multiplicarem
         * @param exponent El numero de vegades que multiplicarem la base
         * @return Resultat final de les multiplicacions {@code resultat}
         */
    public static int calcularPotencia(int base, int exponent){
        int resultat = base;
        for (int i=1;i < exponent; i++){
            resultat *=  base ;
        }

        return resultat;
    }


    /**
         * Retorna el numero de vegades que una moneda cau en cara.
         * @param vegades El numero de vegades que es llança la moneda
         * @return Resultat de quantes cares han caigut {@code cara}
         */
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

    /**
         * Calcula el preu de anar al cinema amb certs descomptes
         * @param preu El preu base de la entrada al cinema
         * @param capdesetmana Si es cap de setmana et dona un descompte
         * @param carnetjove Si tens carnet jove et dona un altre descompte
         * @return Resultat final del cost de la entrada {@code preu}
         */
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

