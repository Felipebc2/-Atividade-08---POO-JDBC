```markdown
# Atividade 08 - CRUD de Produtos com JDBC

Este projeto implementa um CRUD (Create, Read, Update, Delete) para gerenciar produtos de um e-commerce utilizando Java, JDBC e MySQL.

## 🚀 Funcionalidades

- Inserir Produtos: Adiciona produtos ao banco de dados.
- Alterar Produtos: Atualiza os dados de produtos existentes.
- Excluir Produtos: Remove produtos do banco de dados.
- Listar Produtos: Exibe todos os produtos cadastrados.
- Detalhar Produtos: Mostra informações específicas de produtos selecionados.

---

## 🛠 Configuração do Banco de Dados

1. Certifique-se de que o MySQL está instalado e em execução na sua máquina.
2. Execute o script setup.sql para criar o banco de dados e a tabela necessários:
   ```
   ```bash
   mysql -u SEU_USUARIO -p < setup.sql
   ```
   Substitua `SEU_USUARIO` pelo seu nome de usuário do MySQL. Após executar, será criado o banco de dados `ecommerce` com a tabela `produto`.

### Estrutura da Tabela `produto`
| Campo       | Tipo               | Descrição                                |
|-------------|--------------------|------------------------------------------|
| `id`        | INT (AUTO_INCREMENT) | Identificador único do produto          |
| `tipo`      | VARCHAR(50)        | Categoria do produto (ex.: Informática) |
| `descricao` | TEXT               | Descrição detalhada do produto          |
| `peso`      | DECIMAL(10, 2)     | Peso do produto em kg                   |
| `quantidade`| INT                | Quantidade disponível no estoque        |
| `unidade`   | ENUM               | Unidade de medida (metro, litro, etc.)  |

---

## 🖥 Configuração do Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
   ```
2. Abra o projeto no **IntelliJ IDEA**.
3. Atualize as credenciais de conexão ao banco de dados no arquivo `DatabaseConnection.java`:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
   private static final String USER = "seu_usuario";
   private static final String PASSWORD = "sua_senha";
   ```

4. Adicione o driver JDBC do MySQL:
   - Baixe o arquivo JAR do [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/).
   - Adicione o arquivo JAR ao classpath do projeto.

5. Compile e execute a classe `Main` para testar o sistema.

---

## 📜 Como Executar

1. Execute o arquivo `setup.sql` no MySQL para criar a tabela e o banco de dados.
2. No IntelliJ, compile e execute o programa.
3. Use os logs no console para acompanhar as operações realizadas.

---

## 📂 Estrutura do Projeto

```
├── src/
│   ├── Main.java               # Classe principal
│   ├── DatabaseConnection.java # Gerencia a conexão com o banco de dados
│   ├── Produto.java            # Classe modelo para o produto
│   └── ProdutoDAO.java         # Contém os métodos CRUD para a tabela
│   └── Create.sql              # Script para criar a tabela no MySQL
└── README.md                   # Documentação do projeto
```

---

## ⚙️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **JDBC**: API para conexão com o banco de dados.
- **MySQL**: Banco de dados relacional para armazenamento dos dados.
- **IntelliJ IDEA**: IDE utilizada para desenvolvimento.

---

## 📖 Notas Importantes

- Certifique-se de que a porta padrão do MySQL é **3306**. Caso não seja, altere a URL de conexão no arquivo `DatabaseConnection.java`.
  
---
