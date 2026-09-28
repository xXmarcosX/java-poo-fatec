package com.mycompany.cadastro;

/**
 * @description: Classe com a finalidade de determinar atributos e métodos para o objeto pessoa
 * @author Marcos Vinicius
 * @date: 28/09/2026
 */
public class Pessoa {
    String nome;
    int idade;
    float peso;
    float altura;
    
    public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String exibirDadosPessoa() {
        return "\nNome: " + this.nome + 
                "\nIdade: " + this.idade + 
                "\nPeso: " + this.peso + 
                "\nIMC: " + this.calcularImc() + " - " + this.classificarImc(); 
    }
    
    public float calcularImc() {
        return this.peso / (float)Math.pow(this.altura, 2);
    }
    
    public String classificarImc() {
        float imc = this.calcularImc();
        
        if (imc < 18.5) return "Magreza";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidade grau 1";
        if (imc < 40) return "Obesidade grau 2";
        return "Obesidade grau 3";
    }
}
