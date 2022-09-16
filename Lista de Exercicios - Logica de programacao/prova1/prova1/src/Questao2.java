import java.util.Scanner;

public class Questao2 {
    public static int candidato_A;
    public static int candidato_C;
    public static int candidato_B;
    public static int nulo;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------votação para síndico do prédio--------\n");
    
        System.out.println("=========== Menu de Votação ===========\n1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n4 - Voto Nulo");

        for(int i=0; i<5; i++){
            mensagem(i);

            boolean marcador = true;
            int voto = 0;
        
            while(marcador){
                try {
                    voto = sc.nextInt();

                    if(voto <= 0 || voto>=5){
                         throw new Exception();
                    }
                    marcador = false;
                } catch (Exception e) {
                    System.out.println("Valor precisa ser entre 1 e 4:");
                }
            }
            
            adicionaVoto(voto);
        }
    
        sc.close();
        
        System.out.println("Percentual de Votos Válidos: " + (candidato_A+candidato_B+candidato_C)*20 + " %");
        System.out.println("Percentual de Votos Candidato 1: " + (candidato_A * 20) + " %");
        System.out.println("Percentual de Votos Candidato 2: " + (candidato_B * 20) + " %");
        System.out.println("Percentual de Votos Candidato 3: " + (candidato_C * 20) + " %");

        if(candidato_A > candidato_B && candidato_A>candidato_B){
            System.out.println("Candidato vencedor: Candidato 1");
        }
        else if(candidato_B > candidato_A && candidato_B>candidato_C){
            System.out.println("Candidato vencedor: Candidato 1");
        }
        else if(candidato_C > candidato_A && candidato_C>candidato_B){
            System.out.println("Candidato vencedor: Candidato 1");
        }
           
    }
    public static void mensagem(int opcao){
        if(opcao == 0){
            System.out.println("Digite o código do candidato para o primeiro voto: ");
  
        }else if(opcao == 1){
            System.out.println("Digite o código do candidato para o segundo voto: ");
        }else if(opcao == 2){
            System.out.println("Digite o código do candidato para o terceiro voto: ");
        }else if(opcao == 3){
            System.out.println("Digite o código do candidato para o quarto voto: ");
        }else{
            System.out.println("Digite o código do candidato para o quinto voto: ");
        }     
    }    
    

    public static void adicionaVoto(int voto){
        switch(voto){
            case 1:
                candidato_A++;
                break;
            case 2:
                candidato_B++;
                break;
            case 3:
                candidato_C++;
                break;
            case 4:
                nulo++;
                break;
            default:
            break;
        }
    }
}
