package com.mycompany.cadastro;

/**
 * @description: Classe com a finalidade de gerar objetos da classe pessoa
 * @author Marcos Vinicius
 * @date: 28/09/2026
 */
public class Cadastro {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Xerxes", 25, 78f, 1.80f);
        Pessoa fernanda = new Pessoa("Fernanda", 19, 65f, 1.69f);
//        Pessoa pessoa2 = new Pessoa("Vinicius de los Santos Segantini", 38, 45.6f);
//        Pessoa pessoa3 = new Pessoa("Catoblepas", 600, 789.6f);
//        Pessoa c;
        
//        c = pessoa1;
//        pessoa1 = pessoa2;
//        pessoa3 = pessoa1;

        System.out.println(pessoa.exibirDadosPessoa());
        System.out.println(fernanda.exibirDadosPessoa());
//        System.out.println("\n" + pessoa2.exibirDadosPessoa());
//        System.out.println("\n" + pessoa3.exibirDadosPessoa());
//        System.out.println("\n" + c.exibirDadosPessoa());
    }
}
