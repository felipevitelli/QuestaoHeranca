package br.com.felipe.heranca.veiculos;

//HERANCA
class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de Carga: " + capacidadeDeCarga + " toneladas");
    }
}
