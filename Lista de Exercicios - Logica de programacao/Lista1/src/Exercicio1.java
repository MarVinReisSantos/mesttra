import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		float preco, frente, lateral;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos metros o terreno possui de frente: ");
		frente = sc.nextFloat();
		

		System.out.print("Quantos metros o terreno possui de lateral: ");
		lateral = sc.nextFloat();

		System.out.print("Informe o valor do metro quadrado: ");
		preco = sc.nextFloat();

		
		System.out.printf("\nArea total do terreno de %.2f mts de frente com %.2f mts de lateral e: %.2f mts", frente, lateral, (frente*lateral));
		System.out.println();
		System.out.printf("O valor deste terreno e: R$ %.2f",(lateral*frente*preco));
		sc.close();
		
	}


}
