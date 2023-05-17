package easy;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        
        //Exercicio02_easy
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy(); // instanciando a classe Exercicio02_easy
        String palavra = exercicio02_easy.retornaPalavra("Vinicius Barros");// fazendo uma chamada e salvando em uma variável
        System.out.println(palavra); // impressão no console

        //Exercicio03_easy
        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
        String segundoValor =  JOptionPane.showInputDialog("Digite o segundo valor");
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy(); // instanciando a classe Exercicio03_easy
        System.out.println(exercicio03_easy.retornaValorTrocado(primeiroValor, segundoValor)); //Faço a chamada e exibo o valor
    }

}