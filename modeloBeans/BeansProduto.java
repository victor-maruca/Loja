package modeloBeans;

public class BeansProduto {
    
    private int id;
    private String nome;
    private double custo;
    private double venda;
    private String codigo;
    private String unidade;
    private int quantidade;
    private int fornecedor;
    private String buscaPorNome;
    private String buscaPorCodigo;
    private String nomeAntigo;

    public String getNomeAntigo() {
        return nomeAntigo;
    }

    public void setNomeAntigo(String nomeAntigo) {
        this.nomeAntigo = nomeAntigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getBuscaPorNome() {
        return buscaPorNome;
    }

    public void setBuscaPorNome(String buscaPorNome) {
        this.buscaPorNome = buscaPorNome;
    }

    public String getBuscaPorCodigo() {
        return buscaPorCodigo;
    }

    public void setBuscaPorCodigo(String buscaPorCodigo) {
        this.buscaPorCodigo = buscaPorCodigo;
    }

    
    
}
