import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o peso em Kg: ");
		peso = sc.nextInt();
		
		System.out.printf("Caso a pessoa engorde 15 ficara com: %.2f kg", (peso*1.15));
		System.out.printf("\nCaso a pessoa emagrece 20 ficara com: %.2f kg", (peso*0.80));

		sc.close();
	}

}
