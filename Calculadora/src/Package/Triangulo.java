package Package;

import java.util.Scanner;

public class Triangulo {
	
	public double areadoTriangulo;
	public double baseTriangulo;
	public double alturaTriangulo;
	
	public void calcularTiangulo(){
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da base do triangulo:  ");
		baseTriangulo = ler.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo:  ");
		alturaTriangulo = ler.nextDouble();
		
		areadoTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		System.out.println("o resultado é " + areadoTriangulo);
		
	}
}
