import java.util.Scanner;

public class Questao4 {
          
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float valorTotal, totalComprasVista=0, totalComprasParceladas=0, totalDesconto=0, totalJuros=0;
        int formaPagamento;


        for (int i = 0; i < 5; i++) {
            System.out.println("Compra 0" + (i+1));
            System.out.print("Digite o valor total: R$ ");
            valorTotal = sc.nextFloat();
            
            System.out.print("Digite a forma de pagamento:");
            formaPagamento = sc.nextInt();

            switch(formaPagamento){
                case 1:
                        totalComprasVista += (float) (valorTotal*0.92);
                        totalDesconto += (float) (valorTotal*0.08);
                        System.out.println("Desconto de 8%\nValor final: " + (valorTotal*0.92));
                break;
                case 2:
                        totalComprasVista += (float) (valorTotal*0.96);
                        totalDesconto += (float) (valorTotal*0.04);
                        System.out.println("Desconto de 4%\nValor final: " + (valorTotal*0.96));
                break;
                case 3:
                        totalComprasParceladas += valorTotal;
                        System.out.println("Em 2x de R$ " + (valorTotal/2) + "\nValor final: " + (valorTotal));
                break;
                case 4:
                        totalComprasParceladas += (valorTotal*1.08);
                        totalJuros = (float) ((valorTotal*1.08) - valorTotal);
                        System.out.println("Em 4x de R$ " + ((valorTotal*1.08)/4) + "\nValor final: " + (valorTotal*1.08));
                break;
                default:
                        System.out.println("Opção inválida, a compra não será processada");
                break;
                
            }
            System.out.println();
        }

        System.out.println("Total de compras À vista R$ " + totalComprasVista);
        System.out.println("Total de compras parceladas R$ " + totalComprasParceladas);
        System.out.println("\nTotal de descontos: R$ " + totalDesconto);
        System.out.println("Total de Juros: R$ " + totalJuros);
        sc.close();
    }
}
