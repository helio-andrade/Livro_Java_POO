// Programa 01.03
package modulo1;

import static java.lang.System.out;

// Criação de objetos em Java
public class Principal {

	public static void main(String[] args) {
		ContaCorrente objeto1 = new ContaCorrente(); // Criando o objeto 1
		ContaCorrente objeto2 = new ContaCorrente(); // Criando o objeto 2
		
		objeto1.setSaldo(1234.56);
		out.println("saldo1 = R$ " + objeto1.getSaldo());
		
		objeto2.setAgencia(1234);
		objeto2.setConta(4567);
		objeto2.setSaldo(9874.56);
		objeto2.efetuarSaque(874.56);
		
		out.println("\nobjeto2:" +
					"\nAg: "		 + objeto2.getAgencia() + 
					"\nC/c: "      + objeto2.getConta() +
					"\nSaldo: R$ " + objeto2.getSaldo());
	}

}
