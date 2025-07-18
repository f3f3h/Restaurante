package Restaurante;

public class Restaurante {
    public static void main(String[] args) {
        Garcom garcom1 = new Garcom();
        garcom1.nome = "Carlos";
        garcom1.idade = 28;
        garcom1.baterPonto();
        garcom1.anotarPedido();
        garcom1.servirMesa();

        System.out.println();

        Cozinheiro cozinheiro1 = new Cozinheiro();
        cozinheiro1.nome = "Joana";
        cozinheiro1.especialidade = "Massas";
        cozinheiro1.baterPonto();
        cozinheiro1.prepararPrato();
        cozinheiro1.limparCozinha();
    }
}
