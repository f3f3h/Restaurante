package Restaurante;

public class Cozinheiro implements Funcionario {
    String nome;
    String especialidade;

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public void executarTarefa() {
        System.out.println(nome + " está cozinhando " + especialidade + ".");
    }

    void prepararPrato() {
        System.out.println(nome + " está preparando um prato especial de " + especialidade + ".");
    }

    void limparCozinha() {
        System.out.println(nome + " está limpando a cozinha.");
    }
}
