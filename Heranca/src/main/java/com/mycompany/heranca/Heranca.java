package com.mycompany.heranca;

/**
 *
 * @author 2830482511008
 */
public class Heranca {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Mobi", "2q273892798", 500f);
        Carro carro = new Carro(
                "Honda", 
                "Civic", 
                "a1a237dshas9214tjhad92", 
                104980.56f,
                230,
                true,
                230f
        );
        Caminhao caminhao = new Caminhao(
                "Scania",
                "P360",
                "sfa724ghf89sh238",
                376890.44f,
                10000,
                6,
                12.6f,
                38,
                "Cegonha"
        );
        Moto moto = new Moto(
                "Suzuki",
                "Hayabusa",
                "2g57fgw984nbt0",
                124500.00f,
                1340,
                "Sport",
                6,
                false
        );
        
        System.out.println(veiculo.exibirDadosVeiculo());
        System.out.println(carro.exibirDadosCarro());
        System.out.println(caminhao.exibirDadosCaminhao());
        System.out.println(moto.exibirDadosMoto());
    }
}
