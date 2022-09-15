import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float salario;
		
		System.out.print("Informe o salario: ");
		salario = sc.nextFloat();
		
		System.out.println("\nSalario Inicial: " + salario);
		salario*=1.15;
		System.out.println("Salario Reajustado: " + salario);
		System.out.println("Desconto 11% INSS: " + (salario*0.11));
		System.out.println("Desconto 8% FGTS: " + (salario*0.08));
		System.out.println("Total de Desconto INSS+FGTS: " + ((salario*0.08)+(salario*0.11)));
		System.out.println("Salario Final: " + ((salario-((salario*0.08)+(salario*0.11)))));
		
		sc.close();
	}

}
