package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return this.quantidadeEixos;
    }
}