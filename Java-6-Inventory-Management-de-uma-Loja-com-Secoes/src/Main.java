import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lojinha com sessões
        // Aqui irei criar sessões para acessar as classes que corresponde

        int opcao;
        do {
            System.out.println("==== Lojinha do Dirceu: Quem não comprou, perdeu. ====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Visualizar Produtos de uma seção");
            System.out.println("0. Sair da loja");
            opcao = scanner.nextInt();
        }
    }
}