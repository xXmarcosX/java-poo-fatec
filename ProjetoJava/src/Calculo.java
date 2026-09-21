// Seção de importação
import javax.swing.JOptionPane;

/**
 * Classe para ...
 * @autor: 2830482511008 - Marcos Vinicius
 * @data de criação da classe: 21/09/2026    
 */

public class Calculo {
    public static void main(String[] args) {
        int a, b, soma;
        String num1, num2;
        
        num1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        num2 = JOptionPane.showInputDialog("Digite o segundo valor");
        
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);
        soma = a + b;
        
        // System.out.println("A soma é: " + soma);

        // Parâmetros da caixa de dialogo:
        // JOptionPane.showMessageDialog(1, 2, 3, 4);
        // 1 = null/this
        // 2 = Texto dentro da caixa de dialog
        // 3 = Titulo da caixa de dialogo
        // 4 = ícone -> (-1 a 3)
       
        JOptionPane.showMessageDialog(null, "A soma é: " + soma, "Resultado", 0);
    }
}
