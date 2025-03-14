package Package;

import java.util.Scanner;

public class Circulo {
	
	public double areadoCirculo;
	public double areaCirculo;
	public double raioCirculo;
	
	public void calcularCirculo(){
		Scanner ler = new Scanner(System.in);
		
		 areaCirculo = Math.PI;
		
		System.out.println("Digite o valor do raio:  ");
		raioCirculo = ler.nextDouble();
		
		areadoCirculo = raioCirculo * raioCirculo;
		
		System.out.println("o resultado é " + areadoCirculo);
		
	}
}
