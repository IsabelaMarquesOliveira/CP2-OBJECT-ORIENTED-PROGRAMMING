package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacoteTransportado;
    private Veiculo veiculoDesignado;

    public Rota(Pacote pacoteTransportado, Veiculo veiculoDesignado) {
        this.pacoteTransportado = pacoteTransportado;
        this.veiculoDesignado = veiculoDesignado;
    }

    public void iniciarEntrega() {
        this.pacoteTransportado.atualizarStatus("Em trânsito");
        System.out.println("Levando pacote " + this.pacoteTransportado.getCodigo() + " no veiculo " + this.veiculoDesignado.getPlaca());
    }

    public Pacote getPacoteTransportado() {
        return this.pacoteTransportado;
    }

    public Veiculo getVeiculoDesignado() {
        return this.veiculoDesignado;
    }
}