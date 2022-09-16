import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        //Entrada do Scanner
        Scanner entrada = new Scanner(System.in);

        //Declaração de Variavel
        float frente, lateral, valormetro;


        //Receber valores teclado
        System.out.print("Quantos metros o terreno possui de frente: ");
        frente = entrada.nextFloat();

        System.out.print("\nQuantos metros o terreno possui de lateral: ");
        lateral = entrada.nextFloat();

        System.out.print("\nInforme o valor do metro quadrado: R$ ");
        valormetro = entrada.nextFloat();


        //Processamento lógico + Saída de informação
        if(frente>(lateral*0.7) && !((frente - lateral) < (lateral * 0.1))){
            System.out.printf( "O terreno recebeu o um decrescimento de 15 e custara: R$ %.2f", ( valormetro * lateral * frente* 0.85));

        }else if(frente<(lateral*0.4)){
            System.out.printf("O terreno recebeu o um decrescimento de 12 e custara: R$ %.2f", ( valormetro * lateral * frente* 0.88));
        }else if((frente - lateral) < (lateral * 0.1)){
            System.out.printf( "O terreno recebeu o acrescimo de 22 e custara: R$ %.2f", ( valormetro * lateral * frente* 1.22));


        }else{
            System.out.printf( "O terreno não recebeu nenhuma alteração e custara: R$ %.2f", ( valormetro * lateral * frente));
        }
        
        System.out.println();
        entrada.close();
    }
}