package com.mycompany.sobrecargaaula1;

import javax.swing.JOptionPane;

public class Figura {

    Integer a, b, c, d;

    public Figura() {
        int opt = 0;
        String msg = "1 - Ponto\n2 - Linha\n3 - Triângulo\n4 - Retângulo\n5 - Sair";

        while (opt != 5) {
            a = b = c = d = null;
            
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, msg,
                    "Menu de opções para a criação de uma figura geométrica", -1));

            switch (opt) {
                case 1:
                    this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                    JOptionPane.showMessageDialog(null, exibirFigura());
                    break;
                case 2:
                    this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                    this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                    JOptionPane.showMessageDialog(null, exibirFigura());
                    break;
                case 3:
                    this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                    this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                    this.c = Integer.parseInt(JOptionPane.showInputDialog("C: "));
                    JOptionPane.showMessageDialog(null, exibirFigura());
                    break;
                case 4:
                    this.a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
                    this.b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
                    this.c = Integer.parseInt(JOptionPane.showInputDialog("C: "));
                    this.d = Integer.parseInt(JOptionPane.showInputDialog("D: "));
                    JOptionPane.showMessageDialog(null, exibirFigura());
                    break;
                case 5:
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
    }

    public Figura(Integer a) {
        this.a = a;
    }

    public Figura(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Figura(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figura(Integer a, Integer b, Integer c, Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String exibirFigura() {
        if (a != null && b == null && c == null && d == null) {
            return exibirFigura("x");
        } else if (a != null && b != null && c == null && d == null) {
            return exibirFigura(1.0f);
        } else if (a != null && b != null && c != null && d == null) {
            return exibirFigura(true);
        } else if (a != null && b != null && c != null && d != null) {
            return exibirFigura('f');
        }

        return "";
    }

    public String exibirFigura(String x) {
        return "É um ponto de valor: " + a;
    }

    public String exibirFigura(float g) {
        return "Linha de coordenadas " + a + " e " + b;
    }

    public String exibirFigura(boolean is) {
        return "Triângulo de coordenadas " + a + " e " + b + " e " + c;
    }

    public String exibirFigura(char f) {
        return "Retângulo de coordenadas " + a + " e " + b + " e " + c
                + " e " + d;
    }
}
