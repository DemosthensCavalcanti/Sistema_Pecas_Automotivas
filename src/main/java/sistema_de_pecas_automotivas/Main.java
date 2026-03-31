import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque estoque = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);

        Peca p1 = new Peca("Vela de Ignicao", "V001", 45.90);
        Peca p2 = new Peca("Filtro de Oleo", "F002", 32.50);
        Peca p3 = new Peca("Pastilha de Freio", "P003", 120.00);

        estoque.adicionarPeca(p1);
        estoque.adicionarPeca(p2);
        estoque.adicionarPeca(p3);

        System.out.println("Estoque atual:");
        estoque.listarPecas();

        System.out.println("\nAplicando desconto na Vela...");
        p1.aplicarDesconto(10);
        System.out.println(p1);

        System.out.println("\n*** Teste de Busca ***");
        try {
            Peca encontrada = estoque.buscarPorCodigo("P003");
            System.out.println("Peca encontrada: " + encontrada.getNome());

            System.out.println("Buscando peca inexistente...");
            estoque.buscarPorCodigo("X999");
        } catch (PecaNaoEncontradaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("\n*** Cadastro pelo Terminal ***");
        try {
            System.out.print("Digite o preco da nova peca (apenas numeros e virgula): ");
            double precoLido = scanner.nextDouble();
            System.out.println("Preco registrado com sucesso: R$" + precoLido);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Formato invalido para o preco. Use valores numericos.");
        } finally {
            scanner.close();
        }
    }
}