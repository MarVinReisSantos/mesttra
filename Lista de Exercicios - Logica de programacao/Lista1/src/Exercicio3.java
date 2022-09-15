import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("Informe a nota 3: ");
		nota3 = sc.nextFloat();
		
		System.out.printf("\nA media ponderada das notas %.2f, %.2f, %.2f e: %.2f", nota1, nota2, nota3, (((nota1*1)+(nota2*2)+(nota3*3))/6));

		sc.close();
	}

}
