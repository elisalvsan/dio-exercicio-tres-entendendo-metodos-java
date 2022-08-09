package br.com.dio;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício de Retornos");

        double areaQuadrado =Quadrilatero.area(6);
        System.out.println("Area Quadrado: " + areaQuadrado);

        double areaRetangualo = Quadrilatero.area(5,5);
        System.out.println("Area Retângualo: " + areaRetangualo);

        double areaTrapezio = Quadrilatero.area(7,8,10);
        System.out.println("Area Trapézio: " + areaTrapezio);

    }

}
