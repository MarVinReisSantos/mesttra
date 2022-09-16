package Questao3.questao3.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do indivíduo 0%d: ", (i+1));
            pessoa.nome = sc.nextLine();
            System.out.print("Digite a idade do " + pessoa.nome + ": ");
            pessoa.idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o sexo do(a) " + pessoa.nome + ": ");
            pessoa.genero = sc.nextLine();
            System.out.print(pessoa.classificacao()); 
            pessoa.velho();
            System.out.println();
        }

        System.out.println("Total de crianças: " + pessoa.totalCrianças);
        System.out.println("Total de adolescentes: " + pessoa.totalAdolescentes);
        System.out.println("Total de adultos: " + pessoa.totalAdultos);
        System.out.println("Total de melhor idade: " + pessoa.totalMelhorIdade);

        System.out.println("\nO nome do indivíduo mais velho é: " + pessoa.nomeVelho);
        sc.close();
    }
}
