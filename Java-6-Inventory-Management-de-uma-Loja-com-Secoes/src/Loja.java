class Loja {
    Produto[][] produtos = new Produto[3][20]; // 3 seções com até 10 produtos
    int[] produtoSecao = {0, 0, 0};

    void addProduto(int secao, int codigo, String nome, int quantidade, double preco) {
        Produto novoProduto = new Produto();
        novoProduto.cod = codigo;
        novoProduto.nome = nome;
        novoProduto.quantidade = quantidade;
        novoProduto.preco = preco;
        produtos[secao][produtoSecao[secao]] = novoProduto;
        produtoSecao[secao]++;
    }

    void delProduto(int secao, int codigo) {
        for (int i = 0; i < produtoSecao[secao]; i++) {
            if (produtos[secao][i].cod == codigo) {
                produtos[secao][i] = produtos[secao][produtoSecao[secao] - 1];
                produtos[secao][produtoSecao[secao] - 1] = null;
                produtoSecao[secao]--;
                break;
            }
        }
    }

    void verProdutos(int secao) {
        for (int i = 0; i < produtoSecao[secao]; i++) {
            System.out.println("Código: " + produtos[secao][i].cod);
            System.out.println("Nome: " + produtos[secao][i].nome);
            System.out.println("Quantidade: " + produtos[secao][i].quantidade);
            System.out.println("Preço: " + produtos[secao][i].preco);
            System.out.println();
        }
    }
}