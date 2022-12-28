// Programa 01.08
package modulo1;

// Exemplo do uso de atributo estático
public class PrincipalEstatico {

	public static void main(String[] args) {
		ContaCorrente objeto1 = new ContaCorrente();
		
		// Acessando o atributo estático por meio da classe
		ContaCorrente.cpmf = 0.0038;
		objeto1.saldo = 200;
		
		ContaCorrente objeto2 = new ContaCorrente();
		objeto2.saldo = 400;
		
		System.out.println("Manipulando objetos em Java\u2122");
		System.out.println("\u00A9 Sun Microsystems, Inc.");
		
		// Atributo estático sendo acessado por um objeto
		System.out.println("objeto1 atributo estático: " + objeto1.cpmf);
		System.out.println("objeto1 atributo não-estático: " + objeto1.saldo);
		
		// Atributo estático sendo acessado por um objeto
		System.out.println("objeto2 atributo estatico: " + objeto2.cpmf);
		System.out.println("objeto2 atributo nao-estatico: " + objeto2.saldo);
		objeto2.cpmf = 0.0010;
		System.out.println("objeto1 atributo estatico: " + objeto1.cpmf);
		System.out.println("objeto1 atributo nao-estatico: " + objeto1.saldo);
		
		// Acessando atributo estático por meio de uma classe
		System.out.println("objeto1 atributo estatico. Acessado pelo nome da classe: " 
							+ ContaCorrente.cpmf);
		System.out.println("objeto1 atributo não estatico: " + objeto1.saldo);
	}

}
