package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- FIAPDELIVERY ---");

        // Entrega com caminhão
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Pacote pacote1 = new Pacote("BR999", 10.5);

        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        rotaCaminhao.iniciarEntrega();
        System.out.println("Status: " + pacote1.getStatus());


        // Entrega com moto
        Moto moto = new Moto("XYZ9876", 30.0, true);
        Pacote pacote2 = new Pacote("BR123", 2.0);

        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.iniciarEntrega();
        System.out.println("Status: " + pacote2.getStatus());



        // Capacidade negativa não é aceita
        Caminhao caminhaoErrado = new Caminhao("DEF5678", -500.0, 2);
    }
}