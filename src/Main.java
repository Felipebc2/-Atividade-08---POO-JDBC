import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        try {
            // Limpar a tabela
            produtoDAO.limparTabela();
            logger.info("Tabela de produtos limpa. Inserindo novos produtos...");

            // Inserir produtos
            produtoDAO.inserir(new Produto("Informática", "Notebook Dell", 2.5, 10, "kg"));
            produtoDAO.inserir(new Produto("Limpeza", "Detergente líquido", 1.0, 50, "litro"));
            produtoDAO.inserir(new Produto("Casa & Decoração", "Cortina blackout", 0.8, 15, "metro"));
            produtoDAO.inserir(new Produto("Informática", "Mouse gamer", 0.2, 20, "kg"));
            produtoDAO.inserir(new Produto("Casa & Decoração", "Piso laminado", 2.0, 100, "metro quadrado"));
            logger.info("Produtos inseridos com sucesso!");

            // Alterar produtos
            logger.info("Alterando produtos...");
            Produto produtoParaAlterar = produtoDAO.buscarPorId(1); // Alterando o produto com ID 1
            if (produtoParaAlterar != null) {
                produtoParaAlterar.setQuantidade(8); // Atualizando a quantidade
                produtoDAO.alterar(produtoParaAlterar);
                logger.info("Produto com ID 1 alterado com sucesso!");
            }

            Produto outroProdutoParaAlterar = produtoDAO.buscarPorId(3); // Alterando o produto com ID 3
            if (outroProdutoParaAlterar != null) {
                outroProdutoParaAlterar.setPeso(1.0); // Atualizando o peso
                produtoDAO.alterar(outroProdutoParaAlterar);
                logger.info("Produto com ID 3 alterado com sucesso!");
            }

            // Excluir produto
            logger.info("Excluindo produto...");
            produtoDAO.excluir(2); // Excluindo o produto com ID 2
            logger.info("Produto com ID 2 excluído com sucesso!");

            // Listar produtos
            logger.info("Listando produtos cadastrados...");
            List<Produto> produtos = produtoDAO.listar();
            produtos.forEach(System.out::println);

            // Exibir detalhes de produtos
            logger.info("Exibindo detalhes dos produtos...");
            Produto produtoDetalhado1 = produtoDAO.buscarPorId(1);
            Produto produtoDetalhado2 = produtoDAO.buscarPorId(3);

            if (produtoDetalhado1 != null) {
                System.out.println("Detalhes do produto 1: " + produtoDetalhado1);
            }
            if (produtoDetalhado2 != null) {
                System.out.println("Detalhes do produto 3: " + produtoDetalhado2);
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao acessar o banco de dados", e);
        }
    }
}
