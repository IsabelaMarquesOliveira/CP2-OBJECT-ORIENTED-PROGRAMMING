package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return this.possuiBau;
    }
}