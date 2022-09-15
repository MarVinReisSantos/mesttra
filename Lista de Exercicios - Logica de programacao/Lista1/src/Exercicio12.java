import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdFrango;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a QTDE de frangos: ");
		qtdFrango = sc.nextInt();
		
		System.out.print("O valor total para identificar os frangos e: R$ " + ((qtdFrango*4)+(qtdFrango*2*3.5)));
		
		sc.close();
	}

}
