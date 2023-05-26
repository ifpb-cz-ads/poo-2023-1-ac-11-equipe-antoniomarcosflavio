package Anexo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(6);
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo(3);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(retangulo);
        formas.add(circulo);

        for (Forma forma : formas) {
            if (forma instanceof Quadrado) {
                Quadrado squad = (Quadrado) forma;
                System.out.println("Quadrado:");
                System.out.println("Lado: " + squad.getLado());
                System.out.println("Perímetro: " + squad.perimetro());
                System.out.println("Área: " + squad.area());
            }else if (forma instanceof Retangulo) {
                Retangulo ret = (Retangulo) forma;
                System.out.println("Retangulo:");
                System.out.println("Base: " + ret.getBase());
                System.out.println("Altura: " + ret.getAltura());
                System.out.println("Perímetro: " + ret.perimetro());
                System.out.println("Área: " + ret.area());
            } else if (forma instanceof Circulo) {
                Circulo circ = (Circulo) forma;
                System.out.println("Círculo:");
                System.out.println("Raio: " + circ.getRaio());
                System.out.println("Perímetro: " + forma.perimetro());
                System.out.println("Área: " + forma.area());
            }
        }
    }
}

