import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdCavalo;
		float preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantidade de cavalos: ");
		qtdCavalo = sc.nextInt();
		
		System.out.print("Informe o valor de cada ferradura R$: ");
		preco = sc.nextFloat();
		
		
		System.out.print("\nA quantidade de ferraduras necessarias: " + (qtdCavalo*4));
		System.out.print("\nValor total para compra das ferraduras: R$ " + (qtdCavalo*4*preco));

		sc.close();
	}

}
