package Restaurante;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Chef chef1 = new Chef();
        chef1.nome = "Luigi";
        chef1.salario = 5000.00;
        chef1.especialidade = "comida italiana";
        chef1.mostrarDados();
        chef1.criarCardapio();

        System.out.println();

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Fernanda";
        gerente1.salario = 7000.00;
        gerente1.mostrarDados();
        gerente1.supervisionar();
    }
}
