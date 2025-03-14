package Package;

import java.util.Scanner;

public class Calculadora {
	
	public double areadoTriangulo;
	public double areadoCirculo;
	public double areadoRetangulo;
	
	//operadores
	public double baseTriangulo;
	public double alturaTriangulo;
	
	public double areaCirculo;
	public double raioCirculo;
	
	public double larguraRetangulo;
	public double alturaRetangulo;
	
	public void calcularTiangulo(){
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da base do triangulo:  ");
		baseTriangulo = ler.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo:  ");
		alturaTriangulo = ler.nextDouble();
		
		areadoTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		System.out.println("o resultado é " + areadoTriangulo);
		
	}
	
	public void calcularCirculo(){
		Scanner ler = new Scanner(System.in);
		
		 areaCirculo = Math.PI;
		
		System.out.println("Digite o valor do raio:  ");
		raioCirculo = ler.nextDouble();
		
		areadoCirculo = raioCirculo * raioCirculo;
		
		System.out.println("o resultado é " + areadoCirculo);
		
	}
	
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
