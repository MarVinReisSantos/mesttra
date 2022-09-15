import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double faturamentoAnterior, diferencaFaturamento;
		
		System.out.print("Digite o valor do faturamento anterior:");
		faturamentoAnterior = sc.nextDouble();

		diferencaFaturamento = (faturamentoAnterior*1.2) - faturamentoAnterior;
		System.out.printf("\nA meta do proximo mes e: %.2f", (faturamentoAnterior*1.2));
			
		System.out.printf("\nUm aumento de: R$ %.2f", diferencaFaturamento);
		System.out.printf("\nQuantidade de pecas a serem vendidas para atingirmos a meta:");
		
		System.out.printf("\n\nProduto 1: %.2f", (diferencaFaturamento/150));
		System.out.printf("\nProduto 2: %.2f", (diferencaFaturamento/220));
		System.out.printf("\nProduto 3: %.2f", (diferencaFaturamento/97));
		
		sc.close();
	}

}
