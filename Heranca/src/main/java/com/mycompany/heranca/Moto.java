package com.mycompany.heranca;

/**
 *
 * @author 2830482511008
 */
public class Moto extends Veiculo {
    int cilindrada;
    String tipo;
    int qtdMarchas;
    boolean partidaEletrica;
    
    public Moto(
            String marca,
            String modelo,
            String chassi,
            float valor,
            int cilindrada,
            String tipo,
            int qtdMarchas,
            boolean partidaEletrica
            ) {
        super(marca, modelo, chassi, valor);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.qtdMarchas = qtdMarchas;
        this.partidaEletrica = partidaEletrica;
    }
    
    public String exibirDadosMoto() {
        return this.exibirDadosVeiculo() +
                "\nCilindradas: " + this.cilindrada +
                "\nCategoria: " + this.tipo +
                "\nQuantidade de marchas: " + this.qtdMarchas +
                "\nPartida elétrica: " + (this.partidaEletrica ? "Sim" : "Não");
    }
}
