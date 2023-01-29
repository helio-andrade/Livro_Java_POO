package modulo1;

import javax.swing.JOptionPane;

public class Fatorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(
        	JOptionPane.showInputDialog(
        		"Insira o número para calcular o fatorial:"));

        int resultado = 1;
        for (int i = n; i > 1; i--) {
            resultado *= i;
        }
        JOptionPane.showMessageDialog(null, 
        	"O fatorial de " + n + " é: " + resultado);
    }
}
