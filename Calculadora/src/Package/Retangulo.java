package Package;

import java.util.Scanner;

public class Retangulo {

	public double areadoRetangulo;
	public double larguraRetangulo;
	public double alturaRetangulo;
	
	public void calcularRetangulo(){
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da largura do retangulo:  ");
		larguraRetangulo = ler.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo:  ");
		alturaRetangulo = ler.nextDouble();
		
		areadoRetangulo = (larguraRetangulo * alturaRetangulo);
		
		System.out.println("o resultado é " + areadoRetangulo);
		
	}
}
