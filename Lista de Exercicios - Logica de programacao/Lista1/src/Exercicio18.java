import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float valorDaConta; 
		int valorDaContaInteiro;
		
		System.out.print("Informe o valor da conta: R$: ");
		valorDaConta = (float) (sc.nextFloat());

		valorDaContaInteiro = (int) valorDaConta;
		
		System.out.printf("\nCarlos pagara: R$: %.0f", valorDaConta/3);
		System.out.printf("\nAndre pagara: R$: %.0f", valorDaConta/3);
		System.out.printf("\nFelipe pagara: R$: %.2f", (valorDaContaInteiro/3+(valorDaConta-valorDaContaInteiro)));

		
		sc.close();
	}

}
