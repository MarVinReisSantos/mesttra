import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		int num, milhares, centenas, dezenas, unidades;
		
		System.out.print("Digite um numero de 4 digitos: ");
		num = sc.nextInt();

		milhares = (num -(num%1000))/ 1000;
		centenas = (num -(num%100) - (milhares*1000))/100;
		dezenas = (num -(num%10) - (milhares*1000) - (centenas*100))/10;
		unidades = (num -(num%1) - (milhares*1000) - (centenas*100) -(dezenas*10));
		
		
		System.out.println("Milhares: " + milhares);
		System.out.println("Centenas: " + centenas);
		System.out.println("Dezenas: " + dezenas);
		System.out.println("Unidades: " + unidades);
		
		sc.close();
	}

}
