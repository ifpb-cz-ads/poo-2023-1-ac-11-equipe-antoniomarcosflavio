package Anexo;

import java.util.ArrayList;

public class TestePegadaDeCarbono {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> pegadas = new ArrayList<>();

        Bicicleta bicicleta = new Bicicleta("Caloi", "ProStreet", 36.90);
        Carro carro = new Carro("Ford", "EcoSport", 15.1);
        Edificio edificio = new Edificio("Empire State", 102, 12000);

        pegadas.add(edificio);
        pegadas.add(bicicleta);
        pegadas.add(carro);

        for (PegadaDeCarbono objeto : pegadas) {
            if(objeto instanceof Edificio) {
                Edificio edf =  (Edificio)objeto;
                System.out.println("Edificio: " + edf.getNome());
                System.out.println("Andares: " + edf.getAndares());
                System.out.println("Pegada de Carbono: " + edf.getPegadaDeCarbono());
                System.out.println();
            }else if(objeto instanceof Bicicleta){
                Bicicleta bike = (Bicicleta)objeto;
                System.out.println("Bicicleta: " + bike.getModelo());
                System.out.println("Marca: " + bike.getMarca());
                System.out.println("Pegada de Carbono: " + bike.getPegadaDeCarbono());
                System.out.println();
            }else if(objeto instanceof Carro){
                Carro car = (Carro)objeto;
                System.out.println("Carro: " + car.getModelo());
                System.out.println("Marca: " + car.getMarca());
                System.out.println("Pegada de Carbono: " + car.getPegadaDeCarbono());
                System.out.println();
            }
        }
    }
}
