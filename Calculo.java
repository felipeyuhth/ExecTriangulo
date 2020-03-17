package Triangulo;
import java.util.Scanner;
public class Calculo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double base, altura, area;
		
		Triangulo Calculo = new Triangulo();
		
		System.out.println("Digite o valor da base: ");
		base=in.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura=in.nextDouble();
		
		Calculo.base = base;
		Calculo.altura = altura;
		Calculo.area();
		System.out.println("O resultado é "+Calculo.area);
	}
}