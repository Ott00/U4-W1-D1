import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Main {

    public static void main(String[] args) {
        System.out.println("Perimetro Rettangolo");
        System.out.print("Inserisci la base del rettangolo: ");
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        long y = scanner.nextInt();
        long perimetro = perimetroRettangolo(x, y);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        System.out.print("Pari o dispari? Dimmi un numero: ");
        int number = scanner.nextInt();
        int result = evenOrOdd(number);
        System.out.println("Il numero è: " + (result == 0 ? "pari" : "dispari"));

        System.out.println("Perimetro Triangolo");
        System.out.print("Inserisci il primo lato del triangolo: ");
        long a = scanner.nextInt();
        System.out.print("Inserisci il secondo lato del triangolo: ");
        long b = scanner.nextInt();
        System.out.print("Inserisci il terzo lato del triangolo: ");
        long c = scanner.nextInt();
        long areaTriangolo = areaTriangolo(a, b, c);
        System.out.println("L'area del triangolo è: " + areaTriangolo);
    }

    public static long perimetroRettangolo(long x, long y){
        return ((x+y)*2);
    }

    public static int evenOrOdd(int number){
       return number % 2 == 0 ? 0 : 1;
    }

    public static int areaTriangolo(long a, long b, long c){
        long s = (a+b+c)/2;
        return (int) sqrt(s*(s-a)*(s-b)*(s-c));
    }

}