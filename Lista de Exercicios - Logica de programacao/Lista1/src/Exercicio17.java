import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float paesVendidos, broasVendidas, valorDaReforma;
		
		System.out.print("Digite a quantidade de paes vendidos: ");
		paesVendidos = (float) (sc.nextFloat() * 0.12);

		System.out.print("Digite a quantidade de broas vendidas: ");
		broasVendidas = (float) (sc.nextFloat() * 1.6);


		System.out.print("Digite o valor da reforma: ");
		valorDaReforma = sc.nextFloat();
		
		System.out.printf("\nFaturamento com a venda de broas: %.2f", broasVendidas);
		System.out.printf("\nFaturamento com a venda de paes: %.2f", paesVendidos);
		System.out.printf("\nFaturamento diario (paes + broas): %.2f", (paesVendidos+broasVendidas));
		System.out.printf("\nValor do deposito na poupanca: %.2f", ((paesVendidos+broasVendidas)*0.1));
		System.out.printf("\nPara pagar a reforma seram necessarios: %.0f", Math.ceil(valorDaReforma/((paesVendidos+broasVendidas)*0.1)));
		
		sc.close();
	}

}
