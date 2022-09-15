import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anoAtual, anoNascimento, idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nInforme o ano inicial: ");
		anoNascimento = (int) sc.nextFloat();
		
		System.out.print("Informe o ano final: ");
		anoAtual = (int) sc.nextFloat();
		
		
		idade = (anoAtual-anoNascimento);
		System.out.println("A idade dessa pessoa em \nanos e: " + idade);
		System.out.println("meses e: " + (idade*12));
		System.out.println("dias e: " + (idade*12*30));
		System.out.println("semanas e: " + (idade*12*4));
		
		sc.close();
	}

}
