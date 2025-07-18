package Restaurante;

public class Chef extends FuncionarioRestaurante {
    String especialidade;

    void criarCardapio() {
        System.out.println(nome + " criou um novo cardápio de " + especialidade + ".");
    }
}
