/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @Description Classe para gerar objetos do tipo Veiculo
 * @Author Marcos Vinicius
 * @Date 28/09/2026
 */
public class Veiculo {
    String marca;
    String modelo;
    String chassi;
    float valor;
    
    public Veiculo(String marca, String modelo, String chassi, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.valor = valor;
    }
    
    public String exibirDadosVeiculo() {
        return "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nchassi: " + this.chassi.toUpperCase() + 
                "\nPreço: R$" + this.valor;
    }
}
