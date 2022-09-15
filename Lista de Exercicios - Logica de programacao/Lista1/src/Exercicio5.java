import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor 1: ");
		num1 = sc.nextFloat();
		
		System.out.print("Informe o valor 2: ");
		num2 = sc.nextFloat();
		
		
		System.out.printf("A divisao de %.0f por %.0f e %.2f", num1, num2, (num1/num2));
		
		sc.close();
	}

}
