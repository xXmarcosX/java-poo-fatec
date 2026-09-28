/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 * @Description classe que herda da classe veículo com a finalidade de 
 * criar objetos do tipo Carro
 * @author 2830482511008
 * @Date 28/09/2026 
 */
public class Carro extends Veiculo {
    int volumePortaMalas;
    boolean flex;
    float potencia;
    
    public Carro(String marca, 
            String modelo, 
            String chassi, 
            float valor,
            int volume, 
            boolean flex, 
            float potencia) {
        super(marca, modelo, chassi, valor);
        this.volumePortaMalas = volume;
        this.flex = flex;
        this.potencia = potencia;
    }
    
   public String exibirDadosCarro() {
       return super.exibirDadosVeiculo() +
               "\nVolume do porta Malas: " + this.volumePortaMalas +
               "\nFlex: " + (this.flex ? "Sim" : "Não") + 
               "\nPotencia: " + this.potencia;
               
   }
}
