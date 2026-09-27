package br.com.fiapdelivery.model;

public class Veiculo {

    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.setCapacidadeCarga(capacidadeCarga);
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    // Não deixa cadastrar capacidade negativa
    private void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga >= 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("A capacidade deve ser maior que zero.");
        }
    }
}