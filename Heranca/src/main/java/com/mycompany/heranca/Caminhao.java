/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 2830482511008
 */
public class Caminhao extends Veiculo {
    int tara;
    int eixos;
    float altura;
    int comprimento;
    String tipoCarroceria;

    public Caminhao(
            String marca,
            String modelo,
            String chassi,
            float valor,
            int tara,
            int eixos,
            float altura,
            int comprimento,
            String tipoCarroceria
    ) {
        super(marca, modelo, chassi, valor);
        this.tara = tara;
        this.eixos = eixos;
        this.altura = altura;
        this.comprimento = comprimento;
        this.tipoCarroceria = tipoCarroceria;
    }
    
    public String exibirDadosCaminhao() {
        return this.exibirDadosVeiculo() +
                "\nTara: " + this.tara +
                "\nNúmero de eixos: " + this.eixos +
                "\nAltura: " + this.altura +
                "\nComprimento: " + this.comprimento + 
                "\nTipo de Carroceria: " + this.tipoCarroceria;
    }
}
