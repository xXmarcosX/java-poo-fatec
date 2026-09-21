
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Vinicius
 */
public class Primeiro {
    public static void main(String[] args) {
        int x, y;
        int soma, mult, sub;
        float divi;
        String msg;
        
        String num1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        String num2 = JOptionPane.showInputDialog("Digite o segundo valor");
        
        x = Integer.parseInt(num1);
        y = Integer.parseInt(num2);
         
        soma = x + y;
        mult = x * y;
        sub = x - y;
        divi = (float)x / y;
        
        JOptionPane.showMessageDialog(null, "A soma de " + x + " + " + y + " é: " + soma);
        JOptionPane.showMessageDialog(null, "A multiplicação de " + x + " x " + y + " é: " + mult);
        JOptionPane.showMessageDialog(null, "A subtração de " + x + " - " + y + " é: " + sub);
        JOptionPane.showMessageDialog(null, "A divisão de " + x + " / " + y + " é: " + divi);
        
        msg = "A soma de " + x + " + " + y + " é: " + soma;
        msg = msg + "\nA multiplicação de " + x + " x " + y + " é: " + mult;
        msg = msg + "\nA subtração de " + x + " - " + y + " é: " + sub;
        msg = msg + "\nA divisão de " + x + " / " + y + " é: " + divi;
        
        JOptionPane.showMessageDialog(null, "Resultado: Geral:\n" + msg);
    }
}
