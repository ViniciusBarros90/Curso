package easy;

import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {

        // Exercicio02_easy
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy(); // instanciando a
        // classe Exercicio02_easy
        // String palavra = exercicio02_easy.retornaPalavra("Vinicius Barros");//
        // fazendo uma chamada e salvando em uma variável
        // System.out.println(palavra); // impressão no console

        // Exercicio03_easy
        // String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro
        // valor");
        // String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
        // Exercicio03_easy exercicio03_easy = new Exercicio03_easy(); // instanciando a
        // classe Exercicio03_easy
        // System.out.println(exercicio03_easy.retornaValorTrocado(primeiroValor,
        // segundoValor)); //Faço a chamada e exibo o valor

        // Exercicio04_easy
        // String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um
        // numero");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        // Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        // System.out.println("O dobro de " + numeroDigitado +" é "
        // +exercicio04_easy.calcularDobro(numeroDigitado));

        // Exercicio05_easy

        String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro número"); //leitura dos numeros digitados na tela
        String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo número");
        String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro número");

        int primeiroNumero = Integer.parseInt(primeiroDigitadoStg); //conversão de int para string
        int segundoNumero = Integer.parseInt(segundoDigitadoStg);
        int terceiroNumero = Integer.parseInt(terceiroDigitadoStg);

        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        System.out.println("A soma dos números digitados são: "+ exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A subtração dos números digitados são: "+ exercicio05_easy.subtracao(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A multiplicação dos números digitados são: "+ exercicio05_easy.multiplicacao(primeiroNumero, segundoNumero, terceiroNumero));
        int soma = exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero);
        System.out.println("A média dos números digitados são: "+ exercicio05_easy.media(soma));
    
}
    }


