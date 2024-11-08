package br.com.felipe.heranca.veiculos;

//HERANCA
public class Moto extends Veiculo {
    private boolean temApoioador;

    public Moto(String marca, String modelo, int ano, boolean temApoioador) {
        super(marca, modelo, ano);
        this.temApoioador = temApoioador;
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tem Apoioador: " + (temApoioador ? "Sim" : "Não"));
    }
}
