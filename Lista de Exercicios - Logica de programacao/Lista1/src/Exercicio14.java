import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int qtdSanduiches;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de sanduiches: ");
		qtdSanduiches = sc.nextInt();
		
		System.out.printf("\nPara produzir %d sanduiches serao necessarios:", qtdSanduiches);
		System.out.printf("\n%.2f kgs de mussarela", (qtdSanduiches*2*0.05));
		System.out.printf("\n%.2f kgs de presunto", (qtdSanduiches*1*0.05));
		System.out.printf("\n%.2f kgs de hambuger", (qtdSanduiches*1*0.12));
		
		sc.close();
	}

}
