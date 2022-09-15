import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdLatas, qtdGarrafa600, qtdGarrafa2000;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de latas de 350ml: ");
		qtdLatas = sc.nextInt();
		
		System.out.print("Digite a quantidade de latas de 600ml: ");
		qtdGarrafa600 = sc.nextInt();
		
		System.out.print("Digite a quantidade de latas de 2lts: ");
		qtdGarrafa2000 = sc.nextInt();
		
		
		System.out.print("A quantidade total de litros e: " + (int)((qtdGarrafa2000*2)+(qtdGarrafa600*0.6) + (qtdLatas*0.35)));
		
		sc.close();
	}

}
