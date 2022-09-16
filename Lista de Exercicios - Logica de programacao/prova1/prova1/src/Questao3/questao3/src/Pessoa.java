package Questao3.questao3.src;

public class Pessoa {
    int totalCrianças = 0, totalAdolescentes = 0, totalAdultos = 0, totalMelhorIdade = 0;
    String nome;
    String genero;
    int idade;
    String classificacao;

    String nomeVelho;
    int idadeVelho = 0;
    Pessoa(){

    }

    public String classificacao(){
        if(this.idade <= 13){
            classificacao = this.nome + " é criança.";
            totalCrianças++;
        }
        else if(this.idade <= 20){
            classificacao = this.nome + " é adolescente.";
            totalAdolescentes++;
        }
        else if(this.idade <= 50){
            classificacao = this.nome + " é adulto.";
            totalAdultos++;
        }
        else if(this.idade > 50){
            classificacao = this.nome + "  é da melhor idade.";
            totalMelhorIdade++;
        }
        
        
        return classificacao;
    }

    public void velho(){
        if(this.idade > this.idadeVelho){
            this.idadeVelho = this.idade;
            this.nomeVelho = nome;
        }
    }
}