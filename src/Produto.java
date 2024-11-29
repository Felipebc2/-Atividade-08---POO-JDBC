public class Produto {
    private int id;
    private String tipo;
    private String descricao;
    private double peso;
    private int quantidade;
    private String unidade;

    // Construtor sem ID (para inserção de novos produtos)
    public Produto(String tipo, String descricao, double peso, int quantidade, String unidade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    // Construtor com ID (para produtos já existentes no banco)
    public Produto(int id, String tipo, String descricao, double peso, int quantidade, String unidade) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public String getDescricao() { return descricao; }
    public double getPeso() { return peso; }
    public int getQuantidade() { return quantidade; }
    public String getUnidade() { return unidade; }


    public void setId(int id) { this.id = id; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void setUnidade(String unidade) {
        if (unidade.equals("metro") || unidade.equals("metro quadrado") || unidade.equals("litro") || unidade.equals("kg")) {
            this.unidade = unidade;
        } else {
            throw new IllegalArgumentException("Unidade inválida. Aceita apenas: metro, metro quadrado, litro ou kg.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", quantidade=" + quantidade +
                ", unidade='" + unidade + '\'' +
                '}';
    }
}
