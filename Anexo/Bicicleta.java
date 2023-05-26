package Anexo;

public class Bicicleta implements PegadaDeCarbono {
    private String marca;
    private String modelo;
    private double distanciaKM;

    public Bicicleta(String marca, String modelo, double distanciaKM) {
        this.marca = marca;
        this.modelo = modelo;
        this.distanciaKM = distanciaKM;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

    @Override
    public double getPegadaDeCarbono() {
        return this.distanciaKM * 0.01;
    }
}