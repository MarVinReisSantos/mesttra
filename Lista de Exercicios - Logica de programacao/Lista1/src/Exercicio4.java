import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		float num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero para calculo da tabuada: ");
		num = sc.nextInt();
		
		System.out.println("Tabuada do + e - para o numero " + num + ": "); 	
		for(int i=0; i<10; i++) {
			System.out.printf("%d + %d = %d \t", num, i, (num+i));
			System.out.printf("%d - %d = %d", num, i, (num>i? num-i: i-num));
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		num2 =(float) num;
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d * %d = %d \t", num, i, (num*i));
			
			if(i == 0) {
				System.out.printf("%d / %d = nao existe divisao por zero", num, i);
			}else {
				System.out.printf("%d / %d = %.2f", num, i, (num2/i));
			}
			
			System.out.println();
		}
		sc.close();
	}

}
