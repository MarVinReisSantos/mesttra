import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioMinimo, salarioFuncionario;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe o valor do salario minimo: ");
		salarioMinimo = sc.nextFloat();
		

		System.out.print("Informe o valor do salario do funcionario: ");
		salarioFuncionario = sc.nextFloat();
		
		System.out.printf("O funcionario recebe %.1f salarios mínimos!", (salarioFuncionario/salarioMinimo));

		sc.close();
	}

}
