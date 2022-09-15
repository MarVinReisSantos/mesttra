import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float litros, agua, maracuja;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a QTDE de lts de suco necessaria: ");
		litros = sc.nextFloat();
		
		agua = (float) (litros*0.8);
		maracuja = (float) (litros*0.2);
		
		System.out.println("Sera necessario para fazer 34 litros de suco de maracuja:");
		System.out.println(agua + " lts de agua");
		System.out.println(maracuja + " lts de suco concentrado de maracuja");
		
		sc.close();
	}

}
