package Restaurante;

public class Garcom implements Funcionario {
    String nome;
    int idade;

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public void executarTarefa() {
        System.out.println(nome + " está atendendo os clientes.");
    }

    void servirMesa() {
        System.out.println(nome + " está servindo a mesa.");
    }

    void anotarPedido() {
        System.out.println(nome + " está anotando o pedido.");
    }
}
