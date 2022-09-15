import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float baseMaior, baseMenor, altura;
		
		
		System.out.println("Area do trapezio: ");
		System.out.print("Informe o valor da base maior: ");
		baseMaior = sc.nextFloat();
		
		
		System.out.print("Informe o valor da base menor: ");
		baseMenor = sc.nextFloat();
		
		System.out.print("Informe o valor da altura: ");
		altura = sc.nextFloat();
		
		
		System.out.println("A area do trapezio e: " + (((baseMaior + baseMenor)*altura)/2));
		
		/////////////////////////////////////////////////////////////////
		
		float lado;
		System.out.println("\nArea do quadrado: ");
		System.out.print("Informe o valor de um dos lados: ");
		lado = sc.nextFloat();
		
		System.out.println("A area do quadrado e: " + (Math.pow(lado,2)));
		
		///////////////////////////////////////////////////////////////////
		
		float largura;
		System.out.println("\nArea do retangulo: ");
		System.out.print("Informe o valor da largura: ");
		largura = sc.nextFloat();
		
		
		System.out.print("Informe o valor da altura: ");
		altura = sc.nextFloat();
		
		System.out.println("A area do quadrado e: " + (altura*largura));
		
		///////////////////////////////////////////////////////////////////
				
		float raio;
		System.out.println("\nArea do circulo: ");
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextFloat();
		
		System.out.println("A area do circulo e: " + (3.14*Math.pow(raio, 2)));
		
		///////////////////////////////////////////////////////////////////
				
		System.out.println("\nArea do triangulo: ");
		System.out.print("Informe o valor da base: ");
		largura = sc.nextFloat();
		
		
		System.out.print("Informe o valor da altura: ");
		altura = sc.nextFloat();
		
		System.out.println("A area do triangulo e: " + ((altura*largura)/2));

		
		sc.close();
	}

}
