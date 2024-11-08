package br.com.felipe.heranca.main;

import br.com.felipe.heranca.veiculos.Caminhao;
import br.com.felipe.heranca.veiculos.Moto;
import br.com.felipe.heranca.veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de cada tipo de veículo
        Veiculo carro = new Carro("Lamborghini", "Urus", 2018, 4);
        Veiculo moto = new Moto("Kawasaki", "Ninja", 2021, true);
        Veiculo caminhao = new Caminhao("MAN", "TGX 28.440", 2018, 3);


        System.out.println("Informacoes dos veiculos:");
        carro.exibirInfo();
        System.out.println();

        moto.exibirInfo();
        System.out.println();

        caminhao.exibirInfo();
    }
}
