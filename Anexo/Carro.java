package Anexo;

public class Carro implements PegadaDeCarbono {
    private String marca;
    private String modelo;
    private double kmPorLitro;

    public Carro(String marca, String modelo, double kmPorLitro){
        this.marca = marca;
        this.modelo = modelo;
        this.kmPorLitro = kmPorLitro;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getkmPorLitro() {
        return kmPorLitro;
    }

    @Override
    public double getPegadaDeCarbono() {
        return this.kmPorLitro * 0.5;
    }
}
