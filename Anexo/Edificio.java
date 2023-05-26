package Anexo;

public class Edificio implements PegadaDeCarbono {
    private String nome;
    private int andares;
    private double consumoEnergia;

    public Edificio(String nome, int andares, double consumoEnergia){
        this.nome = nome;
        this.andares = andares;
        this.consumoEnergia = consumoEnergia;
    }
    public String getNome() {
        return nome;
    }

    public int getAndares() {
        return andares;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    @Override
    public double getPegadaDeCarbono() {
        return this.consumoEnergia * 5.6;
    }
}
