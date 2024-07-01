import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        while (true) {
            System.out.println("Loja de Produtos Variáveis:");
            System.out.println("1. Add Produto(s)");
            System.out.println("2. Remover Produto(s)");
            System.out.println("3. Ver Produto(s)");
            System.out.println("4. Sair do App");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 4) break;

            System.out.print("Digite a seção (0: Móveis, 1: Roupas, 2: Limpeza): ");
            int secao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código do produto: ");
                int cod = scanner.nextInt();
                scanner.nextLine(); // Consome uma nova linha
                System.out.print("Favor inserir o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Agora, insira a quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Por ultimo, o preço desejado: ");
                double preco = scanner.nextDouble();
                loja.addProduto(secao, cod, nome, quantidade, preco);
            } else if (opcao == 2) {
                System.out.print("Digite o código do produto para remover: ");
                int codigo = scanner.nextInt();
                loja.delProduto(secao, codigo);
            } else if (opcao == 3) {
                loja.verProdutos(secao);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}