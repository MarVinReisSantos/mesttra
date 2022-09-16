import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        int nota_Qtd100 = 0, nota_Qtd50 = 0, nota_Qtd20 = 0, nota_Qtd10 = 0, nota_Qtd5 = 0; 
        boolean marcado=true;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Banco--------\n");

        while(marcado){
            try {

                System.out.print("\nUsuário digite o valor em dinheiro a ser sacado: R$ ");
                float valorSaque = sc.nextFloat();

                if(valorSaque <= 0){
                    throw new Exception();
                }

                if(valorSaque>=100){
                    nota_Qtd100 = (int) (valorSaque/100);

                    valorSaque -= nota_Qtd100 * 100;
                }
                
                if(valorSaque>=50){
                    nota_Qtd50 = (int) (valorSaque/50);

                    valorSaque -= nota_Qtd50 * 50;
                }
                if(valorSaque>=20){
                    nota_Qtd20 = (int) (valorSaque/20);

                    valorSaque -= nota_Qtd20 * 20;
                }
                if(valorSaque>=10){
                    nota_Qtd10 = (int) (valorSaque/10);

                    valorSaque -= nota_Qtd10 * 10;
                }
                if(valorSaque>=5){
                    nota_Qtd5 = (int) (valorSaque/5);

                    valorSaque -= nota_Qtd5 * 5;
                }

                if(valorSaque != 0){
                    throw new Exception();
                }

                marcado = false;
            } catch (Exception e) {
                System.out.println("Valor precisa ser maior que 0 e multiplo de 5");
            }
        }
        System.out.println(
        "\nQuantidades" + 
        "\n100 reais: " + nota_Qtd100 +
        "\n50 reais: "  + nota_Qtd50 +
        "\n20 reais: "  + nota_Qtd20 +
        "\n10 reais: "  + nota_Qtd10 +
        "\n5 reais: "   + nota_Qtd5
        );
        
        sc.close();
    }
}
