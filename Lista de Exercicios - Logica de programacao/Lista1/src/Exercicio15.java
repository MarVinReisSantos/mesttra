import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float horasNormais, horasExtras, dependentesMenorQue6;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade total de horas normais: ");
		horasNormais = (float) sc.nextInt();
		
		System.out.print("Digite a quantidade total de horas extras: ");
		horasExtras = (float) sc.nextInt();
		
		System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
		dependentesMenorQue6 = (float) sc.nextInt();
		
		
		//////////////
		System.out.printf("\nHoras normais: %.2f", (float)(horasNormais*10));
		System.out.printf("\nAdicional de Horas Extras: %.2f", (float)(horasExtras*15));
		System.out.printf("\nAdicional de Dependentes: %.2f", (float)(dependentesMenorQue6*90));
		System.out.printf("\nSalario Liquido (Hrs normais - Desconto): %.2f", (float)((horasNormais*10)-(horasNormais*10*0.11)) );
		System.out.printf("\nSalario final: %.2f", (((horasNormais*10)-(horasNormais*10*0.11))+(horasExtras*15)+(dependentesMenorQue6*90)));
		
		sc.close();
	}

}
