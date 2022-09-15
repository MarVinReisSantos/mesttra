import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		int dia = 0, mes = 0;
		
		System.out.print("Digite o dia: ");
		dia = sc.nextInt();

		System.out.print("Digite o mes: ");
		mes = sc.nextInt();
		
		if(mes == 1) {
			System.out.println("A quantidade de dias que se passaram foi: "  + dia + " dias");
		}else {
			System.out.println("A quantidade de dias que se passaram foi: "+ (dia+(mes*30)) + " dias");
		}
		
		sc.close();
	}

}
