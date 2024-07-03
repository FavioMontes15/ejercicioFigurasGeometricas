package figurasgeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class FigurasGeometricas {

    static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //llenar un poligono
        llenarPoligono();
        mostrarResultados();
    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite el poligono: ");
                System.out.println("1. Triangulo");
                System.out.println("2 Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);
            switch (opcion) {
                case 1 ->
                    llenarTriangulo();//Llenar un triangulo
                case 2 ->
                    llenarRectangulo();//Llenar un rectangulo
            }
            System.out.println("Desea introducir otro poligono(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.println("\n Digite lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\n Digite lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("\n Digite lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Guardamo triangulos dentro del arrelgo de poligonos
        poligono.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println("\n Digite lado1 de rectangulo");
        lado1 = entrada.nextDouble();
        System.out.println("\n Digite lado2 de rectangulo");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        for (Poligonos poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("El area es: "+poli.area());
            System.out.println("");
        }
    }
}
